/*

*/

import java.util.Scanner;
import java.util.Arrays;

public class TaskC {

	public static boolean numComparison (String num1, String num2) {
		boolean ans = true;
		int flag = num1.compareTo(num2);
		if (flag < 0) {
			ans = false;
		}
		return ans;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int currLength = 0;
		long counter = 0;
		for (int i = num.length() - 1; i > -1; i--) {
			if (num.charAt(i) == '0') {
				currLength++;
			} else {
				currLength++;
				if (i > currLength) {
					counter++; 
					currLength = 0;
				} else {
					if (i < currLength) {
						counter++;
						break;
					} else {
						if (numComparison(num.substring(0,i), num.substring(i,i+currLength))) {
							counter++;
							currLength = 0;
						} else {
							counter++;
							break;
						}
					}
				}
			}
		}
		System.out.println(counter);
	}
}
