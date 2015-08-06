package com.ibm.mil.summit.model;

import java.util.List;
import java.util.Map;

public class UserDB extends CloudantObject {

	public UserDB(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	private String first_name;
	private String last_name;
	private String username;
	private String password;
	private Map<String, List<String>> recommended_items;
	private List<String> past_order;
	private Map<String, List<String>> cart;
	private Map<String, List<String>> list;
	private String mystore;
	private List<String> coupons;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, List<String>> getRecommended_items() {
		return recommended_items;
	}

	public void setRecommended_items(Map<String, List<String>> recommended_items) {
		this.recommended_items = recommended_items;
	}

	public List<String> getPast_order() {
		return past_order;
	}

	public void setPast_order(List<String> past_order) {
		this.past_order = past_order;
	}

	public Map<String, List<String>> getCart() {
		return cart;
	}

	public void setCart(Map<String, List<String>> cart) {
		this.cart = cart;
	}

	public Map<String, List<String>> getList() {
		return list;
	}

	public void setList(Map<String, List<String>> list) {
		this.list = list;
	}

	public String getMystore() {
		return mystore;
	}

	public void setMystore(String mystore) {
		this.mystore = mystore;
	}

	public List<String> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<String> coupons) {
		this.coupons = coupons;
	}
}