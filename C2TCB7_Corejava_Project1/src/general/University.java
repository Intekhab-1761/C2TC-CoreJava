package general;

class Department {
	String departmentName;
	int totalFaculty;
	int totalStudent;

	int calcStrength() {
		System.out.println("Department strength");
		return totalFaculty + totalStudent;
	}
}

class LibraryCard {
	String name;
	int noOfBooks;

	void cardDetails() {
		System.out.println("Library Card Details"+"\n"+"Card holder name: " + name + "\n" + "Books issued: " + noOfBooks);
	}
}

class Student {
	String name;
	String usn;
	String department;

	void studentDetails() {
		System.out.println("Student Details "+"\n"+"Student name: " + name + "\n" + "USN: " + "\n" + "Name of the Department");
	}
}

class Hostel {
	int noOfRooms;
	int roomsOccupied;

	void hostelDetails() {
		System.out.println("Hostel Details "+"\n"+"No of available rooms: " + (noOfRooms - roomsOccupied));
	}
}

class HOD {
	String name;
	String department;
	String qualification;
	int exp;
	int age;

	void hodDetails() {
		System.out.println("HOD"+"\n"+"Name of the HOD: " + name + "\n" + "Department name: " + department + "\n"
				+ "Qualification: " + qualification + "\n" + "Exp: " + exp + "\n" + "Age: " + age);
	}
}

public class University {

	public static void main(String[] args) {

		Department department1 = new Department();

		department1.departmentName = "Electronics & Communications";
		department1.totalFaculty = 52;
		department1.totalStudent = 98;

		System.out.println("Total strength: " + department1.calcStrength());

		LibraryCard card1 = new LibraryCard();

		card1.name = "Intekhab";
		card1.noOfBooks = 2;

		card1.cardDetails();

		Student student1 = new Student();

		student1.department = "Electronics & Communications";
		student1.name = "Intekhab";
		student1.usn = "1AB16EC042";
		student1.studentDetails();

		Hostel hostel1 = new Hostel();

		hostel1.noOfRooms = 50;
		hostel1.roomsOccupied = 37;

		hostel1.hostelDetails();

		HOD hod1 = new HOD();

		hod1.name = "Intekhab";
		hod1.department = "Electronics & Communications";
		hod1.qualification = "B.E";
		hod1.exp = 0;
		hod1.age = 25;

		hod1.hodDetails();

	}

}
