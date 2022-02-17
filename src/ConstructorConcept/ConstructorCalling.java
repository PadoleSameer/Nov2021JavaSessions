package ConstructorConcept;

public class ConstructorCalling {

	String name;
	int age;
	double salary;
	
	public ConstructorCalling(String name) {
		this.name = name;
	}

	public ConstructorCalling(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ConstructorCalling(String name, int age, double salary) {
		this(name);
		//this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public ConstructorCalling(String name, double salary) {
	
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
	
		ConstructorCalling obj = new ConstructorCalling("Tom", 24, 250000);
		System.out.println("Name :"+obj.name + " Age: "+obj.age+" Salary: "+ obj.salary);
	}

}
