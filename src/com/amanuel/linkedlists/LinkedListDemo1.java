package com.amanuel.linkedlists;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(19);
		list.insertAtHead(20);
		
		list.deleteFromHead();
		//list.find(12);
		System.out.println("Search for number 12 found: " + list.find(12));
		System.out.println("Search for number 15 found: " + list.find(15));
		System.out.println(list);
		System.out.println("Length: " + list.length());
		list.addAtEnd(22);
		list.addAtEnd(100);
		System.out.println("after adding at the end: " + list);
		int val = 5;
		list.deleteWithValue(val);
		System.out.println("deleted number: " + val + " from list results: " + list);
		
	}
}
