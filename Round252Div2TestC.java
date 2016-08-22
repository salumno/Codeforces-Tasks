/**
 * Created by Мельников Семен on 22.08.2016.
 */

import java.util.Scanner;

public class Round252Div2TestC {


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] table = new int[n*m][2];
        boolean flag = true;
        int x = 1;
        int y = 1;
        for (int i = 0; i < n*m; i++) {
            table[i][0] = x;
            table[i][1] = y;
            if (flag) {
                y++;
            } else {
                y--;
            }
            if ((i+1) % m == 0) {
                x++;
                if (flag) {
                    y = m;
                } else {
                    y = 1;
                }
                flag = !flag;
            }
        }
        int l = 1;
        int inx = 0;
        for (int i = 0; i < n*m && l < k; i += 2) {
            System.out.print("2 ");
            System.out.println(table[i][0] + " " + table[i][1] + " " + table[i + 1][0] + " " + table[i + 1][1]);
            l++;
            inx = i+2;
        }
        System.out.print((n*m - inx) + " ");
        for (int i = inx; i < n*m; i++) {
            System.out.print(table[i][0] + " " + table[i][1] + " ");
        }
    }
}



