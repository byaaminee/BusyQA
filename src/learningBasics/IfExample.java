package learningBasics;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		//simple if statement
		
		if (number > 5) {
			System.out.println("Number entered is greater than 5");
		}
		
		//if-else statement
		if (number > 5) {
			System.out.println("Number entered is greater than 5");
		}
		
		
		else {
			System.out.println("Number entered is less than or equal to 5");
		}
	
		System.out.println("Continue the rest of the program");
	

	
		//	else-if ladder
	
	if (number < 0) {
		System.out.println("Number is negative");
	} else if (number == 0) {
		System.out.println("Number is equal to 0");
	} else if (number < 10) {
		System.out.println("Number is single digit");	
	} else if (number < 100) {
		System.out.println("Number is double digit");		
	} else {
		System.out.println("Number is Trip digit");
	}
}
}
