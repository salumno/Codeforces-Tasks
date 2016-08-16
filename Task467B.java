/*
Как только вы помогли Юре с Лешей заселиться, они пошли помогать своему другу Феде играть в новую компьютерную игру «Call of Soldiers 3».

Всего в игре есть (m + 1) игроков и n видов солдат. Игроки «Call of Soldiers 3» пронумерованы от 1 до (m + 1), а виды солдат пронумерованы от 0 до n - 1. У каждого игрока есть армия, армия i-го игрока характеризуется целым неотрицательным числом xi. Рассмотрим битовое представление числа xi: если j-й бит числа xi равен единице, то в армии i-го игрока есть солдаты j-го вида.

Федя — игрок с номером m + 1. Федя считает, что два игрока могут дружить, если их армии отличаются не более чем на k видов солдат (другими словами, битовые представления соответствующих чисел различаются не более чем в k битах). Помогите Феде посчитать, сколько игроков могут с ним дружить.

Входные данные
В первой строке записаны три целых числа n, m, k (1 ≤ k ≤ n ≤ 20; 1 ≤ m ≤ 1000).

В i-й из (m + 1) последующих строк содержится одно целое число xi (1 ≤ xi ≤ 2n - 1), которое характеризует армию i-го игрока. Напомним, что Федя — это игрок с номером (m + 1).

Выходные данные
Выведите единственное целое число — количество возможных друзей Феди.

Примеры
входные данные
7 3 1
8
5
111
17
выходные данные
0
входные данные
3 3 3
1
2
3
4
выходные данные
3
*/

import java.util.Scanner;

public class Task467B {

	public static void arrayFiller (int[] num, int number) {
		String binaryNum = Integer.toBinaryString(number);
		int k = 0;
		for (int i = binaryNum.length() - 1; i > -1; i--) {
			num[k] = Character.getNumericValue(binaryNum.charAt(i));
			k++;
		}
	}
	
	public static boolean numComparison (int[] num1, int[] num2, int k) {
		int gap = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] != num2[i]) {
				gap++;
			}
		}
		boolean flag = false;
		if (gap <= k) {
			flag = true;
		}
		return flag;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] army = new int[m];
		for (int i = 0; i < army.length; i++) {
			army[i] = sc.nextInt();
		}
		int f = sc.nextInt();
		int[] player = new int[n];
		arrayFiller(player, f);
		int friend = 0;
		for (int i = 0; i < army.length; i++) {
			int[] currentNumber = new int[n];
			arrayFiller(currentNumber, army[i]);
			if (numComparison(currentNumber, player, k)) {
				friend++;
			}
		}
		System.out.println(friend);
	}
}
