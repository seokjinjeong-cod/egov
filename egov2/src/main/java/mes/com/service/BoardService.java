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
	 * BOARD?�� ?��록한?��.
	 * @param vo - ?��록할 ?��보�? ?���? BoardVO
	 * @return ?���? 결과
	 * @exception Exception
	 */
    String insertBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD?�� ?��?��?��?��.
	 * @param vo - ?��?��?�� ?��보�? ?���? BoardVO
	 * @return void?��
	 * @exception Exception
	 */
    void updateBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD?�� ?��?��?��?��.
	 * @param vo - ?��?��?�� ?��보�? ?���? BoardVO
	 * @return void?�� 
	 * @exception Exception
	 */
    void deleteBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD?�� 조회?��?��.
	 * @param vo - 조회?�� ?��보�? ?���? BoardVO
	 * @return 조회?�� BOARD
	 * @exception Exception
	 */
    BoardVO selectBoard(BoardVO vo) throws Exception;
    
    /**
	 * BOARD 목록?�� 조회?��?��.
	 * @param searchVO - 조회?�� ?��보�? ?���? VO
	 * @return BOARD 목록
	 * @exception Exception
	 */
    List selectBoardList(BoardDefaultVO searchVO) throws Exception;
    
    /**
	 * BOARD �? �??���? 조회?��?��.
	 * @param searchVO - 조회?�� ?��보�? ?���? VO
	 * @return BOARD �? �??��
	 * @exception
	 */
    int selectBoardListTotCnt(BoardDefaultVO searchVO);
    
}
