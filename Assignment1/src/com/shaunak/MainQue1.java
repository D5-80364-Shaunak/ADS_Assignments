package com.shaunak;

import java.util.Arrays;

public class MainQue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'n', 'u', 'a', 'u', 'n'};
		boolean result = isPalindrome2(arr);
		if(result == true)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}
	//Method 1:
	public static boolean isPalindrome1(char[] arr) {
		boolean flag = false;
		int left  = 0;
		int right = arr.length - 1;
		while(left <= right) {
			if(arr[left] == arr[right]) {
				flag = true;
				left++;
				right--;
			}
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	//Method 2: by reversing string.
	public static boolean isPalindrome2(char[] arr) {
		char[] arrCpy = new char[arr.length];
		//System.out.println("arrCpy1 :" + arrCpy.toString());
		int n = arrCpy.length;
		char temp;
		for(int i = 0; i < arrCpy.length; i++) {
			temp = arr[i];
			arrCpy[n-1-i] = temp;
		}
		System.out.println(arr);
		System.out.println(arrCpy);
		//System.out.println(arr.equals(arrCpy));
		if(Arrays.equals(arr, arrCpy))
			return true;
		else
			return false;
	}

}
