package learningBasics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Enter a day of the week (1-7)");
		Scanner scanner = new Scanner(System.in);
		
		int dayNumber = scanner.nextInt();
		String dayName = "";
		scanner.close();
		
		//character given with 'single' quote
		
		switch(dayNumber) {
		
		case 1:
			dayName = "Monday";
			break;
			
		case 2:
			dayName = "Tuesday";
		break;
			
		default:	
			dayName = "invalid day number";
		}
	

	System.out.println("The day is " + dayName);
	}
}
