/*
Солдат хочет купить w бананов в магазине. Ему надо заплатить k долларов за первый банан, 2k долларов — за второй и так далее (иными словами, за i-й банан надо заплатить i·k долларов).

У него есть n долларов. Сколько долларов ему придется одолжить у однополчанина, чтобы купить w бананов?

Входные данные
В первой строке записано три положительных целых числа k, n, w (1  ≤  k, w  ≤  1000, 0 ≤ n ≤ 109), стоимость первого банана, изначальное количество долларов у солдата и количество бананов, которые он хочет купить.

Выходные данные
Выведите единственное целое число — количество долларов, которое солдату надо одолжить у однополчанина. Если деньги одалживать не надо, выведите 0.

Примеры
входные данные
3 17 4
выходные данные
13
*/

import java.util.Scanner;

public class Task546A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= w; i++) {
			sum += i * k;
		}
		int debt = n - sum;
		if (debt < 0) {
			System.out.println(Math.abs(debt));
		} else {
			System.out.println("0");
		}
	}
}