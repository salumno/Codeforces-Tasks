/*

*/

import java.util.Scanner;

public class Task580A {		
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int last = -1;
		int k = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num >= last) {
				k++;
			} else {
				k = 1;
			}
			last = num;
			if (k > max) {
				max = k;
			}
		}
		System.out.println(max);
	}
}
