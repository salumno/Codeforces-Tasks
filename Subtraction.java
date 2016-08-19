/**
 * Created by salumno on 04.08.2016.
 */

import java.util.Scanner;

public class Subtraction {

    public static void packer (int[] num, String n) {
        for (int i = 1; i < n.length() + 1; i++) {
            int index = n.length() - i;
            num[i] = Character.getNumericValue(n.charAt(index));
        }
    }

    public static void printArr (int[] arr) {
        for (int i = arr[0]; i > 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void subtraction (int[] num1, int[] num2, int[] sub) { // num1 is greater than num2
        for (int i = 1; i < sub.length ; i++){
            if (num1[i] - num2[i] >= 0) {
                sub[i] = num1[i] - num2[i];
            } else {
                int k = i + 1;
                int l = 1;
                boolean flag = true;
                while (flag) {
                    if (num1[k] != 0) {
                        num1[k] -= 1;
                        num1[i] += 10;
                        for (int j = k; j > i + 1; j--) {
                            num1[j-1] = 9;
                        }
                        sub[i] = num1[i] - num2[i];
                        flag = false;
                    } else {
                        k++;
                        l++;
                    }
                }
            }
        }
        int k = 0;
        for (int i = sub.length - 1; i > 0 && sub[i] == 0; i--) {
        	k++;
        }
        if (k == sub.length - 1) {
        	sub[0] = 1;
        } else {
        	sub[0] = sub.length - 1 - k;
        }
    }

    public static void subtractionPrint (int[] num1, int[] num2, int[] sub) {
        subtraction(num1, num2, sub);
        printArr(sub);
    }
    
    public static boolean numSize (String n , String m) {
    	boolean flag = true;
    	if (n.length() < m.length()) {
    		flag = false;
    	} else {
    		if (n.length() == m.length()) {
    			for (int i = n.length() - 1; i > -1; i--) {
    				if (n.charAt(i) < m.charAt(i)) {
    					flag = false;
    					break;
    				} else {
    					if (n.charAt(i) > m.charAt(i)) {
    						break;
    					}
    				}
    			}
    		}
    	}
    	return flag;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();
        String max;
        String min;
        if (n.length() >= m.length()) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        int[] num1 = new int[max.length() + 2];
        int[] num2 = new int[max.length() + 2];
        int[] sub = new int[max.length() + 1];
        System.out.print("Result of subtraction: ");
		if (numSize(n, m)) { // n >= m
			packer(num1, n);
			packer(num2, m);
		} else { // n < m
			packer(num1, m);
			packer(num2, n);
			System.out.print("-");
		} 
        subtractionPrint(num1, num2, sub);
    }
}
