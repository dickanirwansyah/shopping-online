package com.dickanirwansyah.jar.onlinebackend.daotest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dickanirwansyah.jar.onlinebackend.dao.ProductDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Product;

public class ProductTest {
	
	
	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	
	@BeforeClass
	public static void initTestProduct(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.dickanirwansyah.jar.onlinebackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}

	
	/*
	 * menampilkan product berdasarkan id 1 dan active.
	 * 
	@Test
	public void testGetLatestActiveProduct(){
		assertEquals("Maaf ada kesalahan dalam proses menampilkan", 
				1, productDAO.getLatestActiveProduct(1).size());
	}
	*/
	
	/*
	@Test
	public void testJumlahProductYangActive(){
		assertEquals("Maaf ada kesalahan dalam menampilkan product "
				+ "yang active",3, productDAO.listActiveProduct().size());
	}
	*/
	
	/*
	 * menampilkan product yang aktive berdasarkan kategori, product dengan kategori 1
	 * yang aktive ada 2.
	 * 
	@Test
	public void testListProductBerdasarkanCategoryYangActive(){
		assertEquals("maaf ada kesalahan",2, productDAO.listActiveProductByCategory(1).size());
		
	}
	*/
	
	/*
	@Test
	public void testHidenProduct(){
		product = productDAO.getIdProduct(5);
		product.setName("Xiomi Redmi Note 3");
		assertEquals("data berhasil dihiden", true, 
				productDAO.deleteProduct(product));
	}
	*/
	
	/*
	@Test
	public void testAddProduct(){
		product=new Product();
		product.setName("Xiaomi Redmi 4x");
		product.setBrand("Xiaomi");
		product.setDescription("Xiaomi good");
		product.setUnitprice(56000);
		product.setActive(true);
		product.setCategory_id(4);
		product.setUserdetail_id(1);
		
		assertEquals("data berhasil disimpan ke database", 
				true, 
					productDAO.saveProduct(product));
	}
	*/

	/*
	@Test
	public void testUpdateProduct(){
		product = new Product();
		product.setName("Xiomi Redmi Note 3");
		product.setId(5);
		product.setBrand("Xiaomi");
		product.setDescription("Xiaomi good");
		product.setUnitprice(56000);
		product.setActive(true);
		product.setCategory_id(4);
		product.setUserdetail_id(1);
		assertEquals("data berhasil diupdate", true, productDAO.updateProduct(product));
	}
	*/
	
}
