<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- CONTEXT ROOT PAGES -->
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/> 
  
<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="image" value="/resources/image"/>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BelanjaBelanja.com - ${title}</title>
<!-- CUSTOM CSS -->
<link href="${css }/myapp.css" rel="stylesheet"/>

<!-- BOOTSTRAP CSS -->
<link href="${css }/bootstrap.min.css" rel="stylesheet"/>

<!-- THEMES TEMPLATE -->
<link href="${css }/themes-template.css" rel="stylesheet"/>

<!-- DATA TABLES CSS -->
<link href="${css }/dataTables.bootstrap.css" rel="stylesheet"/>

<link href="${css }/dataTables.bootstrap.min.css" rel="stylesheet"/>

<!-- ACTIVE MENU -->
<script>

	window.menu = "${title}";
	
	window.contextRoot = "${contextRoot}"
</script>
</head>
<body>
	<div class="wrapper">
	
		<%@include file="./layout/navbar.jsp" %>
		
		<div class="content">
		
		<!-- USER CLICK HOME -->
		<c:if test="${userClickHome == true }">
			<%@include file="home.jsp" %>
		</c:if>
		<!-- USER CLICK HOME -->	
		
		<!-- USER CLICK SINGLE PRODUCT -->
		<c:if test="${userClickOneProduct == true}">
			<%@include file="singleproduct.jsp"%>
		</c:if>
		<!-- USER CLICK SINGLE PRODUCT -->
		
		<!-- USER CLICK ABOUT US -->
		<c:if test="${userClickAbout ==true }">
			<%@include file="about.jsp" %>
		</c:if>
		<!-- USER CLICK ABOUT US -->
		
		<!-- USER CLICK ALL PRODUCT -->
		<c:if test="${userClickAllProduct == true or userClickCategoryProduct == true}">
			<%@include file="products.jsp" %>
		</c:if>
		<!-- USER CLICK ALL PRODUCT -->
		
		<!-- USER CLICK MANAGE PRODUCT -->
		<c:if test="${userClickManageProduct== true }">
			<%@include file="ManageProducts.jsp" %>
		</c:if>
		<!-- USER CLICK MANAGE PRODUCT -->
		
		
		<!-- USER CLICK CONTACT US -->
		<c:if test="${userClickContact ==true }">
			<%@include file="contact.jsp" %>
		</c:if>
		<!-- USER CLICK CONTACT US -->
		
		</div>
	
		<%@include file="./layout/footer.jsp" %>
		
		<!-- JQUERY -->
		<script src="${js }/jQuery.js"></script>
		
		<!-- JQUERY DATATABLES -->
		<script src="${js }/jquery.dataTables.js"></script>
		
		<!-- DATA TABLES JS -->
		<script src="${js }/dataTables.bootstrap.js"></script>
		
		<script src="${js }/dataTables.bootstrap.min.js"></script>
		
		<!-- BOTSTRAP -->
		<script src="${js }/bootstrap.js"></script>
		
		<!-- CUSTOM JS -->
		<script src="${js }/myapp.js"></script>
		
		<!-- BOOTSTRAP MIN JS -->
		<script src="${js }/bootstrap.min.js"></script>
	
</body>
	</div>
</html>