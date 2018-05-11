package com.amanuel.algos;
import java.util.*;
public class Reverse {
	// Reverse a String
    public String reverse(String str){
        String str2 = "";
        for(int i = str.length()-1; i >= 0; i--){
            str2 += str.charAt(i);
        }
        return str2;
    }
    public static void main(String []args){
        Reverse s = new Reverse();
       System.out.println(s.reverse("Happy"));
    }
}
