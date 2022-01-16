package day_20_Collection_Framework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//Inserts the specified element at the beginning of the list
		list.addFirst(100);
		
		//Inserts the specified element at the end of this list
		list.addLast(500);
		
		//Inserts the specified element at the specified position in this list
		list.add(1,200);
		
		System.out.println(list);
		System.out.println("modcount");
	}

}
