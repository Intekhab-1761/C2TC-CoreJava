package assignments;

import java.util.Scanner;

public class StringReverse {

	String string;
	char[] ch;
	char[] rs;

	void reverse(String string) {

		this.string = string;
		ch = string.toCharArray();
		int j=0;
		for (int i = string.length() - 1; i >= 0; i--) {
			while(j<string.length()){
				ch[j]=string.charAt(i);
				j++;
				break;
			}
		}

		System.out.println(ch);

	}

	public static void main(String[] args) {

		StringReverse str = new StringReverse();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.next();
		str.reverse(s);

	}

}
