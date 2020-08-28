package com.algo.searching;

public class Linear {

	public static void main(String[] args) {
		int list[] = { 5, 9, 7, 6, 8, 4, 15, 77 };
		int element = 8;
		
		for(int i = 0 ; i < list.length ; i++) {
			if(list[i] == element) {
				System.out.println("Location is: " + i);
				break;
			}
		}
		
	}

}
