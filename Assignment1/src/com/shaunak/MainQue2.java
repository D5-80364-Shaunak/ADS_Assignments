package com.shaunak;

public class MainQue2 {
	
	public static int linearSearchRev(int[] arr, int key) {
		for(int i = arr.length - 1; i > 0;  i--) {
			if(key == arr[i]) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 5, 1, 2};
		int key = 6;
		int index = linearSearchRev(arr, key);
		if(index != -1) System.out.println("Key found at index :" + index);
		else System.out.println("Key not found.");

	}

}
