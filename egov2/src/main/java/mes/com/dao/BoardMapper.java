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
	 * BOARD?�� ?��록한?��.
	 * @param vo - ?��록할 ?��보�? ?���? BoardVO
	 * @return ?���? 결과
	 * @exception Exception
	 */
    public void insertBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD?�� ?��?��?��?��.
	 * @param vo - ?��?��?�� ?��보�? ?���? BoardVO
	 * @return void?��
	 * @exception Exception
	 */
    public void updateBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD?�� ?��?��?��?��.
	 * @param vo - ?��?��?�� ?��보�? ?���? BoardVO
	 * @return void?�� 
	 * @exception Exception
	 */
    public void deleteBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD?�� 조회?��?��.
	 * @param vo - 조회?�� ?��보�? ?���? BoardVO
	 * @return 조회?�� BOARD
	 * @exception Exception
	 */
    public BoardVO selectBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD 목록?�� 조회?��?��.
	 * @param searchMap - 조회?�� ?��보�? ?���? Map
	 * @return BOARD 목록
	 * @exception Exception
	 */
    public List<?> selectBoardList(BoardDefaultVO searchVO) throws Exception;

    /**
	 * BOARD �? �??���? 조회?��?��.
	 * @param searchMap - 조회?�� ?��보�? ?���? Map
	 * @return BOARD �? �??��
	 * @exception
	 */
    public int selectBoardListTotCnt(BoardDefaultVO searchVO);

}
