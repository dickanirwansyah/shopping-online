<div class="container">

   <!-- breadcrumb -->
	<div class="row">
	
	
		<div class="col-xs-12">
		
		
			<ol class="breadcrumb">
				<li>
					<a href="${contextRoot}/">Home</a>
				</li>
				<li>
					<a href="${contextRoot}/show/all/products">Products</a>
				</li>
				<li class="active">
					${product.name}
				</li>
			</ol>
		
		</div>
		
	
	</div>
	
	<!-- TAMPILKA PRODUCT -->
	<div class="row">
	
		<!-- gambar product -->
		<div class="col-xs-12 col-sm-4">
		
			<div class="thumbnail">
			
				<img src="${image}/${product.code}.jpg" class="img img-responsive"/>
				
			</div>
			
		
		</div>
	
		<!-- deskripsi product -->
		<div class="col-xs-12 col-sm-8">
		
			<h3>${product.name}</h3>
			<hr/>
			<p>${product.description}</p>
			<hr/>
			<h4>Harga unit : <strong>Rp.- ${product.unitprice} /-</strong></h4>
			<hr/>
			<h6>Telah dilihat sebanyak : <strong>${product.views} kali</strong></h6>
			<hr/>
			
			<!-- Logic ketika barang 0 jumlah out of stock -->
			<c:choose>
				<c:when test="${product.quantity < 1}">
					<h6>Stock : <span style="color:red"><strong>Out Of Stock !</strong></span></h6>
				</c:when>
				<c:otherwise>
				    <h6>Jumlah Stock Barang saat ini : <strong> ${product.quantity}</strong></h6>
				</c:otherwise>
			</c:choose>
			<!-- Logic ketika barang 0 jumlah out of stock -->
			
			<!-- Logic ketika barang 0 button cart disable -->
			<c:choose>
				<c:when test="${product.quantity < 1}">
					<a href="javascript:void(0)" class="btn btn-success disable">
						<strike>
						<span class="glyphicon glyphicon-shopping-cart"></span>
						Add To Cart
						</strike>
					</a>
				</c:when>
				<c:otherwise>
					<a href="${contextRoot}/cart/add/${product.id}/products" class="btn btn-success">
					<span class="glyphicon glyphicon-shopping-cart"></span>
					Add To Cart
					</a>
				</c:otherwise>
			</c:choose>
			<!-- Logic Ketika barang 0 button cart disable -->
			
			<a href="${contextRoot}/show/all/products" class="btn btn-default">
				<span class="glyphicon glyphicon-circle-arrow-right"></span>
				Kembali
			</a>
			
		</div>
	
	</div>

</div>