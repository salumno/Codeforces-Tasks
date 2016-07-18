/*
«Участник выходит в следующий раунд соревнований, если он набрал не меньше баллов, чем участник, занявший k-е место, при условии, что набранное им число баллов строго положительно...» — выдержка из правил соревнований.

Всего в соревновании было n участников (n ≥ k), и вам уже известны их баллы. Определите, сколько участников выйдет в следующий раунд.

Входные данные
В первой строке входных данных записаны два целых числа n и k (1 ≤ k ≤ n ≤ 50), разделенных единичным пробелом.

Во второй строке записаны n целых чисел, разделенных единичными пробелами, a1, a2, ..., an (0 ≤ ai ≤ 100), где ai — количество баллов, набранных участником на i-ом месте. Числа в заданной последовательности не возрастают (то есть для всех i от 1 до n - 1 выполняется ai ≥ ai + 1).

Выходные данные
Выведите одно целое число — искомое количество участников, в соответствии с правилами.

Примеры
входные данные
8 5
10 9 8 7 7 7 5 5
выходные данные
6
входные данные
4 2
0 0 0 0
выходные данные
0
Примечание
В первом примере участник на 5ом месте набрал 7 баллов. Так как участник на 6ом месте тоже набрал 7 баллов, то в следующий раунд выходят 6 участников.

Во втором примере никто не набрал положительного количества баллов.


*/

import java.util.Scanner;

public class Task158A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] points = new int[n];
		for (int i = 0; i < points.length; i++){
			points[i] = sc.nextInt();
		}
		for (int i = 0; i < points.length; i++) {
			if (points[i] > 0 && points[i] >= points[k-1]) {
				count++;
			}
		} 
		System.out.println(count);	
	}
}