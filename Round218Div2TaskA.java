/*

*/

import java.util.Scanner;
import java.util.Arrays;

public class TaskA {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] digit = new int[k];
		int[][] count = new int[k][2];
		for (int i = 0; i < (n / k); i++) {
			for (int j = 0; j < k; j++) {
				digit[j] = sc.nextInt();
				if (digit[j] == 1) {
					count[j][0]++;
				} else {
					count[j][1]++;
				}
			}
		}
		int counter = 0;
		for (int i = 0; i < k; i++) {
			//System.out.println(count[i][0] + " " + count[i][1]);
			int min = Math.min(count[i][0], count[i][1]);
			counter += min;
		} 
		System.out.println(counter);
	}
}
