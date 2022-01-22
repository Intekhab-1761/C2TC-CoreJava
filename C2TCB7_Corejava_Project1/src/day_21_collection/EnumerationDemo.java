package day_21_collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		Vector<Integer> vector =new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		
		System.out.println(vector);

		System.out.println("----------------------------------");
		
		Enumeration<Integer> elements = vector.elements();
		while(elements.hasMoreElements()) {
			Integer n = elements.nextElement();
			System.out.println(n);
			
		}
	}

}
