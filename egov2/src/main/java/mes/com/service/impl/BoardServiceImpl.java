package mes.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import mes.com.dao.BoardDefaultVO;
import mes.com.dao.BoardMapper;
import mes.com.dao.BoardVO;
import mes.com.service.BoardService;
/**
 * @Class Name : BoardServiceImpl.java
 * @Description : Board Business Implement class
 * @Modification Information
 *
 * @author jeong
 * @since 2022-01-06
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements
        BoardService {
        
    private static final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);

    @Resource(name="boardMapper")
    private BoardMapper boardDAO;
    
    //@Resource(name="boardDAO")
    //private BoardDAO boardDAO;
    
    /** ID Generation */
    //@Resource(name="{egovBoardIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * BOARD?�� ?��록한?��.
	 * @param vo - ?��록할 ?��보�? ?���? BoardVO
	 * @return ?���? 결과
	 * @exception Exception
	 */
    public String insertBoard(BoardVO vo) throws Exception {
    	LOGGER.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO ?��?�� ?��?���? ?��?��?�� ?��?�� ID ?��?��?��?��?�� ?��비스 ?��?��
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	LOGGER.debug(vo.toString());
    	
    	boardDAO.insertBoard(vo);
    	//TODO ?��?�� ?��?���? ?��보에 맞게 ?��?��    	
        return null;
    }

    /**
	 * BOARD?�� ?��?��?��?��.
	 * @param vo - ?��?��?�� ?��보�? ?���? BoardVO
	 * @return void?��
	 * @exception Exception
	 */
    public void updateBoard(BoardVO vo) throws Exception {
        boardDAO.updateBoard(vo);
    }

    /**
	 * BOARD?�� ?��?��?��?��.
	 * @param vo - ?��?��?�� ?��보�? ?���? BoardVO
	 * @return void?�� 
	 * @exception Exception
	 */
    public void deleteBoard(BoardVO vo) throws Exception {
        boardDAO.deleteBoard(vo);
    }

    /**
	 * BOARD?�� 조회?��?��.
	 * @param vo - 조회?�� ?��보�? ?���? BoardVO
	 * @return 조회?�� BOARD
	 * @exception Exception
	 */
    public BoardVO selectBoard(BoardVO vo) throws Exception {
        BoardVO resultVO = boardDAO.selectBoard(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * BOARD 목록?�� 조회?��?��.
	 * @param searchVO - 조회?�� ?��보�? ?���? VO
	 * @return BOARD 목록
	 * @exception Exception
	 */
    public List<?> selectBoardList(BoardDefaultVO searchVO) throws Exception {
        return boardDAO.selectBoardList(searchVO);
    }

    /**
	 * BOARD �? �??���? 조회?��?��.
	 * @param searchVO - 조회?�� ?��보�? ?���? VO
	 * @return BOARD �? �??��
	 * @exception
	 */
    public int selectBoardListTotCnt(BoardDefaultVO searchVO) {
		return boardDAO.selectBoardListTotCnt(searchVO);
	}
    
}
