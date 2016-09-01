/*
43
475 2165 8771 7146 8980 7209 9170 9006 6278 6661 4740 6321 7532 6869 3788 7918 1707 5070 3809 5189 2494 8255 1123 3197 190 5712 9873 3286 9997 133 9030 3067 8043 5297 5398 4240 8315 2141 1436 3297 247 8438 2300
0111011100100011110010011110011011010001101
*/

import java.util.Scanner;

public class TestC {

	public static int arraySum (int x, int[] arr) {
		String number = Integer.toBinaryString(x);
		int sum = 0;
		for (int i = number.length() - 1; i > -1; i--) {
			if (number.charAt(i) == '1') {
				sum += arr[number.length() - i - 1];
			}
		}
		return sum;
	}
	
	public static int fromBinaryToDecimal (String binaryNumber) {
		int x = 0;
		for (int i = binaryNumber.length() - 1; i > -1; i--) {
			int num = Character.getNumericValue(binaryNumber.charAt(i));
			x = 2*x + num;
		}
		return x;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		int max = Integer.MIN_VALUE;
		String binaryM = sc.nextLine();
		int m = fromBinaryToDecimal(binaryM);
		for (int i = 0; i <= m; i++) {
			int currSum = arraySum(i, arr);
			if (currSum > max) {
				max = currSum;
			}
		}
		System.out.println(max);
	}
}
