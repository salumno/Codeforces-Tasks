/*
Created by Melnikov Semen

5
5 4
5 4
1 5
5 5
3 3

*/

import java.util.Scanner;

public class TestA {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int upperSum = 0;
		int lowerSum = 0;
		int counter = -1;
		boolean flag = false;
		int lower;
		int upper;
		for (int i = 0; i < n; i++) {
			upper = sc.nextInt();
			lower = sc.nextInt();
			upperSum += upper;
			lowerSum += lower;
			if (upper % 2 != lower % 2) {
				flag = true;
			}
		}
		if (upperSum % 2 == 0 && lowerSum % 2 == 0) {
			counter = 0;
		}
		if (upperSum % 2 != lowerSum % 2) {
			counter = -1;
		}
		if (upperSum % 2 != 0 && lowerSum % 2 != 0 && flag) {
			counter = 1;
		}
		System.out.println(counter);
	}
}
