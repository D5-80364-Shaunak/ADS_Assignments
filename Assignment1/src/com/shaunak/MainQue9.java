package com.shaunak;

import java.util.Arrays;

public class MainQue9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {30, 1, 29, 25, 5, 9};
		selectionSort(arr);

	}
	
	public static void selectionSort(int[] arr) {
		int temp = 0, count = 0;
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				count++;
			}
		}
		System.out.println("No. of comparisons:"+" "+ count);
		System.out.println(Arrays.toString(arr));
	}

}
