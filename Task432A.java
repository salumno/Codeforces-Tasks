/*
В центре олимпиадной подготовки программистов СГУ (ЦОПП СГУ) занимаются n ребят. Про каждого из них известно, сколько раз он/она уже участвовал/участвовала в чемпионате мира по программированию (ACM ICPC). По правилам ACM ICPC каждый человек может участвовать в чемпионате мира не более 5 раз.

Руководитель ЦОПП СГУ в данный момент формирует команды для участия в чемпионате мира. Каждая команда должна состоять ровно из 3 человек, причем один человек не может быть членом двух или более команд. Какое максимальное количество команд может составить руководитель, если он хочет чтобы каждая команда могла участвовать в чемпионате мира в этом же составе как минимум k раз?

Входные данные
В первой строке записаны два целых числа n и k (1 ≤ n ≤ 2000; 1 ≤ k ≤ 5). В следующей строке записано n целых чисел: y1, y2, ..., yn (0 ≤ yi ≤ 5), где yi обозначает сколько раз i-й человек участвовал в чемпионате мира ACM ICPC.

Выходные данные
Выведите единственное целое число — ответ на задачу.

Примеры
входные данные
5 2
0 4 5 1 0
выходные данные
1
входные данные
6 4
0 1 2 3 4 5
выходные данные
0
входные данные
6 5
0 0 0 0 0 0
выходные данные
2
Примечание
В первом тестовом примере можно составить только одну команду: первый, четвертый и пятый человек.

Во втором тестовом примере нельзя составить ни одну команду.

В последнем примере можно составить две команды. Причем любое разбиение на две команды подходит.
*/

import java.util.Scanner;

public class Task432A {

	public static boolean checker (int a, int b, int c, int k) {
		boolean flag = false;
		if ((a + k) <= 5 && (b + k) <= 5 && (c + k) <= 5) {
			flag = true;
		}
		return flag;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] count = new int[n];
		for (int i = 0; i < n; i++) {
			count[i] = sc.nextInt();
		}
		for (int i = 0; i < count.length - 1; i++) {
			boolean swapped = true;
			for (int j = 0; j < count.length - 1 - i; j++) {
				if (count[j] > count[j+1]) {
					int temp = count[j];
					count[j] = count[j+1];
					count[j+1] = temp;
					swapped = false;
				}
			}
			if (swapped) {
				break;
			}
		}
		int counter = 0;
		for (int i = 0; i < n - 2; i += 3) {
			if (checker(count[i],count[i+1],count[i+2],k)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
