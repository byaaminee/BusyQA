package learningBasics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1323 = new Scanner(System.in);
		
		
		System.out.println("Enter the Integer value of A: ");
			
	
		int a = scanner1323.nextInt();
		
		System.out.println("Enter the Float value of A1: ");
		
		float a1 = scanner1323.nextFloat();
		
		scanner1323.nextLine();
		
		System.out.println("Enter the String value of S1: ");
		
		String s1 = scanner1323.nextLine();
		// next will take only one word if a sentence is given
		
		//enter will be taken as /n
		
		System.out.println("Display the int value user entered for a: "+ a);
		System.out.println("Display the float value user entered for A1: "+ a1);
		System.out.println("Display the String value user entered for S1: "+ s1);
		scanner1323.close();
		
	}

}
