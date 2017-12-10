package com.ie.bean;

public class Order {

	private int id;
	private String shopname;
	private float total;
	private float outstanding;
	
	public Order() {
		super();
	}

	public Order(int id, String shopname, float total, float outstanding) {
		super();
		this.id = id;
		this.shopname = shopname;
		this.total = total;
		this.outstanding = outstanding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShopName() {
		return shopname;
	}

	public void setShopName(String shopname) {
		this.shopname = shopname;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(float outstanding) {
		this.outstanding = outstanding;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", shopname=" + shopname + ", total=" + total + ", outstanding=" + outstanding + "]";
	}
	
	
	
	
}
