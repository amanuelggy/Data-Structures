package com.amanuel.linkedlists;

public class Node1 {
	private int data;
	private Node1 nextNode;
	
	public Node1(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node1 getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node1 nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public String toString() {
		return "Data: " + this.data;
	}
}
