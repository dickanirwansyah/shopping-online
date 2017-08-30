package com.dickanirwansyah.war.onlinefrondend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dickanirwansyah.jar.onlinebackend.dao.ProductDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Product;


@Controller
@RequestMapping("/json/data")
public class ControllerAPIJson {

	@Autowired
	private ProductDAO productDAO;
	
	//-----------Menampilkan list all product yang aktiv---------//
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts(){
		
		return productDAO.listActiveProduct();
	}
	
	//--------Menampilkan list product berdasarkan category---//
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductByCategory(@PathVariable int id){
		
		return productDAO.listActiveProductByCategory(id);
	}
	
	
}
