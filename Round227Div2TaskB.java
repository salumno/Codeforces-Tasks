/*

*/

import java.util.Scanner;
import java.util.Arrays;

public class TaskB {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int m = sc.nextInt();
		int[] num1 = new int[n];
		int[] num2 = new int[m];
		for (int i = 0; i < n; i++) {
			num1[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			num2[i] = sc.nextInt();
		}
		int i;
		int j;
		for(i = 0, j = 0; i < n && j < m; j++) {
			if (num1[i] <= num2[j]) {
				i++;
			}
		}
		System.out.println(n - i);
	}
}
