package com.dickanirwansyah.jar.onlinebackend.dao;

import java.util.List;

import com.dickanirwansyah.jar.onlinebackend.entity.Category;

public interface CategoryDAO {

	List<Category> listcategory();
	
	Category getIdCategory(int id);
	
	boolean saveCategory(Category category);
	
	boolean updateCategory(Category category);
	
	boolean deleteOrHidenCategory(Category category);
	
}
