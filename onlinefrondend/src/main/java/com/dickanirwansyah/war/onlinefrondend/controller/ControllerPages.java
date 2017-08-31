package com.dickanirwansyah.war.onlinefrondend.controller;

import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dickanirwansyah.jar.onlinebackend.dao.CategoryDAO;
import com.dickanirwansyah.jar.onlinebackend.dao.ProductDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Category;
import com.dickanirwansyah.jar.onlinebackend.entity.Product;
import com.dickanirwansyah.war.onlinefrondend.controller.exception.ExceptionHandlingProduct;


@Controller
public class ControllerPages {

	private static final Logger logger = LoggerFactory.getLogger(ControllerPages.class);
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"}, method=RequestMethod.GET)
	public ModelAndView getPages(){
		ModelAndView view = new ModelAndView();
		view.setViewName("page");
		view.addObject("title", "Home");
		
		logger.info("Inside ControllerPages index method - INFO");
		logger.debug("Inside ControllerPages index method - DEBUG");
		
		view.addObject("listcategory", categoryDAO.listcategory());
		view.addObject("userClickHome", true);
		return view;
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public ModelAndView getAboutUs(){
		ModelAndView view = new ModelAndView();
		view.setViewName("page");
		view.addObject("userClickAbout", true);
		view.addObject("title", "About Us");
		return view;
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public ModelAndView getContactUs(){
		ModelAndView view = new ModelAndView();
		view.setViewName("page");
		view.addObject("title", "Contact Us");
		view.addObject("userClickContact", true);
		return view;
	}
	
	//Methode Menampilkan show/all/products 
	
	@RequestMapping(value="/show/all/products", method=RequestMethod.GET)
	public ModelAndView getShowAllProducts(){
		ModelAndView view = new ModelAndView();
		view.setViewName("page");
		view.addObject("title", "All Products");
		view.addObject("listcategory", categoryDAO.listcategory());
		view.addObject("userClickAllProduct", true);
		return view;
	}
	
	//Methode Menampilkan show/all/category/{id}/products
	
	@RequestMapping(value="/show/category/{id}/products", method=RequestMethod.GET)
	public ModelAndView getShowCategoryProducts(@PathVariable("id")int id){
		ModelAndView view = new ModelAndView();
		view.setViewName("page");
			//setting category
		Category category = null;
		category = categoryDAO.getIdCategory(id);
		view.addObject("title", category.getName());
		view.addObject("listcategory", categoryDAO.listcategory());
		view.addObject("category", category);
		view.addObject("userClickCategoryProduct", true);
		return view;
	}
	
	//Menampilkan informasih single product
	
	@RequestMapping(value="/show/{id}/products", method=RequestMethod.GET)
	public ModelAndView getShowSingleProductInformasi(@PathVariable("id")int id) 
			throws ExceptionHandlingProduct{
		ModelAndView view = new ModelAndView();
		view.setViewName("page");
		Product product = null;
		product = productDAO.getIdProduct(id);
		
		if(product == null) throw new ExceptionHandlingProduct();
		
		//update jumlah pengunjung yang lihat product
		product.setViews(product.getViews()+1);
		productDAO.updateProduct(product);

		view.addObject("title", product.getName());
		view.addObject("product", product);
		view.addObject("userClickOneProduct", true);
		return view;
	}
	
	
	
	
	
	
	/*
	 * test @PathVariable
	 * 
	@RequestMapping(value="/testpath/{title}", method=RequestMethod.GET)
	public ModelAndView getTestPath(@PathVariable("title")String title){
		
		if(title == null){
			title = "@PathVariable";
		}
		ModelAndView view = new ModelAndView();
		view.setViewName("page");
		view.addObject("title", title);
		return view;
	}
	*/
	
	/*
	 * test @RequestParam
	 * 
	@RequestMapping(value="/testparam", method=RequestMethod.GET)
	public ModelAndView getTestParam(@RequestParam(value="title", required=false)String title){
		
		if(title == null){
			title = "@RequestParam";
		}
		ModelAndView view = new ModelAndView();
		view.addObject("title", title);
		view.setViewName("page");
		return view;
	}
	*/
}
