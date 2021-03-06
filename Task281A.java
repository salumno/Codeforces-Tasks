/*
Капитализация — это запись слова, в которой первая буква слова записывается как прописная буква. Ваша задача, вывести капитализацию заданного слова.

Обратите внимание, что в капитализации все буквы слова кроме первой остаются не измененными.

Входные данные
В первой строке записано непустое слово. Слово состоит из строчных и прописных букв латинского алфавита. Длина заданного слова не превосходит 103 букв.

Выходные данные
Выведите капитализацию слова.

Примеры
входные данные
ApPLe
выходные данные
ApPLe
входные данные
konjac
выходные данные
Konjac
*/

import java.util.Scanner;

public class Task281A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println((word.charAt(0) + "").toUpperCase() + word.substring(1));
	}
}
