/*
Петя любит счастливые числа. Всем известно, что счастливыми являются положительные целые числа, в десятичной записи которых содержатся только счастливые цифры 4 и 7. Например, числа 47, 744, 4 являются счастливыми, а 5, 17, 467 — не являются.

Петя называет число почти счастливым, если оно делится без остатка на какое-либо счастливое число. Помогите ему узнать, является ли заданное число n почти счастливым?

Входные данные
В единственной строке задано целое число n (1 ≤ n ≤ 1000) — число, которое нужно проверить.

Выходные данные
В единственной строке выведите «YES» (без кавычек), если число n почти счастливое, иначе выведите «NO» (без кавычек).

Примеры
входные данные
47
выходные данные
YES
входные данные
16
выходные данные
YES
входные данные
78
выходные данные
NO
Примечание
Заметим, что все счастливые числа являются почти счастливыми, так как любое число делится само на себя без остатка.

В первом примере 47 — счастливое число. Во втором примере 16 делится на 4.
*/

import java.util.Scanner;

public class Task122A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean check = false;
		for (int i = 1; i <= n; i++) {
			boolean flag = true;
			int x = i;
			while (x > 0) {
				System.out.println("x =" + x);
				int mod = x % 10;
				System.out.println("mod =" + mod);
				if (!(mod == 7 || mod == 4)) {
					flag = false;
					break;
				}
				x = x / 10;
			}
			System.out.println("flag =" + flag);
			if (flag) {
				if (n % i == 0) {
					check = true;
					break;
				}
			}
		}
		if (check) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
