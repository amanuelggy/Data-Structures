package com.amanuel.linkedlists;

import java.util.*;

public class ArrayListExample {
   public static void main(String []args){
   LinkedList states = new LinkedList();
   states.add("Alaska");
   states.add("Arizonal");
   states.add("Arkanssa");
   states.add("California");
   states.add("colorado");
   states.add("Connecticut");
   
   states.addFirst("Alabama");
   System.out.println("list of the states: " +states);
   System.out.println("Printing the Last state: " + states.getLast());
   
   ListIterator iterator = states.listIterator(states.size());
  
   //Printing last to first:
   while(iterator.hasPrevious()){
       System.out.println(iterator.previous());
   }
   //Printing first to last:
   while(iterator.hasNext()) {
	   System.out.println(iterator.next());
   }
   
    }
}
