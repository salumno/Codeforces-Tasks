/*
A и B готовятся к олимпиадам про программированию.

B очень любит отлаживать свой код. Но перед тем, как запустить решение и начать отладку, код нужно сначала скомпилировать.

Изначально компилятор выдавал n ошибок компиляции, каждая из которых обозначается положительным целым числом. После некоторых усилий, B удалось исправить сначала одну, а потом еще одну ошибку.

Однако, несмотря на то, что B уверен, что исправил две ошибки, он не может понять, какие именно ошибки компиляции исчезли — компилятор языка, на котором пишет B, каждый раз выдает ошибки в новом порядке! B уверен, что в отличие от многих других языков программирования, ошибки компиляции для его языка программирования не зависят друг от друга, т. е. от исправления одной ошибки, множество остальных ошибок не изменяется.

А вы можете помочь B узнать, какие именно две ошибки он исправил?

Входные данные
Первая строка входных данных содержит целое число n (3 ≤ n ≤ 105) — изначальное количество ошибок компиляции.

Вторая строка содержит n целых чисел через пробел a1, a2, ..., an (1 ≤ ai ≤ 109) — номера ошибок, выданных компилятором в первый раз.

Третья строка содержит n - 1 целых чисел через пробел b1, b2, ..., bn - 1 — номера ошибок, выданных при второй компиляции. Гарантируется, что последовательность в третьей строке содержит все числа второй строки, за исключением ровно одного.

Четвертая строка содержит n - 2 целых чисел через пробел с1, с2, ..., сn - 2 — номера ошибок, выданных при третьей компиляции. Гарантируется, что последовательность в четвертой строке содержит все числа третьей строки, за исключением ровно одного.

Выходные данные
Выведите два числа на отдельной строке: номера ошибок компиляции, исчезнувших после того как B внёс первое и второе исправление соответственно.

Примеры
входные данные
5
1 5 8 123 7
123 7 5 1
5 1 7
выходные данные
8
123
входные данные
6
1 4 3 3 5 7
3 7 5 4 3
4 3 7 5
выходные данные
1
3
*/

import java.util.Scanner;
import java.util.Arrays;

public class Task519B {
	
	public static void arrayComparison (int[] line1, int[] line2) {
		boolean flag = true;
		for (int i = 0; i < line2.length; i++) {
			if (line1[i] != line2[i]) {
				System.out.println(line1[i]);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(line1[line1.length - 1]);
		}
	}
	
	/*public static void arrayReader (int[] line) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < line.length; i++) {
			line[i] = sc.nextInt();

		}	
	}*/

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] firstLine = new int[n];
		//arrayReader(firstLine);
		for (int i = 0; i < firstLine.length; i++) {
			firstLine[i] = sc.nextInt();
		}
		int[] secondLine = new int[n-1];
		//arrayReader(secondLine);
		for (int i = 0; i < secondLine.length; i++) {
			secondLine[i] = sc.nextInt();
		}
		int[] thirdLine = new int[n-2];
		//arrayReader(thirdLine);
		for (int i = 0; i < thirdLine.length; i++) {
			thirdLine[i] = sc.nextInt();
		}
		Arrays.sort(firstLine);
		Arrays.sort(secondLine);
		Arrays.sort(thirdLine);
		arrayComparison(firstLine, secondLine);
		arrayComparison(secondLine, thirdLine);
	}
}
