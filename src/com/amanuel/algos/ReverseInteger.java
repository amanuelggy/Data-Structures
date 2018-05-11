package com.amanuel.algos;

public class ReverseInteger {
	// Reverse an integer
    public int reverseInt(int num){
        String str = String.valueOf(num);
        String re = reverse(str);
        int result = Integer.valueOf(re);
        return result;
    }
    // Reverse a String
    public String reverse(String str){
        String str2 = "";
        for(int i = str.length()-1; i >= 0; i--){
            str2 += str.charAt(i);
        }
        return str2;
    }
	public static void main(String[] args) {
		ReverseInteger num = new ReverseInteger();
		System.out.println("reversed int: " + num.reverseInt(345));

	}

}
