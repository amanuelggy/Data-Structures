package com.amanuel.linkedlists;

public class DoublyEndedList {
	private Node1 head;
	private Node1 tail;
	
	public void insertAtTail(int data) {
		Node1 newNode = new Node1(data);
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail != null) {
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}
		
	}
	@Override
	public String toString(){
		String result = "{";
		Node1 current = this.head;
		
		while (current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
	
}
