package com.soyeb.flutter.foundTransfer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoundMenu {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String image;
	private String action;
	
	public FoundMenu() {
		
	}
	
	
	public FoundMenu(int id, String title, String image, String action) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.action = action;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
}
