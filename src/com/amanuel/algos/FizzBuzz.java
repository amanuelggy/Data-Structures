package com.amanuel.algos;

public class FizzBuzz {
	// Write a program that prints the numbers from 1 to n. 
	//But for multiples of three print "fizz" instead of the number and 
	//for the multiples of five print "buzz". For numbers which are multiples of both three and five print "fizzbuzz".
	public void fizzBuzz(int n) {
		for(int i = 1; i <= n; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			}
			if(i % 3 == 0) {
				System.out.println("fizz");
			}
			if(i % 5 == 0) {
				System.out.println("buzz");
			}else {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		FizzBuzz fizz = new FizzBuzz();
		fizz.fizzBuzz(15);
	}
}
