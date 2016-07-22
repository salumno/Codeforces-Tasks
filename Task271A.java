/*
Кажется, еще совсем недавно наступил новый 2013 год. А знали ли Вы забавный факт о том, что 2013 год является первым годом после далекого 1987 года, в котором все цифры различны?

Теперь же Вам предлагается решить следующую задачу: задан номер года, найдите наименьший номер года, который строго больше заданного и в котором все цифры различны.

Входные данные
В единственной строке задано целое число y (1000 ≤ y ≤ 9000) — номер года.

Выходные данные
Выведите единственное целое число — минимальный номер года, который строго больше y, в котором все цифры различны. Гарантируется, что ответ существует.

Примеры
входные данные
1987
выходные данные
2013
входные данные
2013
выходные данные
2014
*/

import java.util.Scanner;

public class Task271A {
	
	public static boolean differentDigitCheck (int x) {
		int[] digit = new int[4];
		int l = 0;
		while (x > 0) {
			int mod = x % 10;
			digit[l] = mod;
			l++;
			x = x / 10;
		}
		boolean flag = true;
		for (int i = 0; i < 4; i++) {
			for (int j = i+1; j < 4; j++) {
				if (digit[i] == digit[j]) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int i = year+1;
		while (i > year) {
			if (differentDigitCheck(i)) {
				System.out.println(i);
				break;
			} else {
				i++;
			}
		}
	}
}
