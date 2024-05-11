package aasignment2_Yaaminee;

public class Asgnmnt2_RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "   Welcome  Yaaminee 		    to the  AUTOMATION 	"
				+ "	Class";
		String strRemovedSpaces = str.replaceAll("\\s+", " ");
		
		System.out.println("String before removing white spaces: " + "\n" + str + "\n" + "\n");
		System.out.println("String after removing white spaces: " + "\n" + strRemovedSpaces);
		
	}

}
