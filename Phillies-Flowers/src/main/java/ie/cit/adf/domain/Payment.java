package ie.cit.adf.domain;

public class Payment {
	
	private int id;
	private User user;
	private Package pack;
	private int paymentAmount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Package getPack() {
		return pack;
	}
	public void setPack(Package pack) {
		this.pack = pack;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

}
