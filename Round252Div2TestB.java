/**
 * Created by Мельников Семен on 22.08.2016.
 *
 *
 4 10
 1 5
 2 4
 3 6
 4 8

 */

import java.util.Scanner;

public class Round252Div2TestB{


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[][] fruit = new int[3002][2];

        for (int i = 0; i < 3002; i++) {
            fruit[i][0] = i;
        }

        for (int i = 1; i < n+1; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            fruit[num1][1] += num2;
        }

        for (int i = 1; i < n - 2; i++) {
            boolean swapped = true;
            for (int j = 1; j < n - 2 - i; j++) {
                if (fruit[j][0] > fruit[j+1][0]) {
                    int temp1 = fruit[j][0]; int temp2 = fruit[j][1];
                    fruit[j][0] = fruit[j+1][0]; fruit[j][1] = fruit[j+1][1];
                    fruit[j+1][0] = temp1; fruit[j+1][1] = temp2;
                    swapped = false;
                }
            }
            if (swapped) {
                break;
            }
        }

        int counter = 0;
        for (int i = 1; i < fruit.length; i++) {
            int k = v;
            if (fruit[i-1][1] > 0) {
                if (k >= fruit[i-1][1]) {
                    counter += fruit[i-1][1];
                    k -= fruit[i-1][1];
                    fruit[i-1][1] = 0;
                } else {
                    fruit[i-1][1] -= k;
                    counter += k;
                    k = 0;
                }
            }
            if (k <= fruit[i][1]) {
                counter += k;
                fruit[i][1] -= k;
            } else {
                counter += fruit[i][1];
                fruit[i][1] = 0;
            }
        }
        System.out.println(counter);
    }
}
