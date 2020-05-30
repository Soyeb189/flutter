package com.soyeb.flutter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Menu {
	
	@Id
	@GeneratedValue
	private int menu_id;
	private String menu_name;
	private String menu_action_id;
	private String menu_img;
	private String menu_created_date;
	
	public Menu() {
		
	}
	
	public Menu(String menu_name, String menu_action_id, String menu_img, String menu_created_date, int menu_id) {
		super();
		this.menu_name = menu_name;
		this.menu_action_id = menu_action_id;
		this.menu_img = menu_img;
		this.menu_created_date = menu_created_date;
		this.menu_id = menu_id;
	}

	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_action_id() {
		return menu_action_id;
	}
	public void setMenu_action_id(String menu_action_id) {
		this.menu_action_id = menu_action_id;
	}
	public String getMenu_img() {
		return menu_img;
	}
	public void setMenu_img(String menu_img) {
		this.menu_img = menu_img;
	}
	public String getMenu_created_date() {
		return menu_created_date;
	}
	public void setMenu_created_date(String menu_created_date) {
		this.menu_created_date = menu_created_date;
	}
	
	@Override
	public String toString() {
		return "Menu [menu_name=" + menu_name + ", menu_action_id=" + menu_action_id + ", menu_img=" + menu_img
				+ ", menu_created_date=" + menu_created_date + ", menu_id=" + menu_id + "]";
	}
	
	
	

}
