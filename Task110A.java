/*
Петя любит счастливые числа. Всем известно, что счастливыми являются положительные целые числа, в десятичной записи которых содержатся только счастливые цифры 4 и 7. Например, числа 47, 744, 4 являются счастливыми, а 5, 17, 467 — не являются.

К сожалению, не все числа счастливые. Петя называет число почти счастливым, если количество счастливых цифр в нем — счастливое число. Ему интересно, является ли число n почти счастливым.

Входные данные
В единственной строке задано целое число n (1 ≤ n ≤ 1018).

Пожалуйста, не используйте спецификатор %lld для чтения или записи 64-битных чисел на С++. Рекомендуется использовать потоки cin, cout или спецификатор %I64d.

Выходные данные
В единственной строке выведите «YES», если число n — почти счастливое, и «NO» в противном случае (без кавычек).

Примеры
входные данные
40047
выходные данные
NO
входные данные
7747774
выходные данные
YES
входные данные
1000000000000000000
выходные данные
NO
*/

import java.util.Scanner;

public class Task110A {

	public static boolean happyNum (long x) {
		boolean flag;
		if (x == 0) {
			flag = false;
		} else {
			flag = true;
		}
		while (x > 0) {
			long mod = x % 10;
			if (!(mod == 4 || mod == 7)) {
				flag = false;
				break;
			}	
			x = x / 10;
		}
		return flag;
	}
	
	public static long countHappyDigits (long x) {
		long count = 0;
		while (x > 0) {
			long mod = x % 10;
			if (mod == 4 || mod == 7) {
				count++;
			}
			x = x / 10;
		}
		return count;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if (happyNum(countHappyDigits(n))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
