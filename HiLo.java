package hiLo;

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		//Scanner obj that gets keyboard input
		Scanner scan = new Scanner(System.in);
		
		String again = "";
		
		do {
			//Create a random number 1-100
			//(int): type cast number to integer / takes away decimals
			int randNum = (int) (Math.random() * 100 +1 );
			//System.out.println(randNum);
			
			int guess = 0;
			
			while(guess != randNum) {
				System.out.println("Guess a number between 1 and 100:");
				
				guess = scan.nextInt();
				
				if (guess > randNum) {
					System.out.println(guess + " is too high! Guess again.");
				}
				else if (guess < randNum) {
					System.out.println(guess + " is too low! Guess again.");
				}
				else {
					System.out.println("Yay! " + guess + " is the number!");
				}
			} //End of while loop
			
			System.out.println("Would you like to play again? (y/n)");
			again = scan.next();
		} while(again.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye!");
		scan.close();
	}

}
