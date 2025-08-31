package stringprogram;

public class MyRegex {
	 String pattern;
	    public static boolean isNumber(String s){
	        int flag=0;
	        for(int i=0;i<s.length();i++){
	            if (!Character.isDigit(s.charAt(i))){
	                flag=1;
	            }
	        }
	        
	        if(flag==0 && Integer.parseInt(s)<=255 && Integer.parseInt(s)>=0){
	            return true;
	        }
	        return false;
	    }
	    public static boolean checkRegex(String regex){
	        if(Character.isDigit(regex.charAt(0)) && Character.isDigit(regex.charAt(regex.length()-1))){
	            String arr[]=regex.split(".");
	            for(int i=0;i<arr.length;i++){
	                if(!isNumber(arr[i])){
	                    return false;
	                }
	                else 
	                    return true;
	    
	            }
	        }
	            return false;
	    } 

}
