package collections.lists;

import java.util.Vector;

public class ExampleVector{
	
	
	public static void main(String[] args) {
		Vector vector=new Vector();
		CustomVector cv=new CustomVector();
//		cv.add(12);
//		cv.add(14);
//		cv.add(16);
//		cv.add(18);
//		cv.add(20);
//		cv.add(22);
//		cv.add(24);

//		System.out.println(cv);
//		cv.remove(2);
//		System.out.println(cv);
//		System.out.println(cv.get(1));
//		System.out.println(cv.size());
		
		
		//Checking synchronization in vector
		Runnable r1=()->{
			for(int i=100;i<150;i++) {
				cv.add(i);
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(()->{
			for(int i=50;i<99;i++) {
				cv.add(i);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(cv);
	}
	
	
}
