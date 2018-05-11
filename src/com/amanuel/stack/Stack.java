package com.amanuel.stack;
// Stack using LinkedList
public class Stack {
    private static class Node{
        private Node next;
        private int data;
        private Node(int data){
            this.data = data;
        }
        public String toString(){
            return "Data: " + data;
        }    
        
    }
    public Node top;
    //check if it is empty
    public boolean inEmpty(){
        return top == null;
    }
    // check the value of the top
    public int peek(){
        if(top == null){
            return -1;
        }
        return top.data;
    }
    // add element to the top
    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    // removing the top
    public int pop(){
        if(top == null){
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    public String toString(){
        String result = "{";
        while(top != null){
            result += top.toString() + ", ";
            top = top.next;
        }
        result += "}"; 
        return result;
        }
     public static void main(String []args){
         Stack st = new Stack();
         st.push(3);
         st.push(5);
         st.push(7);
         st.push(9);
         st.push(1);
        System.out.println(st);
       // st.pop();
       // System.out.println("after pop used: " + st);
        //System.out.println("after peek used(checks the value of the first stack: " + st.peek());
        
     }
}
