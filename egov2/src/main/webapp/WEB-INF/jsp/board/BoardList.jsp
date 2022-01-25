<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
 /**
  * @Class Name : BoardList.jsp
  * @Description : Board List ?ôîÎ©?
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
<title>Î™©Î°ù</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
<script type="text/javaScript" language="javascript" defer="defer">
<!--
/* Í∏? ?àò?†ï ?ôîÎ©? function */


function fn_egov_select(no) {
	document.getElementById("listForm").no.value = no;
   	document.getElementById("listForm").action = "<c:url value='/board/updateBoardView.do'/>";
   	document.getElementById("listForm").submit();
}

/* Í∏? ?ì±Î°? ?ôîÎ©? function */
function fn_egov_addView() {
   	document.getElementById("listForm").action = "<c:url value='/board/addBoardView.do'/>";
   	document.getElementById("listForm").submit();		
}

/* pagination ?éò?ù¥Ïß? ÎßÅÌÅ¨ function */
function fn_egov_link_page(pageNo){
	document.getElementById("listForm").pageIndex.value = pageNo;
	document.getElementById("listForm").action = "<c:url value='/board/BoardList.do'/>";
   	document.getElementById("listForm").submit();
}

 // -->
</script>
</head>
<body>
<form:form commandName="searchVO" name="listForm" id="listForm" method="post">
	<input type="hidden" name="no" />
<div id="content_pop">
	<!-- ???ù¥?? -->
	<div id="title">
		<ul>
			<li><img src="<c:url value='/images/egovframework/example/title_dot.gif'/>" alt="title" /> List </li>
		</ul>
	</div>
	<!-- // ???ù¥?? -->
	<!-- List -->
	<div id="table">
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<colgroup>
								<col/>				
								<col/>				
								<col/>				
								<col/>				
							</colgroup>		  
			<tr>
								<th align="center">No</th>
								<th align="center">Title</th>
								<th align="center">Contents</th>
								<th align="center">Wdate</th>
							</tr>
			<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
													<td align="center" class="listtd"><a href="javascript:fn_egov_select('<c:out value="${result.no}"/>')"><c:out value="${result.no}"/></a>&nbsp;</td>
						<td align="center" class="listtd"><c:out value="${result.title}"/>&nbsp;</td>
						<td align="center" class="listtd"><c:out value="${result.contents}"/>&nbsp;</td>
						<td align="center" class="listtd"><c:out value="${result.wdate}"/>&nbsp;</td>
				    			</tr>
			</c:forEach>
		</table>
	</div>
	<!-- /List -->
	<div id="paging">
		<ui:pagination paginationInfo = "${paginationInfo}"
				   type="image"
				   jsFunction="fn_egov_link_page"
				   />
		<form:hidden path="pageIndex" />
	</div>
	<div id="sysbtn1">
		<ul>
			<li>
				<div id="sysbtn">
					<span class="btn_blue_l"><a href="javascript:fn_egov_addView();">?ì±Î°?</a><img src="<c:url value='/images/egovframework/example/btn_bg_r.gif'/>" alt="" />
					</span>
				</div>
			</li>
		</ul>
	</div>
</div>
</form:form>
</body>
</html>
