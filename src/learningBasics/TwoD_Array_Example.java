package learningBasics;

import java.util.Scanner;

public class TwoD_Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows= scanner.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int columns = scanner.nextInt();
		
		int [][] array = new int [rows][columns];
		
		System.out.println("Enter the values for the array:");
		
		
		//add 2 to all elements
		for (int i = 0; i<rows; i++) {
			for (int j=0; j<columns ; j++) {
				array[i][j] = scanner.nextInt();				
				
			}
		}
		
		scanner.close();
		
		System.out.println("Add 2 for all the values in the 2D array and display the values");
		
		for (int i = 0; i<rows; i++) {
			for (int j=0; j<columns ; j++) {
				System.out.print(array[i][j]+2 + "\t");
			}
		
			System.out.println();
			
		}
		
	}

}
