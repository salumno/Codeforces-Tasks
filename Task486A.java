/*
Для положительного целого числа n определим функцию f:

f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn

Ваша задача — посчитать f(n) для данного целого числа n.

Входные данные
В единственной строке записано положительное целое число n (1 ≤ n ≤ 1015).

Выходные данные
Выведите f(n) в единственной строке.

Примеры
входные данные
4
выходные данные
2
входные данные
5
выходные данные
-3
*/

import java.util.Scanner;

public class Task486A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long func = 0; 
		if (n % 2 == 0) {
			func = n / 2;
		} else {
			func = (n - 1) / 2 - n;
		}
		System.out.println(func);
	}
}
