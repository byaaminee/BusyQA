package aasignment2_Yaaminee;

public class Asgnmnt2_CompareStrings_IgnoringCase {

	public static void main(String[] args) {
		// Question: Write a Java program to compare two Strings, ignoring case differences.
		
		String str1 = "Welcome to BusyQA";
		String str2 = "WelCOME To busyQa";
		String str3 = "Welcome to QA";
		
		System.out.println("1. Strings to be compared");
		System.out.println("-------------------------");
		System.out.println(str1 + "\n" + str2 + "\n");
		
		
		Boolean strCompareIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println("Is compared Strings are same by ignoring case? " + strCompareIgnoreCase + "\n");

			
		System.out.println("2. Strings to be compared");
		System.out.println("-------------------------");
		System.out.println(str1 + "\n" + str3 + "\n");
		
		
		Boolean strCompareIgnoreCase2 = str1.equalsIgnoreCase(str3);
		System.out.println("Is compared Strings are same by ignoring case? " + strCompareIgnoreCase2);
		
	}

}
