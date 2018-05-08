package com.amanuel.tree;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
	Node root;
    public static boolean contains(Node root, int value) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
	    	Node focusNode = root;
			while(focusNode.value != value) {
				if (value < focusNode.value) {
					focusNode = focusNode.left;
				}
				else {
					focusNode = focusNode.right;
				}
				if(focusNode == null) {
					return false;
				}
			}
			return true;
    }
//    public Node findNode(int value) {
//    		Node focusNode = root;
//    		while(focusNode.value != value) {
//    			if (value < focusNode.value) {
//    				focusNode = focusNode.left;
//    			}
//    			else {
//    				focusNode = focusNode.right;
//    			}
//    			if(focusNode == null) {
//    				return null;
//    			}
//    		}
//    		return focusNode;
//    }
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        System.out.println("search result is: ");
        System.out.println(contains(n2, 3));
    }
}
