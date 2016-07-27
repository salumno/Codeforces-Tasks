/*
Петя учится в школе и очень любит математику. Уже несколько занятий они с классом проходят арифметические выражения. На последнем уроке учительница написала на доске три положительных целых числа a, b, c. Задание заключалось в том, чтобы расставить между этими числами знаки операций '+' и '*', а также, возможно, скобки. Значение получившегося выражения должно быть как можно больше. Рассмотрим пример: пусть учительница выписала на доску числа 1, 2 и 3. Вот некоторые варианты расстановки знаков и скобок:

1+2*3=7
1*(2+3)=5
1*2*3=6
(1+2)*3=9
Обратите внимание на то, что знаки операций можно вставлять только между a и b, а также между b и c, то есть нельзя менять числа местами. Так, в приведенном примере нельзя получить выражение (1+3)*2.

Легко убедиться, что максимальное значение, которое можно получить, — это 9.

Ваша задача — по заданным a, b и c вывести, какое максимальное значение выражения можно получить.

Входные данные
Во входных данных записаны три целых числа a, b и c, каждое в отдельной строке (1 ≤ a, b, c ≤ 10).

Выходные данные
Выведите максимальное значение выражения, которое можно получить.

Примеры
входные данные
1
2
3
выходные данные
9
входные данные
2
10
3
выходные данные
60
*/

import java.util.Scanner;

public class Task479A {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] val = new int[6];
		val[0] = a + b + c;
		val[1] = a * b * c;
		val[2] = a * b + c;
		val[3] = a * (b + c);
		val[4] = a + b * c;
		val[5] = (a + b) * c;
		int max = -1;
		for (int i = 0; i < val.length; i++) {
			if (val[i] > max) {
				max = val[i];
			}
		}		
		System.out.println(max);
	}
}