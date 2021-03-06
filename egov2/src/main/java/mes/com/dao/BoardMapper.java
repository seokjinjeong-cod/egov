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
	 * BOARD? ?±λ‘ν?€.
	 * @param vo - ?±λ‘ν  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return ?±λ‘? κ²°κ³Ό
	 * @exception Exception
	 */
    public void insertBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD? ?? ??€.
	 * @param vo - ?? ?  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return void?
	 * @exception Exception
	 */
    public void updateBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD? ?­? ??€.
	 * @param vo - ?­? ?  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return void? 
	 * @exception Exception
	 */
    public void deleteBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD? μ‘°ν??€.
	 * @param vo - μ‘°ν?  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return μ‘°ν? BOARD
	 * @exception Exception
	 */
    public BoardVO selectBoard(BoardVO vo) throws Exception;

    /**
	 * BOARD λͺ©λ‘? μ‘°ν??€.
	 * @param searchMap - μ‘°ν?  ? λ³΄κ? ?΄κΈ? Map
	 * @return BOARD λͺ©λ‘
	 * @exception Exception
	 */
    public List<?> selectBoardList(BoardDefaultVO searchVO) throws Exception;

    /**
	 * BOARD μ΄? κ°??λ₯? μ‘°ν??€.
	 * @param searchMap - μ‘°ν?  ? λ³΄κ? ?΄κΈ? Map
	 * @return BOARD μ΄? κ°??
	 * @exception
	 */
    public int selectBoardListTotCnt(BoardDefaultVO searchVO);

}
