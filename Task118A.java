import java.util.Scanner;

public class Task118A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str + '.';
		char[] array = str.toCharArray();
		char[] vowel = {'A','O','Y','E','U','I','a','o','y','e','u','i'};
		for (int i = 0; i < array.length-1; i++) {
			boolean flag = true;
			for (int j = 0; j < vowel.length; j++) {
				if (array[i] == vowel[j]) {
					flag = false;
				}
			}
			if (flag) {
				System.out.print("." + Character.toLowerCase(array[i]));	
			}
		}
		System.out.println();
	}
}
