package com.algo.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	static int[] sort(int list[]){
		int n = list.length;
		for(int i = 1 ; i < n ; i++) {
			int j = i-1;
			int key = list[i];
			
			while(j >= 0 && list[j] > key) {
				list[j+1] = list[j];
				j--;
			}
			list[j + 1] = key;
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(sort(new int[] {5,7,6,8,4,3})));
	}

}
