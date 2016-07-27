/*
Есть такая игра под названием «I Wanna Be the Guy», в ней n уровней. Little X и его друг Little Y подсели на эту игру. Каждый из них хочет пройти игру полностью.

Little X может пройти только p уровней этой игры. А Little Y может пройти только q уровней этой игры. Вам даны номера уровней, которые может пройти Little X, и номера уровней, которые может пройти Little Y. Могут ли Little X и Little Y пройти игру полностью, если объединят свои усилия?

Входные данные
В первой строке записано единственное целое число n (1 ≤  n ≤ 100).

В следующей строке сначала записано целое число p (0 ≤ p ≤ n), затем следуют p различных целых чисел a1, a2, ..., ap (1 ≤ ai ≤ n). Эти числа обозначают номера уровней, которые может пройти Little X. В следующей строке содержатся номера уровней, которые может пройти Little Y, в аналогичном формате. Предполагается, что уровни пронумерованы от 1 до n.

Выходные данные
Если друзья могут пройти все уровни вместе, выведите «I become the guy.». Если это невозможно, выведите «Oh, my keyboard!» (без кавычек).

Примеры
входные данные
4
3 1 2 3
2 2 4
выходные данные
I become the guy.
входные данные
4
3 1 2 3
2 2 3
выходные данные
Oh, my keyboard!
Примечание
В первом примере Little X может пройти уровни [1 2 3], а Little Y может пройти уровни [2 4], так что вместе ребята могут пройти все уровни.

Во втором примере никто не может пройти уровень 4.
*/

import java.util.Scanner;

public class Task469A {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] checker = new int[n];
		int p = sc.nextInt();
		for (int i = 0; i < p; i++) {
			int a = sc.nextInt();
			checker[a-1]++;
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int b = sc.nextInt();
			checker[b-1]++;
		}
		boolean flag = true;
		int k = 0;
		while (k < checker.length && flag) {
			if (checker[k] == 0) {
				flag = false;
			} else {
				k++;
			}
		}
		if (flag) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}
	}
}