package com.dickanirwansyah.jar.onlinebackend.daoimpl;

import java.util.List;

import com.dickanirwansyah.jar.onlinebackend.dao.ProductDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Product;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public List<Product> listAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listActiveProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listActiveProductByCategory(int category_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getLatestActiveProduct(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getIdProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

}

