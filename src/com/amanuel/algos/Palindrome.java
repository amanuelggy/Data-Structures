package com.amanuel.algos;

public class Palindrome {
	 // Check if a String is a Palindrome or not
    public boolean palindrome(String str){
        String str2 = "";
        for(int i = str.length()-1; i>=0; i--){
            str2 += str.charAt(i);
        }
        if(str.equals(str2)){
            
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		Palindrome str = new Palindrome();
		System.out.println(str.palindrome("ama"));

	}

}
