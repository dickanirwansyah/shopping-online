package com.dickanirwansyah.war.onlinefrondend.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dickanirwansyah.jar.onlinebackend.dao.CategoryDAO;
import com.dickanirwansyah.jar.onlinebackend.dao.ProductDAO;
import com.dickanirwansyah.jar.onlinebackend.entity.Category;
import com.dickanirwansyah.jar.onlinebackend.entity.Product;


@Controller
@RequestMapping(value = "/manage")
public class ControllerProduct {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerProduct.class);
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView getManageProductPage(@RequestParam(name="operation", required=false)
	String operation){
		ModelAndView view = new ModelAndView();
		
		view.setViewName("page");
		
		view.addObject("title", "Manajemen Product");
		
		view.addObject("userClickManageProduct", true);
		
		Product product = new Product();
		product.setUserdetail_id(1);
		product.setActive(true);
		
		view.addObject("product", product);
		
		if(operation != null){
			
			if(operation.equals("product")){
				view.addObject("message", "Product is success submited!");
			}
		}
		
		return view;
	}
	
	
	//handling product submit
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public String getSubmitProduct(@Valid @ModelAttribute("product")Product product, 
			BindingResult bindresult, Model model){
		
		//check binding result validation errors
		if(bindresult.hasErrors()){
			model.addAttribute("userClickManageProduct", true);
			model.addAttribute("title", "Manajemen Product");
			model.addAttribute("message", "Validation  Failed for product submiting..");
			return "page";
		}
		
		LOGGER.info(product.toString());
		
		productDAO.saveProduct(product);
		
		return "redirect:/manage/products?operation=product";
	}
	
	@ModelAttribute(value = "categorys")
	public List<Category> getCategorys(){
		
		return categoryDAO.listcategory();
	}
}
