package com.Interface.pro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Laptop {

	@Id
	int id;
	String name;
	String launchDate;
	int price;
	String discription;
	
	@JsonProperty
	boolean isAvailable;

	public Laptop() {
		super();
	}

	public Laptop(int id, String name, String launchDate, int price, String discription, boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.launchDate = launchDate;
		this.price = price;
		this.discription = discription;
		this.isAvailable = isAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
}
