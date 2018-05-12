package com.amanuel.algos;

public class MaxChar {
	 //Maximum character occurance in a String
    public int maxChar(String str){
        int total1 = 0;
        int total2 = 0;
        String charMax2 = "";
        String charMax = "";
        for(int i = 0; i < str.length(); i++){
            String ch = Character.toString(str.charAt(i));
            int count = 0;
            for(int j =i; j < str.length(); j++){
                String str2 = Character.toString(str.charAt(j));
                if ( str2.equals(ch)){
                    count++;
                }
            }
            if(count == total1){
                total2 = count;
                charMax2 = ch;
            }
            if(count > total1){
                total1 = count;
                charMax = ch;
            }
            
        }
        if( total1 > total2){
            System.out.println("In the word: " + str + ", The Character: " + charMax + " repeated: " + total1 + " times.");
        }
        else{
            System.out.println("In the word: " + str + ", The Characters: " + charMax + " and " + charMax2 + " repeated equaly: " + total1 + " times.");
        }
        return total1;
        
    }
    
	public static void main(String[] args) {
		MaxChar result = new MaxChar();
		int num = result.maxChar("Happy");

	}

}
