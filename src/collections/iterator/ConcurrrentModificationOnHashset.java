package collections.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrrentModificationOnHashset {

	public static void main(String[] args) {
//		Set<Integer> set=new HashSet<Integer>();
//		set.add(25);//modcount=1
//		set.add(30);//modcount=2
//		set.add(35);//modcount=3
//		set.add(40);//modcount=4
//		set.add(45);//modcount=5
//		int i=50;
//		Iterator<Integer> itr=set.iterator();//ExpectedModcount=5
//		while(itr.hasNext()) {
//			System.out.println(itr.next());//ConcurrentModificationException
//			set.add(i+=5);//modcount=6 (!=ExpectedModcount)
//			
//		}
		//To resolve this concurrentmodificationexception we will use a concurrent Hashset collection
		
		Set<Integer> set1=new CopyOnWriteArraySet<Integer>(); 
		set1.add(25);//modcount=1
		set1.add(30);//modcount=2
		set1.add(35);//modcount=3
		set1.add(40);//modcount=4
		set1.add(45);//modcount=5
		
		int i1=50;
		Iterator<Integer> itr1=set1.iterator();//ExpectedModcount=5
		while(itr1.hasNext()) {
			System.out.println(itr1.next());//ConcurrentModificationException
			set1.add(i1+=5);//modcount=6 (!=ExpectedModcount)
		//Snapshot Collection :- Handles the add()
		//Original Collection :- Iteration
		//Later the oroginal is updated from snapshot collection	
		
		}
		System.out.println(set1);
	}

}
