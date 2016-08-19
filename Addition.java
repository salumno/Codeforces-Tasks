/**
 * Created by salumno on 04.08.2016.
 */

import java.util.Scanner;

public class Addition {

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

    public static void addition (int[] num1, int[] num2, int[] sum){
        int k = 0;
        for (int i = 1; i < sum.length ; i++){
            sum[i] = (num1[i]+ num2[i] + k) % 10;
            k = (num1[i]+ num2[i] + k) / 10;
        }
        if (sum[sum.length - 1] != 0) {
            sum[0] = sum.length - 1;
        } else {
            sum[0] = sum.length - 2;
        }
    }

    public static void additionPrint (int[] num1, int[] num2, int[] sum) {
        System.out.print("Result of addiction: ");
        addition(num1, num2, sum);
        printArr(sum);
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
        packer(num1, max);
        int[] num2 = new int[max.length() + 2];
        packer(num2, min);
        int[] sum = new int[max.length() + 2];
        additionPrint(num1, num2, sum);
    }
}
