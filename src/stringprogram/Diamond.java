package stringprogram;

public class Diamond {

	public static void main(String[] args) {
		String str="";
		int star=1,space=3;
		for(int i=1;i<=7;i++) {
			if(i==4) {
				str+="*".repeat(7);
				str+="\n";
				
			}
			else if(i<4) {
				str+=" ".repeat(space);
				str+="*".repeat(star);
				star+=2;
				space--;
				str+="\n";
			}
			else {
				star-=2;
				space++;
				str+=" ".repeat(space);
				str+="*".repeat(star);
				str+="\n";
				}
				
		}
		
		System.out.println(str);
	}

}
