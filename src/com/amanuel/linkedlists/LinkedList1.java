package com.amanuel.linkedlists;

public class LinkedList1 {
	private Node1 head;
	
	// Inserting Node at the head of the Node
	public void insertAtHead(int data) {
		Node1 newNode = new Node1 (data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	// Finding the length of the Node
	public int length() {
		int length = 0;
		Node1 current = this.head;
		while(current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}
	
	// Deleting from the head of the node
	public void deleteFromHead() {
		this.head = this.head.getNextNode();
	}
	
	// Searching for a Node
	public Node1 find(int data) {
		Node1 current = this.head;
		while(current != null) {
			if(current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}
	@Override
	public String toString() {
		String result = "{";
		Node1 current = this.head;
		while(current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result += "}";
		return result; 
	}
}
