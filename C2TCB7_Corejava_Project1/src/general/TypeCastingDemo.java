package general;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// widening
		byte b=10;
		int i = b;
		
		System.out.println(i);
		
		float f = 22.14f;
		double d = f;
		
		System.out.println(d);
		
		char ch = 'A';
		int i3 = ch;
		System.out.println(i3);
		
		// Narrowing
		float f1 = 10.532f;
		long l = (long) f1;
		
		System.out.println(l);
		
		

	}

}
