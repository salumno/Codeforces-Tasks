/*
HQ9+ — шуточный язык программирования, состоящий всего из четырех односимвольных команд:

«H» печатает «Hello, World!»,
«Q» печатает исходный код самой программы,
«9» печатает текст песни «99 бутылок пива»,
«+» увеличивает на единицу значение внутреннего счетчика.
Команды «H» и «Q» воспринимаются только в верхнем регистре. Все символы программы, не являющиеся командами, игнорируются.

Вам дана программа на HQ9+. Определите, будет ли что-то напечатано в результате ее выполнения.

Входные данные
В единственной строке входных данных задана строка p — программа на языке HQ9+. Строка p содержит от 1 до 100 символов, включительно. ASCII-код каждого символа будет от 33 (восклицательный знак) до 126 (тильда), включительно.

Выходные данные
Выведите «YES», если в результате выполнения программы будет напечатано какое-то сообщение, и «NO» в противном случае.

Примеры
входные данные
Hi!
выходные данные
YES
входные данные
Codeforces
выходные данные
NO
*/

import java.util.Scanner;

public class Task133A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'Q' || str.charAt(i) == 'H' || str.charAt(i) == '9') {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
