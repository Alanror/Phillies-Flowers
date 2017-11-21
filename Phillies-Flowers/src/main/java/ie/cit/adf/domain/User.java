package ie.cit.adf.domain;

import java.util.List;

public class User {
	private String name;
	private int UID;
	private String address;
	private String username;
	private String password;
	private String tel;
	private List<Package> cart;

	public User() {
	}
	public User(String name, int uID, String address, String username, String password, String tel,
			List<Package> cart) {
		super();
		this.name = name;
		UID = uID;
		this.address = address;
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.cart = cart;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getTele() {
		return tel;
	}
	public void setTele(String tel) {
		this.tel = tel;
	}
	public List<Package> getCart() {
		return cart;
	}
	public void setCart(List<Package> cart) {
		this.cart = cart;
	}
	
	
}
