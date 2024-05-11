package learningBasics;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Problem Statement - write a loop to print 1 to 10 but when 5 is encountered then break the loop
		
		
		int i = 1;
		while (i<=10) {
			
			if (i == 5) {
			System.out.println("Break condition reached the value of i is now:" + i);
			break;
			}
			System.out.println("Value of i is: "+i);
			i++;
		} 
		
		System.out.println("Out of while loop");
		
	}

}
