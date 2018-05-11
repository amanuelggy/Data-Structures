package com.amanuel.algos;
import java.util.*;
public class Fibonacci {
	  // Method 1: Fibonacci series in iterative way
    public void fibonacci(int j){
        int[] arr = new int[j];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < j; i++){
            
            arr[i] = arr[i-2] + arr[i-1];
        }
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
    // Method 2: Fibonacci series Recursive way, returning the fibonacci of the n index
    public int fib(int n){
        if(n < 2){
            return n;
        }
        
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        Fibonacci fib = new Fibonacci();
        fib.fibonacci(20);
        System.out.print(fib.fib(10));
    }
}
