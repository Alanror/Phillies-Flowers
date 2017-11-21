package ie.cit.adf.domain;

import java.util.List;

public class Package {
	private String name; 
	private int UID;
	private float price;
	private String category;
	private String description;
	private List<AddonItem> addons;
	
	public Package() {
	}
	public Package(String name, int uID, float price, String category, List<AddonItem> addons) {
		super();
		this.name = name;
		UID = uID;
		this.price = price;
		this.category = category;
		this.addons = addons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<AddonItem> getAddons() {
		return addons;
	}
	public void setAddons(List<AddonItem> addons) {
		this.addons = addons;
	}
	
	@Override
	public String toString() {
		return "Package [name=" + name + ", UID=" + UID + ", price=" + price + ", category=" + category + ", addons="
				+ addons + "]";
	}
	
	
}
