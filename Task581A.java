/*

*/

import java.util.Scanner;

public class Task581A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		System.out.print(min + " ");
		int day = max - min;
		if (day > 1) {
			System.out.print(day / 2);
		} else {
			System.out.print("0");
		}
		System.out.println();
	}
}
