/*

*/

import java.util.Scanner;

public class Task59A {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] name1 = str.toCharArray();
		char[] name2 = str.toCharArray();
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < name1.length; i++) { // to upper case from lower
			if (name1[i] >= 'a' && name1[i] <= 'z') {
				name1[i] = Character.toUpperCase(name1[i]);
				count1++;
			}
		}
		for (int i = 0; i < name2.length; i++) { // to lower case 
			if (name2[i] >= 'A' && name2[i] <= 'Z') {
				name2[i] = Character.toLowerCase(name2[i]);
				count2++;
			}
		}
		if (count1 < count2) {
			for (int i = 0; i < name1.length; i++) {
				System.out.print(name1[i]);
			}
		} else {
			for (int i = 0; i < name2.length; i++) {
				System.out.print(name2[i]);
			}
		}
		System.out.println();
	}
}
