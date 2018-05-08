package com.amanuel.selectionSort;

import java.util.Arrays;

public class SelectionSort {
	
	public void selectSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i; j < arr.length; j++) {
				if( arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				swap(arr, i, min);
			}
		}
		String str = Arrays.toString(arr);
		System.out.println("Selection sort Sorted: " + str);
		
	
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] array = {9,7,8,6,5,4,3,2,4,0,1};
		sort.selectSort(array);
	}
}
