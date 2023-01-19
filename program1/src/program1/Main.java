package program1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First program
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll to Check Score ?");
		int sport=sc.nextInt();
		switch(sport)
		{
		case 1,5,9,13,17,21->System.out.println("You are in SAPPHIRE !!");
		case 2,6,10,14,18,22->System.out.println("You are in PERL !!");
		case 3,7,11,15,19,23->System.out.println("You are in RUBY !!");
		case 4,8,12,16,20,24->System.out.println("You are in EMERALD !!");
		default->System.out.println("INVALID ROLL NO -_-");
		}
		
	}

}
