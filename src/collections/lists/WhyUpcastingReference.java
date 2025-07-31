package collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class WhyUpcastingReference {

	public static void main(String[] args) {
		
		//We have different types of collection which have upcasted List reference
		List<Integer> li=new ArrayList<Integer>();
		List<Integer> li1=new Vector<Integer>();
		List<Integer> li2=new Stack<Integer>();
		List<Integer> li3=new LinkedList<Integer>();
		display(li3);
		display(li2);
		display(li1);
		display(li);
		/*
		 *We can call all the collection for display beacause of the generalised 
		 *List Collection ref. accepted by the display().
		 */
		
		ArrayList<Integer> li4=new ArrayList<Integer>();
		display(li4);
		
	}
	public static void display(List<Integer> a) {
		System.out.println(a);
	}

}
