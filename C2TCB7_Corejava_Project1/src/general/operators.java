package general;

public class operators {

	public static void main(String[] args) {
		int a =10;
		int b= 20;
		a=++a;
		
		int c=a+(b++)+(++a)-b;
		
		int  d=(a++)+b+a+(++b);
		
		System.out.println(c);
		System.out.println(d);

	}

}
