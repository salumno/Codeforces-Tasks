/*
Multiplication of "long" and numbers.'
*/

import java.util.Scanner;

public class Multiplication {

	public static void addition (int[] num1, int[] num2){
        int k = 0;
        for (int i = 1; i < num2.length ; i++){ 
            int currNumber = (num1[i]+ num2[i] + k) % 10;
            k = (num1[i]+ num2[i] + k) / 10;
            num1[i] = currNumber;
        }
    }

	public static void arrPrinter (int[] arr, boolean flag) {
		if (flag) {
			System.out.print("-");
		}
		for (int i = arr[0]; i > 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void packer (int[] num, String n) {
        for (int i = 1; i < n.length() + 1; i++) {
            int index = n.length() - i;
            num[i] = Character.getNumericValue(n.charAt(index));
        }
    }
    
    public static void shortMulti (int[] num1, int num, int k, int[] currMulti) {
		int l = 0; 
		int position = k;
		for (int i = 1; i < num1.length; i++) {	
			int mod = (num * num1[i] + l) % 10;
			currMulti[position] = mod;
			position++;
			l = (num * num1[i] + l) / 10;
		}
		
	}	
	
	public static void vanish (int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = 0; // This method clean current array. that's all.
		}
	}
	
	public static void endFinder (int[] arr) {
		int k = 0;
		for (int i = arr.length - 1; i > 0 && arr[i] == 0; i--) {
			k++;
		}
		if (k == arr.length - 1) {
			arr[0] = 1; // it helps if one of numbers will be 0.
		} else {
			arr[0] = arr.length - k - 1;
		}
	}
	
	public static boolean multiSignChecker (String n1, String n2) {
		boolean flag = true;
		if (n1.charAt(0) == '0' || n2.charAt(0) == '0') {
			flag = false; //If one of numbers equal to zero.
		}
		if (n1.charAt(0) == '-' && n2.charAt(0) == '-' || n1.charAt(0) != '-' && n2.charAt(0) != '-') {
			flag = false;
		}
		return flag;
	}
    
    // We give two spelled backward numbers in integer array and int array "result" for final number.
    public static void multiplication (int[] num1, int[] num2, int[] result) { 
    	int[] currMulti = new int[num1.length + num2.length];
    	vanish(result);
    	vanish(currMulti);
    	int k = 1;
    	for (int i = 1; i < num2.length; i++) {
    		shortMulti(num1, num2[i], k, currMulti); // Multiplication between "long" and "short" numbers, e.g. 12345 * 5, 456789 * 7.
    		addition(result, currMulti); //Every step we accumulate sum of our long numbers. It's like "multiplication on paper". 
    		k++;
    		vanish(currMulti);
    	}
    	endFinder(result); // in result[0] we gave in fact index of first digit in final number.
    } 

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String m = sc.nextLine();
		//Boolean variable gives us sign of final number; lines n and m will be cleaned from "minuses"
		boolean sign = multiSignChecker(n, m); 
		if (n.charAt(0) == '-') {
			n = n.substring(1);
		}
		if (m.charAt(0) == '-') {
			m = m.substring(1);
		}
		String max;
		String min;
		if (n.length() >= m.length()) {
			max = n;
			min = m;
		} else {
			max = m;
			min = n;
		}	// num1.length > num2.length; num1 always greater or equal to num2. 
		int[] num1 = new int[max.length() + 2];
		packer(num1, max);	// Method "packer" gives us spelled backward numbers in integer array; e.g. 123 -> 321.
		int[] num2 = new int[min.length() + 2];
		packer(num2, min);	
		int[] result = new int[num1.length + num2.length];
		multiplication(num1, num2, result);
		arrPrinter(result, sign);
	}
}
