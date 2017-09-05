$(function (){

	switch(menu) {
	case 'About Us':
		$('#about').addClass('active');
	break;
	
	case 'Contact Us':
		$('#contact').addClass('active');
	break;
	
	case 'All Products':
		$('#listProducts').addClass('active');
	break;
	
	default :
		$('#listProducts').addClass('active');
		$('#a_' + menu).addClass('active');
	break;
	}
	
	
	
		var $table = $("#TableListProduct");
	
		if($table.length){
			//console.log('jika bacaan ini tampil maka sukses');
			
			var jsonUrl = '';
			if(window.categoryId == ''){
				
				jsonUrl = window.contextRoot + '/json/data/all/products';
			}else{
				
				jsonUrl = window.contextRoot + '/json/data/category/'+window.categoryId+'/products';
			}
			
			$table.DataTable({
				
				lengthMenu :[[5, 10, 15, 20, -1], ['5', '10','15', '20', 'All']],
				pageLength : 5,
				
				ajax : {
					
					url : jsonUrl,
					dataSrc : '',
				},
				columns : [
				           {
				        	   data : 'code',
				        	   mRender : function(data, type, row){
				        		   return '<img src="'+window.contextRoot+'/resources/image/'+data+'.jpg" width="100px" height="100px" />';
				        	   }
				           },
				           {
				        	   data : 'name'
				           },
				           {
				        	   data : 'brand'
				           },
				           {
				        	   data : 'unitprice',
				        	   mRender: function(data, type, row){
				        		   return 'Rp '+data
				        	   }
				           },
				           {
				        	   data : 'quantity',
				        	   mRender:function(data, type, row){
				        		   
				        		   if(data < 1){
				        			   return '<span style="color:red">Out Of Stock !</span>';
				        		   }
				        		   	   return data;
				        	   }
				           },
				           {
				        	   data : 'id',
				        	   bSortable : false,
				        	   mRender : function(data, type, row){
				        		   
				        		   var str = "";
				        		   
				        		   
				        		   //show item
				        		   str += '<a href="'+ window.contextRoot +'/show/'+data+'/products" class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span>Lihat</a>  ';
				        		   //add to cart
				        		   
				        		   //ketika barang kurang dari 0 button cart disable
				        		   if(row.quantity < 1){
				        			   str += '<a href="javascript:void(0)" class="btn btn-success disable"><strike><span class="glyphicon glyphicon-shopping-cart"></span>Add To Cart</strike></a>';
				        		   }else{
				        			   str += '<a href="'+ window.contextRoot +'/cart/add/'+data+'/products" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span> Add To Cart </a>';  
				        		   }
				        		   return str;
				        	   }
				           }
				          ]
					});
		}
});
