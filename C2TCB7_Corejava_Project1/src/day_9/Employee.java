package day_9;

public class Employee {
	int id;
	String name;
	String email;
	Float salary;
	
	public Employee() {
		
	}
	

	public Employee(int id, String name, String email, Float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}


	public Employee(int id) {
		super();
		this.id = id;
	}
	
	public String toString() {
		String str=(id+","+name+","+email+","+salary);
		return str;
	}


	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.id=25;
		System.out.println(e1.toString());
		
		Employee e2 = new Employee(33,"Java","jsgjdhgkur",6.22f);
		e2.toString();
	}

}
