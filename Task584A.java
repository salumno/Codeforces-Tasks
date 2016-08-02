/*
Олеся любит числа длины n, а Родиону нравятся только числа, делящиеся на t. Найдите какое-нибудь число, устраивающее их обоих.

Ваша задача — по заданным n и t вывести целое число строго больше нуля, состоящие из n цифр, которое делится на t. Если же такого числа не существует, выведите  - 1.

Входные данные
В единственной строке записаны два числа n и t (1 ≤ n ≤ 100, 2 ≤ t ≤ 10) — длина числа и на что оно должно делиться.

Выходные данные
Выведите одно целое положительное число без ведущих нулей, являющееся ответом на задачу, или  - 1, если такого числа не существует. Если возможных ответов несколько, разрешается вывести любой.

Примеры
входные данные
3 2
выходные данные
712
*/

import java.util.Scanner;

public class Task584A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		if (n == 1 && t == 10) {
			System.out.println("-1");
		} else {
			if (t < 10) {
				for (int i = 0; i < n; i++) {
				System.out.print(t);
				}
				System.out.println();
			} else {
				for (int i = 0; i < n-1; i++) {
				System.out.print("1");
				}
				System.out.print("0");
				System.out.println();
			}
		}
	}
}