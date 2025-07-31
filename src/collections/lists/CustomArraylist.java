package collections.lists;

import java.util.Arrays;

public class CustomArraylist {
	
	Object myds[]=null;
	
	public CustomArraylist(int capacity) {
		myds=new Object[capacity];
		
	}
	
	public CustomArraylist() {
		myds=new Object[10];
	}
	
	private int ind=0;
	public void add(Object ob) {
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
	
	public void add(int index,Object obj) {
		if(index<0||index>=myds.length) {
			throw new IndexOutOfBoundsException("Index not found");
		}
		Object arr[]=new Object[myds.length+1];
		for(int i=0;i<arr.length;i++) {
			if(i<index) {
				arr[i]=myds[i];
				
			}
			else if(i==index) {
				arr[i]=obj;
			}
			else
				arr[i]=myds[i-1];
			
		}
		myds=arr;
	}
	public Object get(int index) throws IndexOutOfBoundsException{
		if(index>=myds.length || index<0) {
			throw new IndexOutOfBoundsException("Index not found");
		}
		Object obj=myds[index];
		return obj;
	}
	
	public int size() {
		int length=0;
		for(Object obj:myds) {
			length++;
		} 
		return length;
	}
	
	public Object remove(int index) {
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
	public String toString() {
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
