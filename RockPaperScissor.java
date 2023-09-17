package oops;

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//0 for Rock
		//1 for Paper
		//2 for Scissor
		System.out.println("Enter 0 for Rock,1 for Paper,2 for Scissor");
		int userInput = s.nextInt();
		if(userInput == 0) {
			userInput = 0;
		}else if(userInput == 1) {
			userInput = 1;
		}else if(userInput == 2) {
			userInput = 2;
		}else {
			return;
		}
		Random random = new Random();
		int computerInput = random.nextInt(3);
		
		if(userInput == computerInput) {
			System.out.println("Draw");
		}
		else if(userInput == 0 && computerInput == 2 || userInput == 1 && userInput == 0
				&& userInput == 2 && computerInput == 1) {
			System.out.println("You WIN!");
		}else {
			System.out.println("Computer Win!");
		}
//		System.out.println("Computer choice: " + computerInput);
		if(computerInput == 0) {
			System.out.println("Computer choice: Rock");
		}
		else if(computerInput == 1) {
			System.out.println("Computer choice: Paper");
		}
		else if(computerInput == 2) {
			System.out.println("Computer choice:Scissors");
		}

	}

}
