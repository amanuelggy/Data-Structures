package com.amanuel.algos;

public class Vowel {
	 public int vowels(String str){
         int count = 0;
         for(int i = 0; i < str.length(); i++){
        	 	String str2 = Character.toString(str.charAt(i));
             if(str2.equals("a") || str2.equals("e") || str2.equals("i") || str2.equals("o") || str2.equals("u")){
                 count++;
             }
         }
         return count;
     }
	public static void main(String[] args) {
		Vowel vow = new Vowel();
		System.out.println("Number of Vowels: " + vow.vowels("Hi there!"));
	}

}
