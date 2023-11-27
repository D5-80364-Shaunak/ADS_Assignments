package com.shaunak;

public class MainQue6 {
	public static int linearSearch(int[] arr, int key, int countOcc) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				count += 1;
				if(count == countOcc) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2,1, 3, 1, 4, 1,5};
		int key = 1;
		int occ = 4;
		int index = linearSearch(arr, key, occ);
		if(index != -1) System.out.println("Key found at index:" + index);
		else System.out.println("Key not found!");

	}

}
