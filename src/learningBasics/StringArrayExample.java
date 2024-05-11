package learningBasics;

public class StringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Yaaminee is AT Learner";
		int lengthOfString = str.length();
		System.out.println("Length of the String is: " + lengthOfString);
		
		//Concat
		String str2 = " of April Batch";
		String concatString = str.concat(str2);
		System.out.println("Concat final string is: " + concatString);
	
		//Trim
		String strWithSpaces = "   Trim me! ";
		String trimedStr = strWithSpaces.trim();
		System.out.println("Trimmed String is: "+trimedStr );
		
		//Find the particular char using index value
		String strCharAt = "Yaamine is AT Learner";
		char charAtIndex3 = strCharAt.charAt(3);
		System.out.println("3rd character in the Sentence: "+ charAtIndex3);
	
		//contains the out put is boolean
		
		String str5 = "Hello Students at BusyQA";
		boolean containHello = str5.contains("BusyQA");
		System.out.println("String has BusyQA?? " + containHello);
		
		//equals
		String strcmp1 = "Welcome";
		String strcmp2 = "welcome";
		boolean cmpValue = strcmp1.equals(strcmp2);
		System.out.println("String values are equal? " + cmpValue);
		
		//equals ignore case
		boolean iseqlIgnoreCase = strcmp1.equalsIgnoreCase(strcmp2);
		System.out.println("String comparison with equalsIgnoreCase: " + iseqlIgnoreCase);
	
		//Substring
		String str6 = "hello Students at busyQA";
		String subString = str6.substring(7);
		System.out.println("Substring from index7: " + subString);
		
		String subString2 = str6.substring(1, 3);
		System.out.println("Substring from index 1 to 3: " + subString2);
	
		
		//replace
		String str7 = "Hello World";
		String replaceString = str7.replace("World", "Universe");
		System.out.println("Replaced String " + replaceString);
		
		//toLowerCase
		String str8 = "HELLO WorLD";
		String lowerCaseStr = str8.toLowerCase();
		System.out.println("Lower Case String: " + lowerCaseStr);
	
		//toUpperCase
		String str9 = "hello World";
		String upperCaseStr = str8.toUpperCase();
		System.out.println("Upper Case String: " + upperCaseStr);
		
	}

}
