package assignments;

import java.util.Scanner;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		StringBuffer sb=new StringBuffer(in.next());
		System.out.println(sb.reverse());
		

	}

}
