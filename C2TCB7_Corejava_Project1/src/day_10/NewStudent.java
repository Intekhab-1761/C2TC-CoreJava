package day_10;

public class NewStudent {
	
	String name;
	String usn;
	String branch;
	String college;
	
	
          
	public NewStudent(String name, String usn, String branch, String college) {
		this.name = name;
		this.usn = usn;
		this.branch = branch;
		this.college = college;
	}
	
	public NewStudent(String usn) {
		this.usn = usn;
	}

	public NewStudent() {
		
	}
	
	public String toString() {
		String str=(name+","+usn+","+branch+","+college);
		return str;
	}


	public static void main(String[] args) {
		
		NewStudent s1= new NewStudent("Intekhab","lhceiuhfo","lfhohfeoi","sdjnu");
		System.out.println(s1.toString());
		
		NewStudent s2= new NewStudent("vbisubvi");
		System.out.println(s2.toString());
		
		NewStudent s3 = new NewStudent();
		
		s3.name="Codi";
		s3.branch="fjniuf";
		s3.college="oifw";
		s3.usn="ohfoveuhr";
		
		System.out.println(s3.toString());
		
		
	}

	

}
