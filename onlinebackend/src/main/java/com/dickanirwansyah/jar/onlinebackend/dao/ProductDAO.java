package com.dickanirwansyah.jar.onlinebackend.dao;

import java.util.List;

import com.dickanirwansyah.jar.onlinebackend.entity.Product;

public interface ProductDAO {

	List<Product> listAllProduct();
	
	List<Product> listActiveProduct();
	
	List<Product> listActiveProductByCategory(int category_id);
	
	List<Product> getLatestActiveProduct(int count);
	
	Product getIdProduct(int idproduct);
	
	boolean saveProduct(Product product);
	
	boolean updateProduct(Product product);
	
	boolean deleteProduct(Product product);
}
