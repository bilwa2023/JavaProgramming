package oops.encapsulation;

public class FactoryMethod {
	private final String acc_no="SBIN213005";
	private double balance=2310.56;
	
	private FactoryMethod() {}
	
	public String getacc_no(){
		return this.acc_no;
	}
	
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public static FactoryMethod getObject() {
		return new FactoryMethod();
	}
	
}
