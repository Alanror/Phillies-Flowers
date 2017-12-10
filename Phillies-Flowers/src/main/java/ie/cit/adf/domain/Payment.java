package ie.cit.adf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false)
	private int id;
	
	@ManyToOne	    
	@JoinColumn(name="USERID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="PACKAGEID", referencedColumnName="ID")
	private Package package_;
	
	@Column(name="PAYMENTAMOUNT", nullable=false)
	private int paymentAmount;

	public int getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Package getPackage() {
		return package_;
	}

	public void setPackage(Package package_) {
		this.package_ = package_;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
}
