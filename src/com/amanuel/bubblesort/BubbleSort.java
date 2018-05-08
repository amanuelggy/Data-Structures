package com.amanuel.bubblesort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] array = {7,6,5,4,3,2,1,0};
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length -1 -i; j++) {
				if(array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
		String str = Arrays.toString(array);
		System.out.println("sorted: " + str);
		
	}
	public static void swap(int[] arr, int i, int j ) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
