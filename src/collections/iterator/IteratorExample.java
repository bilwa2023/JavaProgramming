package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		li.add(30);
		li.add(35);
		
		
		//Iterator Object
//		Iterator<Integer> itr=li.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//ListIterator Object
//		ListIterator<Integer> itr1=li.listIterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
//		while(itr1.hasPrevious()) {
//			System.out.println(itr1.previous());
//		}
		
		//Concurrent Modification
//		List<Integer> lim=new ArrayList<Integer>();
//		//Initial modcount=0 --> Present in ArrayList 
//		lim.add(10);//modcount=1
//		lim.add(15);//modcount=2
//		lim.add(20);//modcount=3
//		lim.add(25);//modcount=4
//		lim.add(30);//modcount=5
//		lim.add(35);//modcount=6
//		
//		Iterator<Integer> lis=lim.iterator();//ExpectedModcount=6
//		
//		
//		lim.add(40);
//		
//		while(lis.hasNext()) {
//			int i=lis.next();
//			System.out.println(i);
//		}
		
		//Concurrent Modification Resolve using CopyOnWriteArraySet
				List<Integer> list=new CopyOnWriteArrayList<Integer>();
				//Initial modcount=0 --> Present in ArrayList 
				list.add(10);//modcount=1
				list.add(15);//modcount=2
				list.add(20);//modcount=3
				list.add(25);//modcount=4
				list.add(30);//modcount=5
				list.add(35);//modcount=6
				
				Iterator<Integer> itr=list.iterator();//ExpectedModcount=6
				
				
				while(itr.hasNext()) {
					int i=itr.next();
					list.add(40);
					System.out.println(i);
				}
				System.out.println(list);
	}
}
