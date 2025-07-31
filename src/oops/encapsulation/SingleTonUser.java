package oops.encapsulation;

public class SingleTonUser {

	public static void main(String[] args) {
		SingleTon s=SingleTon.getObject();
		s.setBalance(5689);
		System.out.println(s.getBalance());
	}

}
