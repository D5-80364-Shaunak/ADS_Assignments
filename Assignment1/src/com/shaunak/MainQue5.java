package com.shaunak;

public class MainQue5 {
	public static int binarySearchDesc(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key > arr[mid]) {
				right = mid - 1;
			}
			else if(key < arr[mid]) {
				left = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 4, 3, 2, 1, 0};
		int key = 3;
		int index = binarySearchDesc(arr, key);
		if(index != -1) System.out.println("Key is found at index:" + index);
		else System.out.println("Key is not found!");
		
	}

}
