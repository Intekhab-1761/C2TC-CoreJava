package general;

public class Variable_Demo1 {
	//class variable
	final static int a=1024;
	int b;
	void func1() {
		final int c;
		c=10;
		System.out.println("class variables " +a+" "+b);
		System.out.println("local variables " +c);
		b=56;
		System.out.println("class variables " +a+" "+b);
	}
	void func2() {
		System.out.println("class variables " +a+" "+b);
	}
	public static void main(String[] args) {
		Variable_Demo1 obj= new Variable_Demo1();
		System.out.println(obj.b);
		System.out.println(Variable_Demo1.a);

	}

}
