package mes.com.dao;

/**
 * @Class Name : BoardVO.java
 * @Description : Board VO class
 * @Modification Information
 *
 * @author jeong
 * @since 2022-01-06
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class BoardVO extends BoardDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /** NO */
    private java.math.BigDecimal no;
    
    /** TITLE */
    private java.lang.String title;
    
    /** CONTENTS */
    private java.lang.String contents;
    
    /** WDATE */
    private java.util.Date wdate;
    
    public java.math.BigDecimal getNo() {
        return this.no;
    }
    
    public void setNo(java.math.BigDecimal no) {
        this.no = no;
    }
    
    public java.lang.String getTitle() {
        return this.title;
    }
    
    public void setTitle(java.lang.String title) {
        this.title = title;
    }
    
    public java.lang.String getContents() {
        return this.contents;
    }
    
    public void setContents(java.lang.String contents) {
        this.contents = contents;
    }
    
    public java.util.Date getWdate() {
        return this.wdate;
    }
    
    public void setWdate(java.util.Date wdate) {
        this.wdate = wdate;
    }
    
}
