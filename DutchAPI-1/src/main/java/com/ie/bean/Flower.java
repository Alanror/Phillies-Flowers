package com.ie.bean;

public class Flower {

    private Long id;
    private String name;
    private float price;
    private int stock;

    public Flower() {
    }

    public Flower(Long id, String name, float price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
    
    
}
