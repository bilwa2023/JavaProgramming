package stone_paper_scissor;
import java.util.Random;
import java.util.Scanner;
public class Game {
	public static String play(String ch,String sys_choice) {
				
		if(sys_choice.equals(ch)) {
			return "draw";
		}
		else if(sys_choice.equals("c")) {
			if(ch.equals("p"))
				return "system";
			else 
				return "player";
		}
		else if(sys_choice.equals("p")) {
			if(ch.equals("s"))
				return "system";
			else 
				return "player";
		}
		else if(sys_choice.equals("s")) {
			if(ch.equals("c"))
				return "system";
			else 
				return "player";
		}
		return "play again";
	}
	
	public static void main(String[] args) {
		
		int rounds,player=0,system=0;
		
		System.out.println("Welcome to Stone_Paper-Scissor");
		System.out.println("How many rounds you want to play!!");
		Scanner sc=new Scanner(System.in);
		rounds=sc.nextInt();
		
		for(int i=1;i<=rounds;i++) {
			System.out.println("Round :"+i);
			
			String arr[]= {"c","s","p"};
			Random rand=new Random(); 
			String sys_choice=arr[rand.nextInt(arr.length)];
			
			System.out.println("Enter your choice"
					+ "\n's' : Stone "
					+ "\n'p' : Paper"
					+ "\n'c' : Scissor");
			String choice=sc.next();
			while(!"spc".contains(choice.toLowerCase())) {
				System.out.println("Please enter from the given choices");
				System.out.println("Enter your choice"
						+ "\n's' : Stone "
						+ "\n'p' : Paper"
						+ "\n'c' : Scissor");
				choice=sc.next();
			}
			String winner=play(choice,sys_choice);
			System.out.println("Your Choice :" +choice  + "  System Choice : "+sys_choice);
			
			System.out.println("Result for :"+winner);
			System.out.println();
			if(winner.equals("system")) {
				system++;
			}
			else if(winner.equals("player")) {
				player++;
			}
		}
		
		System.out.println("System :"+system+ " Player :"+player);
		if(system==player) {
			System.out.println("Match Draw");
		}
		String result=system>player?"System wins":"Player wins";
		System.out.println(result);
		
		

	}

}
