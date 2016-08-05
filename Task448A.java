/*
Бизон-Чемпион не зря зовется чемпионом.

Недавно Бизон-Чемпион получил в подарок новый, красивый, стеклянный шкаф с n полками и решил расположить в нем все свои награды. Все награды можно разделить на два типа: медали и кубки. Бизон-Чемпион имеет a1 кубков за первые, a2 кубков за вторые и a3 кубков за третьи места. Кроме того, у него есть b1 медалей за первые, b2 медалей за вторые и b3 медалей за третьи места.

Конечно, награды в шкафу должны смотреться красиво, поэтому Бизон-Чемпион решил следовать правилам:

на одной полке не могут находиться кубки и медали одновременно;
ни на какой полке не должно быть больше пяти кубков;
ни на какой полке не должно быть больше десяти медалей.
Помогите Бизону-Чемпиону выяснить, можно ли расположить все награды так, чтобы все описанные условия были выполнены.

Входные данные
В первой строке содержатся целые числа a1, a2 и a3 (0 ≤ a1, a2, a3 ≤ 100). Вторая строка содержит целые числа b1, b2 и b3 (0 ≤ b1, b2, b3 ≤ 100). В третьей строке содержится целое число n (1 ≤ n ≤ 100).

Числа в строках разделяются одиночными пробелами.

Выходные данные
Выведите «YES» (без кавычек), если все награды можно расположить на полках описанным образом. В противном случае, выведите «NO» (без кавычек).

Примеры
входные данные
1 1 1
1 1 1
4
выходные данные
YES
входные данные
1 1 3
2 3 4
2
выходные данные
YES
входные данные
1 0 0
1 0 0
1
выходные данные
NO
*/

import java.util.Scanner;

public class Task448A {

	public static int checker (int c, int div) {
		int sum = 0;
		if (c % div == 0) {
			sum = c / div;
		} else {
			sum = c / div + 1;
		}
		return sum;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() + sc.nextInt() + sc.nextInt();
		int b = sc.nextInt() + sc.nextInt() + sc.nextInt();
		int n = sc.nextInt();
		int sum = checker(a, 5) + checker(b, 10);
		if (sum > n) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}