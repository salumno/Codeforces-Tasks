/*

*/

import java.util.Scanner;

public class Task61A {

    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String first = sc.nextLine();
    	String second = sc.nextLine();
    	for (int i = 0; i < first.length(); i++) {
    		if (first.charAt(i) == second.charAt(i)) {
    			System.out.print("0");
    		} else {
    			System.out.print("1");
    		}
    	}
    	System.out.println();    }
}
