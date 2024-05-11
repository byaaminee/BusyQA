package learningBasics;

public class OperatorLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;
		int b = 5;
		
////		//Addition
////		int sum = a + b;
////		System.out.println("Sum is : " + sum );
////		
////		//Substraction
////		int diff = a - b;
////		System.out.println("Difference is : " + diff );
////		
////		//Division
////		int quo = a/b;
////		System.out.println("Quo is : " + quo );
////		
////		//%modulos
////		int rem = a/b;
////		System.out.println("Rem is : " + rem );
////		
////		//++ increment operator
////		System.out.println("Initial value of a:" + a );
////		System.out.println("Decrementing the value of a Pre-Increment: " + ++a );
////		System.out.println("Initial value of b:" + b );
////		System.out.println("Decrementing the value of b Post-Increment: " + b++ );
////		System.out.println("Decrementing the value of b Post-Increment: " + b );
////		
//		//-- decrement operator
//		System.out.println("Initial value of a:" + a );
//		System.out.println("Incrementing the value of a Pre-Decrement: " + --a );
//		System.out.println("Initial value of b:" + b );
//		System.out.println("Incrementing the value of b Post-Decrement: " + b-- );   //b = b-1 ==> print b 
//		System.out.println("Incrementing the value of b Post-Decrement: " + b );
//				
		
//		a = 5;
//		b = 5;
//		boolean isEqual = a==b;
//		boolean isNotEqual = a!=b;
//		boolean isGreaterThan = a>b;
//		boolean isLessThan = a<b;
//		boolean isGreaterOrEqual = a>=b;
//		boolean isLessOrEqual = a<=b;
//		
//		
//		System.out.println("Value of a: "+ a);
//		System.out.println("Value of a: "+ b);
//		System.out.println("Value of isEqual: "+ isEqual);
//		System.out.println("Value of isNotEqual: "+ isNotEqual);
//		System.out.println("Value of isGreaterThan: "+ isGreaterThan);
//		System.out.println("Value of isLessThan: "+ isLessThan);
//		System.out.println("Value of isGreaterOrEqual: "+ isGreaterOrEqual);
//		System.out.println("Value of isLessOrEqual: "+ isLessOrEqual);
//		
		
//		a = 6;
//		b = 5;
//		
//		System.out.println("Initial value of A is : "+ a);
//
//		System.out.println("Initial value of B is : "+ b);
//		boolean isEqual = (a==b);
//		boolean isNotEqual = (a!=b);
//		boolean isGreaterThan = (a>b);
//		boolean isLessThan = (a<b) ;
//		boolean isGreaterOrEqual = (a >= b);
//		boolean isLessOrEqual = (a <= b);
//		
//		System.out.println("condition value equals check: isEqual :" + isEqual);
//        System.out.println("condition value equals check: isNotEqual :" + isNotEqual);
//        System.out.println("condition value equals check: isGreaterThan :" + isGreaterThan);
//        System.out.println("condition value equals check: isLessThan :" + isLessThan);
//        System.out.println("condition value equals check: isGreaterOrEqual :" + isGreaterOrEqual);
//        System.out.println("condition value equals check: isLessOrEqual :" + isLessOrEqual);
//		
        
        
		//Logical And Operator &&
		
		a = 6;
		b = 7;
		int c = 4;
		
		boolean logicalAnd = ((a>b) && (b>c));
		System.out.println("Logical value equals check: logicalAnd : " + logicalAnd);	
		
		
		boolean d = true;
		boolean e = false;
		boolean logicalAnd1 = d && e;
		System.out.println("Logical value equals check: logicalAnd1 : " + logicalAnd1);	
		
	
		boolean logicalOR = ((a>b) || (b>c));
		System.out.println("Logical value equals check: logicalOR : " + logicalOR);	
		
		boolean logicalOR1 = d || e;
		System.out.println("Logical value equals check: logicalOR1 : " + logicalOR1);	
		
		boolean logicalNot = (!d);
		System.out.println("Logical value equals check: logicalNot :" + logicalNot);
		
		
		
		String abc = "Hellow Busy World";
		String bcd = "Java Program";
		String finalstr = abc + bcd;
		System.out.println("Final string value: " + finalstr);
		
		
	}

}
