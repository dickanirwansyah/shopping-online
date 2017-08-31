package com.dickanirwansyah.war.onlinefrondend.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView getPageNotFoundHandlingException(){
		
		ModelAndView view = new ModelAndView();
		
		view.setViewName("error");
		
		view.addObject("title", "404 Error Page");
		
		view.addObject("description", "Maaf untuk saat ini halaman yang anda cari tidak ada !");
		
		view.addObject("titleError", "404 Page Not Found !");
		
		return view;
	}
	
	@ExceptionHandler(ExceptionHandlingProduct.class)
	public ModelAndView getPageProductNotFound(){
		
		ModelAndView view = new ModelAndView();
		
		view.setViewName("error");
		
		view.addObject("title", "Product Not Found");
		
		view.addObject("description", "Product yang anda cari tidak ada :( ");
		
		view.addObject("titleError", "product tidak terdaftar di database kami :) ");
		
		return view;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView getPageProductsNotFound(Exception exception){
		ModelAndView view = new ModelAndView();
		
		view.setViewName("error");
		
		view.addObject("title", "Error");
		
		view.addObject("description", "ups..product yang anda maksud tidak ada didatabase kami :(");
		
		view.addObject("titleError", "product tidak tersedia saat ini");
		
		return view;
	}
}
