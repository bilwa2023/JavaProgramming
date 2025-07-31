package stringprogram;

public class Butterfly {

	public static void main(String[] args) {
		String str="";
		int star=1,space=3;
		for(int i=1;i<=5;i++) {
			if(i==3) {
				str+="* ".repeat(5);
				str+="\n";
			}
			else if(i<3) {
				str+="* ".repeat(star);
				str+="  ".repeat(space);
				str+="* ".repeat(star);
				star++;
				space-=2;
				str+="\n";
			}
			else{
				space+=2;
				star--;
				str+="* ".repeat(star);
				str+="  ".repeat(space);
				str+="* ".repeat(star);
				str+="\n";
			}
		}
		System.out.println(str);
	}

}
