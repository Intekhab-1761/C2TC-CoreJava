package general;

public class VariablesDemo {
			//Class variable
			static int a=1024;
			int b;
			
			void func1() {
				int c;
				c=10;
				System.out.println("class variables " +a+" "+b );
				System.out.println("Local variables " +c);
				a=7890; //overriding
				b=23;
				System.out.println("Class variables " +a+" "+b);
			}
			
			void func2() {
				func1();
			}
	public static void main(String[] args) {
		VariablesDemo obj = new VariablesDemo();
		obj.func1();
		obj.func2();
		
		

	}

}
