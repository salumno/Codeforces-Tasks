/**
 * Created by salumno on 18.08.2016.
 * Task237A
 */

/*
10
8 13
8 13
8 13
9 11
9 11
10 16
10 16
10 16
10 16
10 16
 */

import java.util.Scanner;

public class Task237A {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = -1;
        int m = -1;
        int counter = 1;
        int max = -1;
        for (int i = 0; i < n; i++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            if (h1 == h && m1 == m) {
                counter++;
                //System.out.println("counter = " + counter);
            } else {
               // System.out.println("counter = " + counter);
                //System.out.println("max = " + max);
                if (counter > max) {
                    max = counter;
                }
                counter = 1;
            }
            h = h1;
            m = m1;
        }
        if (counter > max) {
            max = counter;
        }
        System.out.println(max);
    }
}
