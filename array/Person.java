package arrayTest;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	public Person(String first, String last, int a){		//constructor
		firstName = first;
		lastName = last;
		age = a;
	}
	public void displayPerson(){	//display info of each person
		System.out.print("first name: " + firstName);
		System.out.print(" , last name: " + lastName);
		System.out.println(", age: " + age);
	}
	public String getLast(){	//get the lastname
		return lastName;
	}
}
