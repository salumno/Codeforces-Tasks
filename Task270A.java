/**
 * Created by salumno on 18.08.2016.
 * Task270A
 */

import com.sun.glass.ui.Clipboard;

import java.util.Scanner;

public class Task270A {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int angle = sc.nextInt();
            if (360 % (180 - angle) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
