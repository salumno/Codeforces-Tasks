/*

*/

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class TaskB {

	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintStream out = new PrintStream("output.txt");
		int n = sc.nextInt();
		int counter = 0;
		int[] meter = new int[n];
		for (int i = 0; i < n; i++) {
			meter[i] = sc.nextInt();
		}
		Arrays.sort(meter);
		int max = Integer.MIN_VALUE;
		int k = 0;
		for (int i = 0; i < meter.length; i++) {
			while (k <= i && meter[i] > 2 * meter[k]) {
				k++;
			}
			counter = i + 1 - k;
			max = Math.max(max, counter);
		}
		out.println();
		out.println(n - max);
	}
}
