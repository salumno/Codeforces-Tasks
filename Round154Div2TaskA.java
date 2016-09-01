/*
*/

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class TaskA {

	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintStream out = new PrintStream("output.txt");
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[] queue = new char[n+m];
		int k = 0;
		if (n < m) {
			k = n;
		} else {
			k = m;
		}
		int l = 0;
		for (int i = 0; i < k; i++) {
			if (k == n) {
				queue[l] = 'G';
				queue[l+1] = 'B';
			} else {
				queue[l] = 'B';
				queue[l+1] = 'G';
			}
			l += 2;
		}
		for (int i = 0; i < Math.abs(m-n); i++) {
			if (k == n) {
				queue[l] = 'G';
			} else {
				queue[l] = 'B';
			}
			l++;
		}
		for (int i = 0; i < queue.length; i++) {
			out.print(queue[i]);
		}
		//out.close;
	}
}
