package collections.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(10, "Mahesh");//
		map.put(20, "Chinna");
		map.put(30, "Pila");
		map.put(40, "Thotapally");
		map.put(50, "Chhota Yadav");
		int i=55;
		/*Iterating over hashmap by converting to Set collection
		 * Becaause HashMap doesnot have iterator()
		 */
		
		Iterator itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());//ConcurrentModificationException
			map.put(i+=5, "Cry Boy");
		}
	}

}
