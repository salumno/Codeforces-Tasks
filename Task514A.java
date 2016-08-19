/**
 * Created by salumno on 18.08.2016.
 * Task514A
 */


import java.util.Scanner;

public class Task514A {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            int inv = 9 - digit;
            if (inv == 0 && i == 0) {
                System.out.print("9");
            } else {
                if (digit < inv) {
                    System.out.print(digit);
                } else {
                    System.out.print(inv);
                }
            }
        }
    }
}
