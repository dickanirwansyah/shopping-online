<%@taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<!-- FORM SPRING -->
<div class="container">

	<div class="row">
	
	<!-- VALIDASI MESSAGE SUCCESS -->
		<c:if test="${not empty message }">
		<div class="col-xs-12">
			<div class="alert alert-success alert-dismissible">
				<button class="close" type="button" data-dismiss="alert">&times;</button>
				${message }
			</div>
		</div>
		</c:if>
	<!-- VALIDASI MESSAGE SUCCESS -->
	
			<div class="col-md-offset-2 col-md-8">
			
			
				<div class="panel panel-success">
				
						<div class="panel-heading">
						
							<h4>Manage Products</h4>
						
						</div>
	     				
	     				<div class="panel-body">
	     				
	     					<!-- FORM ELEMET MANAJEMEN PRODUCT -->
	     					
	     					<springform:form class="form-horizontal" modelAttribute="product" 
	     					action="${contextRoot}/manage/products" method="POST" 
	     					enctype="multipart/form-data">
	     					
	     						<div class="form-group">
	     						
	     							<label class="col-lg-3 control-label" for="name">Name Product :</label>
	     							<div class="col-md-8">
	     							
	     								<springform:input type="text" class="form-control" path="name" id="name" placeholder="Name Product" />
	     								<!-- VALIDASI -->
	     							  	<springform:errors path="name" cssClass="help-block" element="em"/>
	     							</div>
	     						</div>
	     						
	     						<div class="form-group">
	     						
	     							<label class="col-lg-3 control-label" for="brand">Brand Product :</label>
	     							<div class="col-md-8">
	     							
	     								<springform:input type="text" class="form-control" path="brand" id="brand" placeholder="Brand Product" />
	     								<!-- VALIDASI -->
	     								<springform:errors path="brand" cssClass="help-block" element="em"/>
	     							</div>
	     						
	     						</div>
	     						
	     						<div class="form-group">
	     						
	     							<label class="col-lg-3 control-label" for="description">Description Product :</label>
	     							<div class="col-md-8">
	     							
	     								<springform:input type="text" class="form-control" path="description" id="description" placeholder="Description Of Product" />
	     							    <!-- VALIDASI -->
	     							    <springform:errors path="description" cssClass="help-block" element="em"/>
	     							</div>
	     						
	     						</div>
	     						
	     						<div class="form-group">
	     						
	     							<label class="col-lg-3 control-label" for="unitprice">Price Product :</label>
	     							<div class="col-md-8">
	     							
	     								<springform:input type="number" class="form-control" path="unitprice" id="unitprice" placeholder="Unit Price in Rp.." />
	     								<!-- VALIDASI -->
	     								<springform:errors path="unitprice" cssClass="help-block" element="em"/>	
	     							
	     							</div>
	     						
	     						</div>
	     						
	     						<div class="form-group">
	     						
	     							<label class="col-lg-3 control-label" for="quantity">Quantity Price</label>
	     							<div class="col-md-8">
	     							
	     								<springform:input type="number" class="form-control" path="quantity" id="quantity" placeholder="Quantity Of Product"/>
	     								<!-- VALIDASI -->
	     								<springform:errors path="quantity" cssClass="help-block" element="em"/>
	     							</div>
	     						</div>
	     						
	     						<!-- FILE ELEMEN FOR IMAGE UPLOAD -->
	     						<div class="form-group">
	     							<label class="col-lg-3 control-label" for="file">Select Image :</label>
	     							<div class="col-md-8">
	     								<springform:input type="file" class="form-control" path="file" id="file"/>
	     							</div>
	     						</div>
	     						<!-- FILE ELEMEN FOR IMAGE UPLOAD -->
	     						
	     						<div class="form-group">
	     						
	     							<label class="col-lg-3 control-label" for="category_id">Category Product:</label>
	     							<div class="col-md-8">
	     							
	     								<springform:select class="form-control" id="category_id" path="category_id" items="${categorys }"
	     								itemLabel="name"
	     								itemValue="id"
	     								/>
	     								
	     							<!-- VALIDASI -->
	     							<springform:errors path="category_id" cssClass="help-block" element="em"/>
	     							</div>
	     						
	     						</div>
	     					<div class="panel-footer">
	     					<!-- SIMPAN DATA BUTTON -->
	     					  <button type="submit" class="btn btn-success">
	     					  	<span class="glyphicon glyphicon-ok"></span>
	     					  	Save
	     					  </button>
	     					  <button type="reset" class="btn btn-default">
	     					    <span class="glyphicon glyphicon-refresh"></span>
	     					    Cancel
	     					  </button>
	     					</div>
	     					
	     					<!-- HIDEN SPRING INPUT-->
	     					 
	     					<springform:hidden path="id"/>
	     					
	     					<springform:hidden path="code"/>
	     					
	     					<springform:hidden path="active"/>
	     					
	     					<springform:hidden path="userdetail_id"/>
	     					
	     					<springform:hidden path="purchases"/>
	     					
	     					</springform:form>
	     				
	     				</div>				
				
				</div>
			
			</div>
	
	</div>

</div>