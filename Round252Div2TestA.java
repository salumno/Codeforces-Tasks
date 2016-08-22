/**
 * Created by Мельников Семен on 22.08.2016.
 */
/*
4 15000
2 20000 5000
2 5000 20000
1 15000
1 6000
 */

import java.util.Scanner;

public class Round252Div2TestA{


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[] trade = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            boolean flag = true;
            for (int j = 0; j < k; j++) {
                int s = sc.nextInt();
                if (v > s && flag) {
                    trade[counter] = i+1;
                    counter++;
                    flag = false;
                }
            }
        }
        System.out.println(counter);
        for (int i = 0; i < counter; i++) {
            System.out.print(trade[i] + " ");
        }
    }
}
