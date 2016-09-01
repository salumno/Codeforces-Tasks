/*

*/

import java.util.Scanner;

public class TaskA {

	public static void timePrint(int newT1, int newT2) {
		if (newT1 < 10) {
			System.out.print("0");
		}
		System.out.print(newT1 + ":");
		if (newT2 < 10) {
			System.out.print("0");
		}
		System.out.println(newT2);
	}
	
	public static int timeCharToInt (char[] h) {
		int k = Character.getNumericValue(h[0]) * 10 + Character.getNumericValue(h[1]);
		return k;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); // current time
		String t = sc.nextLine(); // slipping time
		char[] h1 = new char[2];
		char[] h2 = new char[2];
		char[] m1 = new char[2];
		char[] m2 = new char[2];
		h1[0] = s.charAt(0);
		h1[1] = s.charAt(1);
		m1[0] = s.charAt(3);
		m1[1] = s.charAt(4);
		h2[0] = t.charAt(0);
		h2[1] = t.charAt(1);
		m2[0] = t.charAt(3);
		m2[1] = t.charAt(4);
		int integerH1 = timeCharToInt(h1);
		int integerM1 = timeCharToInt(m1);
		int integerH2 = timeCharToInt(h2);
		int integerM2 = timeCharToInt(m2);
		int newH = 0;
		int newM = 0;
		if (integerH1 - integerH2 >= 0) {
			newH = integerH1 - integerH2;
		} else {
			newH = 24 + (integerH1 - integerH2);
		}
		if (integerM1 - integerM2 >= 0) {
			newM = integerM1 - integerM2;
		} else {
			newM = 60 + (integerM1 - integerM2);
			if (newH - 1 >= 0) {
				newH--;
			} else {
				newH = 23;
			}
		}
		timePrint(newH, newM);		
	}
}
