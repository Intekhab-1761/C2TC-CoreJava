package day_18;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		
			try {
			int data=100/0;
			}
			catch(ArithmeticException ae)
			{
				ae.printStackTrace();
			}
			System.out.println("Exception Handling Demo");



	}

}
