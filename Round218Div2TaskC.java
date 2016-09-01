/*

*/

import java.util.Scanner;
import java.util.Arrays;

public class TaskC {
	
	public static void printArray (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static boolean currentMoney (int[] c, int[] n, int[] p, long x, long money) {
		boolean flag = false;
		if ((Math.max(0, x*c[0]-n[0])*p[0] + Math.max(0, x*c[1]-n[1])*p[1] + Math.max(0, x*c[2]-n[2])*p[2]) <= money) {
			flag = true;
		}
		return flag;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] n = new int[3];
		int[] p = new int[3];
		int[] c = new int[3];
		for (int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			p[i] = sc.nextInt();
		}
		long money = sc.nextLong();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'B') {
				c[0]++;
			}
			if (str.charAt(i) == 'S') {
				c[1]++;
			}
			if (str.charAt(i) == 'C') {
				c[2]++;
			}
		}
		long l = 0;
		long r = (long)Math.pow(10, 16);
		long max = Long.MIN_VALUE;
		while (r - l > 1) {
			long mid = (r + l + 1) / 2;
			if (currentMoney (c, n, p, mid, money)) {
				if (mid > max) {
					max = mid;
				}
				l = mid+1;
			} else {
				r = mid-1;
			}
		}
		System.out.println(max);
	}
}
