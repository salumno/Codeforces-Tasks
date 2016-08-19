/**
 * Created by salumno on 18.08.2016.
 * Task149A
 */


import java.util.Scanner;
import java.util.Arrays;

public class Task149A {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] month = new int[12];
        for (int i = 0; i < 12; i++) {
            month[i] = sc.nextInt();
        }
        Arrays.sort(month);
        int sum = 0;
        int counter = 0;
        for (int i = month.length -1 ; i > -1 && sum < k; i--) {
            sum += month[i];
            counter++;
        }
        if (k == 0) {
            counter = 0;
        }
        if (counter == 12 && sum < k) {
            counter = -1;
        }
        System.out.println(counter);
    }
}
