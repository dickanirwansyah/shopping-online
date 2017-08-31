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


</head>
<body>
	<div class="wrapper">
	
		<nav class="navbar navbar-inverse navbar-fixed-top">
		
			<ul class="navbar navbar-nav">
			
				<a href="${contextRoot}/home" class="navbar-brand">BelanjaBelanja.com</a>
			
			</ul>
		
		</nav>
		
		
		<div class="content">
		
			<div class="container">
			
				<div class="row">
				
					<div class="col-xs-12">
					
						<div class="jumbotron">
						
							<h1>${description }</h1>
							<hr/>
							<blockquote>
								${titleError}
							</blockquote>
						</div>
					
					</div>
				
				</div>
			
			
			</div>
		
		
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