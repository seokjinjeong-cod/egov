package mes.com.dao;

import java.util.List;

import mes.com.dao.BoardVO;
import mes.com.dao.BoardDefaultVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * @Class Name : BoardMapper.java
 * @Description : Board Mapper Class
 * @Modification Information
 *
 * @author jeong
 * @since 2022-01-06
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Mapper("boardMapper")
public interface BoardMapper {

	/**
	 * BOARD?„ ?“±ë¡í•œ?‹¤.
	 * @param vo - ?“±ë¡í•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return ?“±ë¡? ê²°ê³¼
	 * @exception Exception
	 */
    public void insertBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD?„ ?ˆ˜? •?•œ?‹¤.
	 * @param vo - ?ˆ˜? •?•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return void?˜•
	 * @exception Exception
	 */
    public void updateBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD?„ ?‚­? œ?•œ?‹¤.
	 * @param vo - ?‚­? œ?•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return void?˜• 
	 * @exception Exception
	 */
    public void deleteBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD?„ ì¡°íšŒ?•œ?‹¤.
	 * @param vo - ì¡°íšŒ?•  ? •ë³´ê? ?‹´ê¸? BoardVO
	 * @return ì¡°íšŒ?•œ BOARD
	 * @exception Exception
	 */
    public BoardVO selectBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD ëª©ë¡?„ ì¡°íšŒ?•œ?‹¤.
	 * @param searchMap - ì¡°íšŒ?•  ? •ë³´ê? ?‹´ê¸? Map
	 * @return BOARD ëª©ë¡
	 * @exception Exception
	 */
    public List<?> selectBoardList(BoardDefaultVO searchVO) throws Exception;

    /**
	 * BOARD ì´? ê°??ˆ˜ë¥? ì¡°íšŒ?•œ?‹¤.
	 * @param searchMap - ì¡°íšŒ?•  ? •ë³´ê? ?‹´ê¸? Map
	 * @return BOARD ì´? ê°??ˆ˜
	 * @exception
	 */
    public int selectBoardListTotCnt(BoardDefaultVO searchVO);

}
