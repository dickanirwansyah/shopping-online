package com.dickanirwansyah.jar.onlinebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dickanirwansyah.jar.onlinebackend.dao.CategoryDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Category;


@Transactional
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	/* 
	 * tester static list category
	 * 
	private static List<Category> listcategories = new ArrayList<Category>();
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Iphone");
		category.setDescription("Iphone Good");
		category.setImageurl("Iphone.png");
		
		listcategories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Android");
		category.setDescription("Android Good");
		category.setImageurl("Android.png");
		
		listcategories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Xperia");
		category.setDescription("Sony Good");
		category.setImageurl("sony.png");
		
		listcategories.add(category);
	}
	*/
	
	@Override
	public List<Category> listcategory() {
		String sqlListisActive = "FROM Category WHERE active = :active";
		Query query = sessionFactory.getCurrentSession().createQuery(sqlListisActive);
		query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	public Category getIdCategory(int id) {
		return (Category) sessionFactory.getCurrentSession()
				.get(Category.class, id);
	}

	@Override
	public boolean saveCategory(Category category) {
		//proses save category dao implements
		try{
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch(Exception exception){
			exception.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		//proses update
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception exception){
			exception.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteOrHidenCategory(Category category) {
		//proses merubah active menjadi nonactive or hidden category
		category.setActive(false);
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception exception){
			exception.printStackTrace();
			return false;
		}
	}

}
