package com.shaunak;

public class MainQue7 {
	public static int nonReapEle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			System.out.println("count:" + count);
			if(count < 2) {
				//System.out.println(arr[i]);
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 3 };
		int index = nonReapEle(arr);
		if(index != -1)System.out.println(arr[index]);
		else System.out.println("Not found");

	}

}
