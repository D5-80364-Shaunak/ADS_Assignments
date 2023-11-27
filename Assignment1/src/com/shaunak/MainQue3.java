package com.shaunak;

public class MainQue3 {
	
	public static void linearSearch(int[] arr, int key) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				count += 1;
				//return i;
				break;
			}
			else
				count += 1;
		}
		System.out.println("No. of comparisons:" + count);
		//return -1;
	}
	
	public static void binarySearch(int[] arr, int key) {
		int count = 0;
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if(key == arr[mid]) {
				count += 1;
				//return mid;
				break;
			}
			else if(key > arr[mid]) {
				count += 1;
				left = mid + 1;
				//break;
			}
			else if(key < arr[mid]) {
				count += 1;
				right = mid - 1;
				//break;
			}
		}
		//return -1;
		System.out.println("No. of comparisons:" + count);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int key = 7;
		binarySearch(arr, key);
	

	}

}
