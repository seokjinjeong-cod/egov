<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : BoardRegister.jsp
  * @Description : Board Register ?™”ë©?
  * @Modification Information
  * 
  * @author jeong
  * @since 2022-01-06
  * @version 1.0
  * @see
  *  
  * Copyright (C) All right reserved.
  */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<c:set var="registerFlag" value="${empty boardVO.no ? '?“±ë¡?' : '?ˆ˜? •'}"/>

<title> <c:out value="${registerFlag}"/> </title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>

<!--For Commons Validator Client Side-->
<!-- script type="text/javascript" src="<c:url value='/cmmn/validator.do'/>"></script -->
<!-- validator:javascript formName="boardVO" staticJavascript="false" xhtml="true" cdata="false"/ -->

<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* ê¸? ëª©ë¡ ?™”ë©? function */
function fn_egov_selectList() {
   	document.getElementById("detailForm").action = "<c:url value='/board/BoardList.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* ê¸? ?‚­? œ function */
function fn_egov_delete() {
   	document.getElementById("detailForm").action = "<c:url value='/board/deleteBoard.do'/>";
   	document.getElementById("detailForm").submit();		
}

/* ê¸? ?“±ë¡? function */
function fn_egov_save() {	
	frm = document.getElementById("detailForm");

	/* TODO Validationê¸°ëŠ¥ ë³´ì™„ */
	
  	frm.action = "<c:url value="${registerFlag == '?“±ë¡?' ? '/board/addBoard.do' : '/board/updateBoard.do'}"/>";
    frm.submit();

}

// -->
</script>
</head>
<body>

<form:form commandName="boardVO" name="detailForm" id="detailForm" >
<div id="content_pop">
	<!-- ???´?? -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images//title_dot.gif'/>" alt="" /><c:out value="${registerFlag}"/></li>
		</ul>
	</div>
	<!-- // ???´?? -->
	<div id="table">
	<table width="100%" border="1" cellpadding="0" cellspacing="0" >
		<colgroup>
			<col width="150"/>
			<col width=""/>
		</colgroup>
			
		<c:if test="${registerFlag == '?ˆ˜? •'}">
	   <tr>
			<th>NO *</th>
			<td>
				<form:input path="no" cssClass="essentiality" readonly="true" />
			</td>			
		</tr>	
		</c:if>
		<c:if test="${registerFlag == '?“±ë¡?'}">
	   <tr>
			<th>NO *</th>
			<td>
				<form:input path="no" cssClass="txt" readonly="false" />
			</td>			
		</tr>	
		</c:if>		
		<tr>
			<th>TITLE</th>
			<td>
				<form:input path="title" cssClass="txt"/>
				&nbsp;<form:errors path="title" />
			</td>
		</tr>	
		<tr>
			<th>CONTENTS</th>
			<td>
				<form:input path="contents" cssClass="txt"/>
				&nbsp;<form:errors path="contents" />
			</td>
		</tr>	
		<tr>
			<th>WDATE</th>
			<td>
				<form:input path="wdate" cssClass="txt"/>
				&nbsp;<form:errors path="wdate" />
			</td>
		</tr>	
	</table>
  </div>
	<div id="sysbtn">
		<ul>
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_selectList();">List</a><img src="<c:url value='/images//btn_bg_r.gif'/>" alt="" /></span></li>
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_save();"><c:out value='${registerFlag}'/></a><img src="<c:url value='/images//btn_bg_r.gif'/>" alt="" /></span></li>
			<c:if test="${registerFlag == '?ˆ˜? •'}">
			<li><span class="btn_blue_l"><a href="javascript:fn_egov_delete();">?‚­? œ</a><img src="<c:url value='/images//btn_bg_r.gif'/>" alt="" /></span></li>
			</c:if>
			<li><span class="btn_blue_l"><a href="javascript:document.detailForm.reset();">Reset</a><img src="<c:url value='/images//btn_bg_r.gif'/>" alt="" /></span></li></ul>
	</div>
</div>
<!-- ê²??ƒ‰ì¡°ê±´ ?œ ì§? -->
<input type="hidden" name="searchCondition" value="<c:out value='${searchVO.searchCondition}'/>"/>
<input type="hidden" name="searchKeyword" value="<c:out value='${searchVO.searchKeyword}'/>"/>
<input type="hidden" name="pageIndex" value="<c:out value='${searchVO.pageIndex}'/>"/>
</form:form>
</body>
</html>

