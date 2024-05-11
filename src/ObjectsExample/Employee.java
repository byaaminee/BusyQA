package ObjectsExample;

public class Employee {

	//variables
	int eid;
	String name;
	double salary;
	String jobTitle;

	void display() {
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(jobTitle);
	}
	
	void bonus() {
		System.out.println((salary*10)/100);
	}
	
}
