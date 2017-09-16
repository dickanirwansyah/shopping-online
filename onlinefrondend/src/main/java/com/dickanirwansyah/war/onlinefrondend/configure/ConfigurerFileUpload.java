package com.dickanirwansyah.war.onlinefrondend.configure;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class ConfigurerFileUpload {

	//Absolute Path Linux Folder
	private static final String ABS_PATH = 
    "//home//java-spring//workspace//shopping-online//onlinefrondend//src//main//webapp//assets//image//";
	
	//Real Path Project folder /assets/image/**
	private static String REAL_PATH = "";
	
	//LOGGER 
	private static Logger LOGGER = LoggerFactory.getLogger(ConfigurerFileUpload.class);
	
	public static void uploadFile(HttpServletRequest request,
			MultipartFile file, String code) {
		
		//get the real path
		REAL_PATH = request.getSession().getServletContext().getRealPath("/assets/image/");
		
		LOGGER.info(REAL_PATH);
		
		//CHECK DIRECTORY EXIST
		if(! new File(ABS_PATH).exists()){
			//CREATE DIRECTORY
			new File(ABS_PATH).mkdirs();
		}
		
		if(! new File(REAL_PATH).exists()){
			new File(REAL_PATH).mkdirs();
		}
		
		try{
			//servers upload
			file.transferTo(new File(REAL_PATH + code + ".jpg"));
			//project directory
			file.transferTo(new File(ABS_PATH + code + ".jpg"));
		}catch(IOException exception){
			
		}
	}
}
