package aasignment2_Yaaminee;

public class Asgnmnt_CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "   Welcome    Students   to the Automation Testing Program a !!A001!!! ****";
		
		String trimedStr = str.trim();
		int count = 0;
		
		String nStr = trimedStr.replaceAll("\\s+", " ");
		System.out.println(nStr);
		
		String [] result = nStr.split("\\s");
		
		for (int i = 0; i< result.length; i++) {
			
			//String resultS = result[i].toString();
			
			System.out.println(result[i]);

			if (!result[i].matches(".*[A-Za-z]+")) {
				System.out.println("No letters");
				continue;
			}	
			
			count = count + 1;
		}
		
		System.out.println("Number of words in the above sentence is: " + count);
		
	}

}
