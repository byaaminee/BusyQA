package learningBasics;

public class ContinueExample {

	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 10) {
			if (i == 3) {
				
				System.out.println("I will skip below code when I get executed for i=3");
				i++;
				continue;
			}
			
			System.out.println("Value of i: " + i);
			i++;
		}
		
		

	}

}
