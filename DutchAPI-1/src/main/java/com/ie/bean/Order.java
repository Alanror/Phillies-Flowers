package com.ie.bean;

public class Order {

	private int id;
	private String name;
	private float total;
	private float outstanding;
	
	public Order() {
		super();
	}

	public Order(int id, String name, float total, float outstanding) {
		super();
		this.id = id;
		this.name = name;
		this.total = total;
		this.outstanding = outstanding;
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
		return "Order [id=" + id + ", name=" + name + ", total=" + total + ", outstanding=" + outstanding + "]";
	}
	
	
	
	
}
