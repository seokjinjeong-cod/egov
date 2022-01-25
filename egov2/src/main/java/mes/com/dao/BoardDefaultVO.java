package mes.com.dao;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @Class Name : BoardDefaultVO.java
 * @Description : Board Default VO class
 * @Modification Information
 *
 * @author jeong
 * @since 2022-01-06
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class BoardDefaultVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** Í≤??ÉâÏ°∞Í±¥ */
    private String searchCondition = "";
    
    /** Í≤??ÉâKeyword */
    private String searchKeyword = "";
    
    /** Í≤??Éâ?Ç¨?ö©?ó¨Î∂? */
    private String searchUseYn = "";
    
    /** ?òÑ?û¨?éò?ù¥Ïß? */
    private int pageIndex = 1;
    
    /** ?éò?ù¥Ïß?Í∞??àò */
    private int pageUnit = 10;
    
    /** ?éò?ù¥Ïß??Ç¨?ù¥Ï¶? */
    private int pageSize = 10;

    /** firstIndex */
    private int firstIndex = 1;

    /** lastIndex */
    private int lastIndex = 1;

    /** recordCountPerPage */
    private int recordCountPerPage = 10;
    
        
	public int getFirstIndex() {
		return firstIndex;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	public int getLastIndex() {
		return lastIndex;
	}

	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public String getSearchUseYn() {
        return searchUseYn;
    }

    public void setSearchUseYn(String searchUseYn) {
        this.searchUseYn = searchUseYn;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageUnit() {
        return pageUnit;
    }

    public void setPageUnit(int pageUnit) {
        this.pageUnit = pageUnit;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
