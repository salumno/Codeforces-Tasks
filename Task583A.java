/**
 * Created by salumno on 18.08.2016.
 * Task583A
 */

import java.util.Scanner;

public class Task583A {

    public static void falsePacker (boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = false;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] hor = new boolean[n];
        boolean[] ver = new boolean[n];
        falsePacker(hor);
        falsePacker(ver);
        for (int i = 0; i < n*n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (!hor[num1-1] && !ver[num2-1]) {
                hor[num1-1] = true;
                ver[num2-1] = true;
                System.out.print((i + 1) + " ");
            }
        }
    }
}
