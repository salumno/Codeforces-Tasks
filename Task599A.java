/**
 * Created by salumno on 18.08.2016.
 * Task599A
 */

import java.util.Scanner;
import java.util.Arrays;

public class Task599A {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int[] length = new int[6];
        length[0] = d1 + d2 + d3;
        length[1] = 2*d1 + 2*d2;
        length[2] = 2*d1 + length[0];
        length[3] = 2*d2 + length[0];
        length[4] = 2*d1 + 2*d3;
        length[5] = 2*d2 + 2*d3;
        Arrays.sort(length);
        System.out.println(length[0]);
    }
}
