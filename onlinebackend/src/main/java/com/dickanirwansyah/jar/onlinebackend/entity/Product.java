package com.dickanirwansyah.jar.onlinebackend.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product", catalog = "onlineshopping")
public class Product implements Serializable{

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="code", nullable=false)
	private String code;
	
	@Column(name="name", nullable=false)
	@NotBlank(message="Please enter the name of product !")
	private String name;
	
	@Column(name="brand",nullable=false)
	@NotBlank(message="Please enter the brand of product !")
	private String brand;
	
	@JsonIgnore
	@Column(name="description", nullable=false)
	@NotBlank(message="Please enter the description of product !")
	private String description;
	
	@Column(name="unitprice", nullable=false)
	@Min(value=1, message="price Product cannot be zero !")
	private double unitprice;
	
	@Column(name="quantity", nullable=false)
	@Min(value=1, message="Quantity Product cannot be less than one !")
	private int quantity;
	
	@JsonIgnore
	@Column(name="active", nullable=false)
	private boolean active;
	
	@JsonIgnore
	@Column(name="category_id", nullable=false)
	private int category_id;
	
	@JsonIgnore
	@Column(name="userdetail_id", nullable=false)
	private int userdetail_id;
	
	@Column(name="purchases")
	private int purchases;
	
	@Column(name="views")
	private int views;

	
	public Product(){
		this.code = "PRD" + UUID.randomUUID()
				.toString()
				.substring(26)
				.toUpperCase();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getUserdetail_id() {
		return userdetail_id;
	}

	public void setUserdetail_id(int userdetail_id) {
		this.userdetail_id = userdetail_id;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name
				+ ", brand=" + brand + ", description=" + description
				+ ", unitprice=" + unitprice + ", quantity=" + quantity
				+ ", active=" + active + ", category_id=" + category_id
				+ ", userdetail_id=" + userdetail_id + ", purchases="
				+ purchases + ", views=" + views + "]";
	}
	
	
	
}
