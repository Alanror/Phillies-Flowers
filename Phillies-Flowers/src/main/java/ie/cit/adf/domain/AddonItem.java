package ie.cit.adf.domain;

public class AddonItem {
	
	private String name;
	private int UID;
	private float price;
	private String description;
	
	public AddonItem() {
	}
	public AddonItem(String name, int uID, float price, String description) {
		super();
		this.name = name;
		UID = uID;
		this.price = price;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
