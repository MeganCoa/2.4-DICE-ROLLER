import java.util.Scanner;
import java.lang.Math;

public class diceRoller {
	
	public static int generateRandomDieRoll(int numSideDice) {
		
		return (int)(Math.random() * ((numSideDice - 1) + 1) + 1); 
	}
	
	
	public static void main(String[] args) {
		
		char choice = 'y';
		int roll = 0;
		
		Scanner scrn = new Scanner(System.in);
		
		while(choice == 'y'){
			System.out.println("How many sides should each die have?");
			int userInput = scrn.nextInt();
			
			System.out.println("Roll " + roll + ":" + "\n" + generateRandomDieRoll(userInput) + "\n" + generateRandomDieRoll(userInput));
	
			System.out.println("Roll again? (y/n): ");
			choice = scrn.next().charAt(0);
			roll++;
		}
	

	}

}
