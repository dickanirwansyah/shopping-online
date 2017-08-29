package com.dickanirwansyah.jar.onlinebackend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category", catalog = "onlineshopping")
public class Category implements Serializable{

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", nullable=false)
	private String name;
	
	@Column(name = "description", nullable=false)
	private String description;
	
	@Column(name = "imageurl", nullable=false)
	private String imageurl;
	
	@Column(name = "active")
	private boolean active = true;
	
	public Category(){
		
	}
	
	public Category(int id, String name, String description, String imageurl, boolean active){
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageurl = imageurl;
		this.active = active;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public String getImageurl(){
		return imageurl;
	}
	
	public void setImageurl(String imageurl){
		this.imageurl=imageurl;
	}

	public boolean getActive(){
		return active;
	}
	
	public void setActive(boolean active){
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description="
				+ description + ", imageurl=" + imageurl + ", active=" + active
				+ "]";
	}
	
	
}
