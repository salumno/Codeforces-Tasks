/**
 * Created by salumno on 18.08.2016.
 * Task515A
 */

import java.util.Scanner;

public class Task515A {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int s1 = sc.nextInt();
        int a = Math.abs(a1);
        int b = Math.abs(b1);
        int s = Math.abs(s1);
        boolean flag = true;
        if (a > s || b > s || a + b > s) {
            flag = false;
        }
        if (a + b == s) {
            flag = true;
        } else {
            if (a + b < s) {
                if ((s - (a + b)) % 2 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
