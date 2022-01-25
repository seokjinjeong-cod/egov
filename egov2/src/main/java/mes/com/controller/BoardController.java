package mes.com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import mes.com.dao.BoardDefaultVO;
import mes.com.dao.BoardVO;
import mes.com.service.BoardService;

/**
 * @Class Name : BoardController.java
 * @Description : Board Controller class
 * @Modification Information
 *
 * @author jeong
 * @since 2022-01-06
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=BoardVO.class)
public class BoardController {

    @Resource(name = "boardService")
    private BoardService boardService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * BOARD 목록?�� 조회?��?��. (pageing)
	 * @param searchVO - 조회?�� ?��보�? ?���? BoardDefaultVO
	 * @return "/board/BoardList"
	 * @exception Exception
	 */
    @RequestMapping(value="/board/BoardList.do")
    public String selectBoardList(@ModelAttribute("searchVO") BoardDefaultVO searchVO, 
    		ModelMap model) {
    	
    	/** EgovPropertyService.sample */
    	searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
    	searchVO.setPageSize(propertiesService.getInt("pageSize"));
    	
    	/** pageing */
    	PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setPageSize(searchVO.getPageSize());
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
        List<?> boardList = null;
		try {
			boardList = boardService.selectBoardList(searchVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
        model.addAttribute("resultList", boardList);
        
        int totCnt = boardService.selectBoardListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/board/BoardList";
    } 
    
    @RequestMapping("/board/addBoardView.do")
    public String addBoardView(
            @ModelAttribute("searchVO") BoardDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("boardVO", new BoardVO());
        return "/board/BoardRegister";
    }
    
    @RequestMapping("/board/addBoard.do")
    public String addBoard(
            BoardVO boardVO,
            @ModelAttribute("searchVO") BoardDefaultVO searchVO, SessionStatus status)
            throws Exception {
        boardService.insertBoard(boardVO);
        status.setComplete();
        return "forward:/board/BoardList.do";
    }
    
    @RequestMapping("/board/updateBoardView.do")
    public String updateBoardView(
            @RequestParam("no") java.math.BigDecimal no ,
            @ModelAttribute("searchVO") BoardDefaultVO searchVO, Model model)
            throws Exception {
        BoardVO boardVO = new BoardVO();
        boardVO.setNo(no);
        // �??��명�? CoC ?�� ?��?�� boardVO
        model.addAttribute(selectBoard(boardVO, searchVO));
        return "/board/BoardRegister";
    }

    @RequestMapping("/board/selectBoard.do")
    public @ModelAttribute("boardVO")
    BoardVO selectBoard(
            BoardVO boardVO,
            @ModelAttribute("searchVO") BoardDefaultVO searchVO) throws Exception {
        return boardService.selectBoard(boardVO);
    }

    @RequestMapping("/board/updateBoard.do")
    public String updateBoard(
            BoardVO boardVO,
            @ModelAttribute("searchVO") BoardDefaultVO searchVO, SessionStatus status)
            throws Exception {
        boardService.updateBoard(boardVO);
        status.setComplete();
        return "forward:/board/BoardList.do";
    }
    
    @RequestMapping("/board/deleteBoard.do")
    public String deleteBoard(
            BoardVO boardVO,
            @ModelAttribute("searchVO") BoardDefaultVO searchVO, SessionStatus status)
            throws Exception {
        boardService.deleteBoard(boardVO);
        status.setComplete();
        return "forward:/board/BoardList.do";
    }

}
