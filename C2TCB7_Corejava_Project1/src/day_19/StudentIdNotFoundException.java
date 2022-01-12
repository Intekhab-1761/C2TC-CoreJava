package day_19;

public class StudentIdNotFoundException extends Exception {
	
	int id ;
	StudentIdNotFoundException()
	{
		
	}
	public StudentIdNotFoundException(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student id not found";
	}
	@Override
	public String getMessage() {
		return "Student with id "+id+" not found";
	}
		
}
