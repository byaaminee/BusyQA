package ObjectsExample;

public class EmployeeMain {
	
	public static void main(String [] args) {
		
		Employee obj1 = new Employee();
		
		obj1.eid = 1;
		obj1.name = "Yaaminee";
		obj1.salary = 1000d;
		obj1.jobTitle = "Automation Learner";
		
		
		
		Employee obj2 = new Employee();
		
		obj2.eid = 2;
		obj2.name = "Abc";
		obj2.salary = 10500d;
		obj2.jobTitle = "Automation Learner";
		
		obj1.display();
		obj1.bonus();
		obj2.display();
	}

}
