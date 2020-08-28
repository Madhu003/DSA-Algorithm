package com.algo.searching;

public class binary {
	public static void main(String[] args) {
		int list[] = { 4, 5, 6, 7, 8, 9, 15, 77, 98, 105, 101, 555 };
		int element = 5155, r = list.length - 1, l = 0, foundPostion = -1;

		while (l <= r) {
			int middleIndex = (l + r) / 2;
			System.out.println("l: " + l + ", " + list[l]);
			System.out.println("r: " + r + ", " + list[r]);
			System.out.println("m: " + middleIndex + ", " + list[middleIndex]);
			System.out.println(" ========================  \n\n");

			if (list[middleIndex] == element) {
				foundPostion = middleIndex;
				break;
			}

			if (list[middleIndex] < element) {
				l = middleIndex + 1;
			} else {
				r = middleIndex - 1;
			}
		}

		System.out.println("Location is: " + foundPostion);
	}
}
