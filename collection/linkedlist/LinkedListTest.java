package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		System.out.println("add()");
		list.add(1, "E");
		System.out.println(list);
		
		System.out.println("addFirst()");
		list.addFirst("F");
		System.out.println(list);
		
		System.out.println("addLast");
		list.addLast("M");
		System.out.println(list);
		
		System.out.println("remove()");
		list.remove(1);
		System.out.println(list);
		
		System.out.println("removeFirst()");
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("removeLast()");
		list.removeLast();
		System.out.println(list);
		
		
	}//////main
}///////////class
