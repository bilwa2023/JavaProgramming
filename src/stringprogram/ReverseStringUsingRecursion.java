class ReverseStringUsingRecursion{
	public static String reverse(String s,int index){
		String str="";
		str+=s.charAt(index);
		if(index ==0)
			return str;
		else
			return str+reverse(s,index-1);
	}
	public static void main(String [] args){
		String s="stupid";
		System.out.println(reverse(s,s.length()-1));
	}
}