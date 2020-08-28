package com.pattern;

public class Triangle {

	public static void main(String[] args) {
		int n = 5;
		int charAss = 65;
		
		for(int i = 0  ; i < n ; i++) {
			for(int j = n -1 ; j > i ; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0 ; j <= i ; j++) {
				System.out.print((char)(charAss + i) + " ");
			}
			System.out.println();
		}

	}

}
