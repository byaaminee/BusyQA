package learningBasics;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int[] intArray = {11,12,13,14,15,16,17}; //initialize an array
//		
//		int size = intArray.length; // find the length of an array
//		
//		//access the array and display
////		for (int i = 0; i<size; i++) {
////			System.out.println("Value of array at index " + i + " is : "+ intArray[i]);
////		}
//		
//		
//		intArray[2] = intArray[2]*10;
//		System.out.println("Updating the 3rd element as "+intArray[2]);
//		
//		for (int i = 0; i<size; i++) {
//			intArray[i] += 100; 
//			}
//		
//		for (int i = 0; i<size; i++) {
//			System.out.println("Value of array at index " + i + " is : "+ intArray[i]);
//		}
//		
//		float[] floatArray = {11.1f, 12.5f, 15.5f};
//		
//		double[] doubleArray = {65656.454, 545454.565,325,232,26288.25};
//		
//		char[] charArray = {'M', 'T', 'W', 'F', 'S'};
//		
//		String[] stringArray = {"Apple", "Banana", "Orange"};
//		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of Rows: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter the number of Columns: ");
		int columns = scanner.nextInt();
		
		
		int[][] arrayVar = new int [rows][columns];
		
		System.out.println("Enter the elements of the array");
		
		for (int i =0; i<rows;i++) {
			for(int j=0; j<columns; j++) {
				arrayVar[i][j]=scanner.nextInt();
			}	
		}
	
		//display  the array:

		for (int i =0; i<rows;i++) {
			for(int j=0; j<columns; j++) {
				System.out.println("Row value: "+ i + " Column Value:" + j + " Element at this indext is : " + arrayVar[i][j]);
			}	
		}
		
		scanner.close();
		
	}

}
