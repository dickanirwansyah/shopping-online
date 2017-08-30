package com.dickanirwansyah.jar.onlinebackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dickanirwansyah.jar.onlinebackend.dao.ProductDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Product;


@Transactional
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> listAllProduct() {
		//proses list all product
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Product", Product.class)
						.getResultList();
	}

	@Override
	public List<Product> listActiveProduct() {
		String sqlproductactive = "FROM Product WHERE active =:active";
		return sessionFactory.getCurrentSession()
				.createQuery(sqlproductactive, Product.class)
				.setParameter("active", true).getResultList();
	}

	@Override
	public List<Product> listActiveProductByCategory(int category_id) {
		String sqlproductcategory = "FROM Product WHERE active =:active AND category_id=:category_id";
		return sessionFactory.getCurrentSession()
				.createQuery(sqlproductcategory, Product.class)
				.setParameter("active", true)
				.setParameter("category_id", category_id)
				.getResultList();
	}

	@Override
	public List<Product> getLatestActiveProduct(int count) {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM Product WHERE active=:active ORDER BY id", Product.class)
				.setParameter("active", true)
				.setFirstResult(0)
				.setMaxResults(count)
				.getResultList();
	}

	@Override
	public Product getIdProduct(int idproduct) {
		//proses mencari product berdasarkan kode product
		try{
			return sessionFactory
					.getCurrentSession()
						.get(Product.class,
								Integer.valueOf(idproduct));
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean saveProduct(Product product) {
		//proses simpan product
		try{
			sessionFactory
				.getCurrentSession()
					.persist(product);
			return true;
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		//proses update product
		try{
			sessionFactory
				.getCurrentSession()
					.update(product);
			return true;
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		//proses delete product
		product.setActive(false);
		try{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return false;
	}

}

