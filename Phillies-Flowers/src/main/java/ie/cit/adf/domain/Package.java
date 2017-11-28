package ie.cit.adf.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="package")
public class Package {
	
	@Column(name="PACKAGENAME", nullable=false)
	private String name; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false)
	private int UID;
	
	@ManyToOne
	@JoinColumn(name="USERID")
	private User user;
	
	@Column(name="PACKAGEAMOUNT", nullable=false)
	private int price;
	private String category;
	
	@Column(name="DESCRIPTION", nullable=true)
	private String description;
	
	public Package() {
	}
	public Package(String name, int uID, int price, String category, List<AddonItem> addons) {
		super();
		this.name = name;
		UID = uID;
		this.price = price;
		this.category = category;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
	
	@Override
	public String toString() {
		return "Package [name=" + name + ", UID=" + UID + ", price=" + price + ", category=" + category + " ]";
	}
	
	
}
