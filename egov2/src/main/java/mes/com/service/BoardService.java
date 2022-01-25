package mes.com.service;

import java.util.List;
import mes.com.dao.BoardDefaultVO;
import mes.com.dao.BoardVO;

/**
 * @Class Name : BoardService.java
 * @Description : Board Business class
 * @Modification Information
 *
 * @author jeong
 * @since 2022-01-06
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface BoardService {
	
	/**
	 * BOARD?„ ?“±ë¡í•œ?‹¤.
	 * @param vo - ?“±ë¡í•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return ?“±ë¡? ê²°ê³¼
	 * @exception Exception
	 */
    String insertBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD?„ ?ˆ˜? •?•œ?‹¤.
	 * @param vo - ?ˆ˜? •?•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return void?˜•
	 * @exception Exception
	 */
    void updateBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD?„ ?‚­? œ?•œ?‹¤.
	 * @param vo - ?‚­? œ?•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return void?˜• 
	 * @exception Exception
	 */
    void deleteBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD?„ ì¡°íšŒ?•œ?‹¤.
	 * @param vo - ì¡°íšŒ?•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return ì¡°íšŒ?•œ BOARD
	 * @exception Exception
	 */
    BoardVO selectBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD ëª©ë¡?„ ì¡°íšŒ?•œ?‹¤.
	 * @param searchVO - ì¡°íšŒ?•  ? •ë³´ê? ?‹´ê¸? VO
	 * @return BOARD ëª©ë¡
	 * @exception Exception
	 */
    List selectBoardList(BoardDefaultVO searchVO) throws Exception;
    
    /**
	 * BOARD ì´? ê°??ˆ˜ë¥? ì¡°íšŒ?•œ?‹¤.
	 * @param searchVO - ì¡°íšŒ?•  ? •ë³´ê? ?‹´ê¸? VO
	 * @return BOARD ì´? ê°??ˆ˜
	 * @exception
	 */
    int selectBoardListTotCnt(BoardDefaultVO searchVO);
    
}
