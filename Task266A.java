/*

*/

import java.util.Scanner;

public class Task266A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int counter = 0;
		char[] letters = str.toCharArray();
		for (int i = 0; i < letters.length-1; i++) {
			if (letters[i] == letters[i+1]) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
