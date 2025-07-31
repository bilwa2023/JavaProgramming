package stringprogram.exception;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String id="bilwa";
		String pwd="bilwa@123";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String userid=sc.nextLine();
		System.out.println("Enter the Password");
		String password=sc.nextLine();
		
		if(userid.equals(id) && password.equals(pwd)) {
			System.out.println("Login Successful");
		}
		else {
			try {
				throw new AccessDeniedException("Wrong id or password");

			}
			catch(AccessDeniedException e){
				System.out.println(e.getMessage());
			}
		}
	}

}
