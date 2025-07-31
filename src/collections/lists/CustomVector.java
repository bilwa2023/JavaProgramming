package collections.lists;

import java.util.Collection;

public class CustomVector {
	
	Object myds[]=null;
	
	public CustomVector(int capacity) {
		myds=new Object[capacity];
		
	}
	
	public CustomVector() {
		myds=new Object[10];
	}
	
	public CustomVector(Collection c) {
		myds=new Object[c.size()];
	}
	
	
	private int ind=0;
	public synchronized void add(Object ob) {
		if(ind>= myds.length) {
			Object arr[]=new Object[myds.length*2];
			for(int i=0;i<myds.length;i++) {
				arr[i]=myds[i];
			}
			myds=arr;
		}
		myds[ind]=ob;
		ind++;
	}
	public synchronized Object get(int index) throws IndexOutOfBoundsException{
		if(index>=myds.length || index<0) {
			throw new IndexOutOfBoundsException("Index not found");
		}
		Object obj=myds[index];
		return obj;
	}
	
	public synchronized int size() {
		int length=0;
		for(@SuppressWarnings("unused") Object obj:myds) {
			length++;
		} 
		return length;
	}
	
	public synchronized Object remove(int index) {
		Object obj=myds[index];
		if(index>=myds.length || index<0) {
			throw new ArrayIndexOutOfBoundsException("Index not found");
		}
		
		Object arr[]=new Object[myds.length-1];
		for(int i=0,j=0;j<arr.length;i++) {
			if(i==index) {
				i=i+1;
			}
			arr[j]=myds[i];
			j++;
		}
		myds=arr;
		return obj;
	}
	
	
	@Override
	public synchronized String toString() {
		String s=new String();
		s+="[";
		for(int i=0;i<myds.length;i++) {
			if(myds[i]!=null) {
				if(i==myds.length-1 ) {
					s+=myds[i];
				}
				else {
				s+=myds[i]+", ";
				}
			}
		}
		s+="]";
		
		return s.toString();
	}

	
	
}
