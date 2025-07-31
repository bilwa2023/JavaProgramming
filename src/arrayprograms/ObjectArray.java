package arrayprograms;
public class ObjectArray {

	public static void main(String[] args) {
		Mobile m1=new Mobile(8,23900);
		Mobile m2=new Mobile(4,12300);
		Mobile m3=new Mobile(12,45000);
		Mobile m4=null;
		Object arr[]= {m1,m2,m3,new Mobile(8,23000),m4};
		for(Object obj:arr) {
			System.out.println(obj);
		}
		m4.toString();
	}

}
