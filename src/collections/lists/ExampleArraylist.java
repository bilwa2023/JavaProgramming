package collections.lists;

import java.util.ArrayList;

public class ExampleArraylist {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(23);
		
		CustomArraylist cal=new CustomArraylist(6);
		cal.add(12);
		cal.add(14);
		cal.add(16);
		cal.add(18);
		cal.add(20);
		cal.add(25);
		cal.add(44);
		cal.add(44);
		cal.add(44);
		cal.add(44);
		cal.add(44);
		cal.add(55);
		
		System.out.println(cal);
//		System.out.println(cal.get(15));
//		System.out.println(cal.size());
//		System.out.println(cal.remove(5));
		
		cal.add(2, 25);
		System.out.println(cal);
		
		
		
	}
}
