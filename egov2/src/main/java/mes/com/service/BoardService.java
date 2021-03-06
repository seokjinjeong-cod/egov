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
	 * BOARD? ?±λ‘ν?€.
	 * @param vo - ?±λ‘ν  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return ?±λ‘? κ²°κ³Ό
	 * @exception Exception
	 */
    String insertBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD? ?? ??€.
	 * @param vo - ?? ?  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return void?
	 * @exception Exception
	 */
    void updateBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD? ?­? ??€.
	 * @param vo - ?­? ?  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return void? 
	 * @exception Exception
	 */
    void deleteBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD? μ‘°ν??€.
	 * @param vo - μ‘°ν?  ? λ³΄κ? ?΄κΈ? BoardVO
	 * @return μ‘°ν? BOARD
	 * @exception Exception
	 */
    BoardVO selectBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD λͺ©λ‘? μ‘°ν??€.
	 * @param searchVO - μ‘°ν?  ? λ³΄κ? ?΄κΈ? VO
	 * @return BOARD λͺ©λ‘
	 * @exception Exception
	 */
    List selectBoardList(BoardDefaultVO searchVO) throws Exception;
    
    /**
	 * BOARD μ΄? κ°??λ₯? μ‘°ν??€.
	 * @param searchVO - μ‘°ν?  ? λ³΄κ? ?΄κΈ? VO
	 * @return BOARD μ΄? κ°??
	 * @exception
	 */
    int selectBoardListTotCnt(BoardDefaultVO searchVO);
    
}
