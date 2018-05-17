package com.amanuel.algos;

public class StepStars {
	 public void steps(int n){
	        String str = "";
	        for(int i = 0; i < n; i++){
	            str += "*";
	            System.out.println(str);
	        }
	    }
	 public static void main(String[] args) {
		 StepStars stp = new StepStars();
		 stp.steps(10);
	 }
}
