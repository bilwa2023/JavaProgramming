package stringprogram.exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String numstr=null;
		double num=Double.parseDouble(numstr);
		System.out.println(num+num);
	}

}
