package com.shaunak;

public class MainQue8 { 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int element = 10;
		int[] arr = {10, 20, 15, 3, 4, 4, 1};
		int rank = rankOfElement(element, arr);
		System.out.println("Rank of"+" " + element+" " +"is:"+
		" " + rank);

	}
	
	public static int rankOfElement(int ele, int[] arr) {
		int count = 0;
		for(int e: arr) {
			if(e <= ele) count++;
		}
		return count;
	}

}
