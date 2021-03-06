/*
Маленький Петя очень любит подарки. Его мама подарила ему на день рождения две строки равной длины, состоящие из больших и маленьких букв латинского алфавита. Теперь Петя хочет сравнить эти строки лексикографически. При этом регистр букв значения не имеет, то есть большая буква считается эквивалентной соответствующей маленькой букве. Помогите Пете выполнить сравнение.

Входные данные
В каждой из первых двух строк записано по одной подаренной строке. Длина строк находится в пределах от 1 до 100 включительно. Гарантируется, что строки имеют одинаковую длину, а также состоят из больших и маленьких букв латинского алфавита.

Выходные данные
Если первая строка меньше второй, выведите «-1». Если вторая строка меньше первой, выведите «1». Если строки равны, выведите «0». Учтите, что регистр букв не учитывается при сравнении.

Примеры
входные данные
aaaa
aaaA
выходные данные
0
входные данные
abs
Abz
выходные данные
-1
входные данные
abcdefg
AbCdEfF
выходные данные
1
*/

import java.util.Scanner;

public class Task112A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		String secondLine = sc.nextLine();
		firstLine = firstLine.toLowerCase();
		secondLine = secondLine.toLowerCase();	
		int length = firstLine.length();
		boolean flag = true;
		for (int i = 0; i < length; i++) {
			if (firstLine.codePointAt(i) < secondLine.codePointAt(i)) {
				flag = false;
				System.out.println("-1");
				break;
			} else {
				if (firstLine.codePointAt(i) > secondLine.codePointAt(i)) {
					flag = false;
					System.out.println("1");
					break;
				}
			}
		}
		if (flag) {
			System.out.println("0");
		}
	}
}
