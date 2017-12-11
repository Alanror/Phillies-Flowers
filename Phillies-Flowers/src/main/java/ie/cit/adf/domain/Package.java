package ie.cit.adf.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import org.apache.tomcat.util.codec.binary.Base64;


@Entity
@Table(name="package")
public class Package {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false)
	private int id;
	
	@Column(name="PACKAGENAME", nullable=false)
	private String packageName;
	
	@Column(name="DESCRIPTION", nullable=true)
	private String description;
	
	@Column(name="PACKAGEAMOUNT", nullable=false)
	private int packageAmount;
	
	/*@OneToMany(mappedBy="package", fetch=FetchType.EAGER)
	private List<Payment> payments;*/
		
	
	public Package() {
		//this.payments = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPackageAmount() {
		return packageAmount;
	}

	public void setPackageAmount(int amount) {
		this.packageAmount = amount;
	}

	/*public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}*/
}
