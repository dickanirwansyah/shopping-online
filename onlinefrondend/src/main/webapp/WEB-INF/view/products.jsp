<div class="container">

		<div class="row">
	
			<!-- SIDEBAR -->
			<div class="col-md-3">
			
				<%@include file="./layout/sidebar.jsp" %>
			
			</div>
	
			<!-- PROSES DISPLAY -->
			<div class="col-md-9">
			
			<!-- Membuat Breadcrumb -->
				<div class="row">
				
					<div class="col-lg-12">
					
						<c:if test="${userClickAllProduct == true}">
						
							<script>
					    		window.categoryId = '';
					    	</script>
						
						<ol class="breadcrumb">
						
							<li>
								<a href="${contextRoot}/home">Home</a>
							</li>
							<li class="active">All Products</li>
							
						</ol>
					    </c:if>
					    
					    <c:if test="${userClickCategoryProduct == true }">
					 
							 <script>
					    		window.categoryId = '${category.id}';
					    	</script>
					 		   
					    <ol class="breadcrumb">
					    	<li>
					    		<a href="${contextRoot}/home">Home</a>
					    	</li>
					    	<li class="active">Category</li>
					    	<li class="active">${category.name}</li>
					    </ol>
					    </c:if>
					    
					</div>
				
				</div>
				
				<!-- PRODUCT LIST -->
			    <div class="row">
			    
			    	<div class="col-xs-12">
			    	
			    		<table id="TableListProduct" class="table table-bordered table-striped table-condensed">
			    		
			    			<thead>
			    				
			    				<tr>
			    					<th></th>
			    					<th>Nama</th>
			    					<th>Merk</th>
			    					<th>Harga Unit</th>
			    					<th>Jumlah Stock</th>
			    					<th>Action</th>
			    				</tr>
			    				
			    			</thead>
			    			<tfoot>
			    			
			    				<tr>
			    					<th></th>
			    					<th>Nama</th>
			    					<th>Merk</th>
			    					<th>Harga Unit</th>
			    					<th>Jumlah Stock</th>
			    					<th>Action</th>
			    				</tr> 
			    			
			    			</tfoot>
			    		
			    		</table>
			    	
			    	</div>
			    
			    </div>
			</div>
	
		</div>

</div>