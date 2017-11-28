package ie.cit.adf.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false)
	private int UID;
	
	@Column(name="USERNAME", nullable=false)
	private String username;
	
	@Column(name="USERPASSWORD", nullable=false)
	private String password;
	
	private String name;
	private String address;
	private String tel;
	
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<Package> cart;
	
	//@OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	//private List<Payment> payments;

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
