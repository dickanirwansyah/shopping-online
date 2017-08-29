<p class="lead">Find By Category</p>

<div class="list-group">

	<c:forEach items="${listcategory}" var="category">
	
		<a href="${contextRoot}/show/category/${category.id}/products" 
		class="list-group-item"
		id="a_${category.name}"
		>${category.name}</a>
		
	</c:forEach>

</div>