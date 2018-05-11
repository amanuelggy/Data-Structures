package com.amanuel.queue;
//Queue using LinkedList
public class Queue {
	 private static class Node{
	        private int data;
	        private Node next;
	        private Node(int data){
	            this.data = data;
	        }
	        
	        @Override
	        public String toString(){
	            return "Data: " + this.data;
	        }
	    }
	    private Node head;
	    private Node tail;
	    
	    public boolean isEmpty(){
	        return head == null;
	    }
	    public int peek(){
	        return head.data;
	    }
	    public void add(int data){
	        Node node = new Node(data);
	        if(tail != null){
	            tail.next = node;
	        }
	        tail = node;
	        if(head == null){
	            head = node;
	        }
	    }
	    public int remove(){
	        int data = head.data;
	        head = head.next;
	        if(head == null){
	            tail = null;
	        }
	        return data;
	    }
	    @Override
	        public String toString(){
	            String result = "{";
	            while(head != null){
	                result += head.toString() + ", ";
	                head = head.next;
	            }
	            result += "}";
	            return result;
	        }
	    public static void main(String []args){
	        Queue que = new Queue();
	        que.add(4);
	        que.add(2);
	        que.add(3);
	        que.add(5);
	        que.add(6);
	        que.add(7);
	        que.add(8);
	        System.out.println("Queue: " + que);
	        //que.remove();
	        //System.out.println("After Dequeue Queue: " + que);
	        //que.peek();
	        
	        //System.out.println("After using Peek, Queue: " + que.peek());
	        //System.out.println("Check if the Queue is empty: " + que.isEmpty());
	       
	    }
}
