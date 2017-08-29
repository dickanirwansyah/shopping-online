package com.dickanirwansyah.jar.onlinebackend.daotest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dickanirwansyah.jar.onlinebackend.dao.CategoryDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Category;

public class CategoryTest {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	
	@BeforeClass
	public static void initTestCategory(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.dickanirwansyah.jar.onlinebackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	/*
	 * Menampilkan jumlah data list yang active
	 * 
	@Test
	public void testListCategoryIsActive(){
		assertEquals("data list kategori yang aktive", 3, categoryDAO.listcategory().size());
	}
	*/
	
	/*
	@Test
	public void testDeleteOrHiddenCategory(){
		category = categoryDAO.getIdCategory(3);
		category.setName("Nokia");
		assertEquals("data berhasil dihidden !", true, categoryDAO.deleteOrHidenCategory(category));
	}
	*/
	
	/*
	@Test
	public void testUpdateCategory(){
		category = new Category();
		category.setName("Nokia");
		category.setDescription("nokia is the best smartphone");
		category.setImageurl("nokia.jpg");
		category.setId(3);
		
		assertEquals("data berhasil diupdate !",true, categoryDAO.updateCategory(category));
	}
	*/
	
	/*
	 * proses test adding category @TEST
	 * 
	@Test
	public void testAddCategory(){
		category = new Category();
		category.setName("Xperia");
		category.setDescription("xperia is the best smartphone");
		category.setImageurl("xperia.jpg");
		
		assertEquals("data berhasil disimpan !", true, categoryDAO.saveCategory(category));
		
		category = new Category();
		category.setName("Xiaomi");
		category.setDescription("xperia is the best smartphone");
		category.setImageurl("xiaomi.jpg");
		
		assertEquals("data berhasil disimpan",true, categoryDAO.saveCategory(category));
	}
	*/
	
}
