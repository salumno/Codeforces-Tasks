/*
Ваня идет поздней ночью по прямолинейной улице длины l, которая освещается n фонарями. Введём систему координат, в которой начало улицы соответствует точке 0, а её конец — точке l. Тогда i-й фонарь находится в точке ai. Фонарь освещает все точки улицы, которые находятся от него на расстоянии не больше d, где d — некоторое положительное число, общее для всех фонарей.

Ваня хочет узнать, какой минимальный радиус освещения d должен быть у фонарей, чтобы вся улица была освещена.

Входные данные
В первой строке записаны два целых числа n, l (1 ≤ n ≤ 1000, 1 ≤ l ≤ 109) — количество фонарей и длина улицы соответственно.

В следующей строке записано n целых чисел ai (0 ≤ ai ≤ l). Несколько фонарей могут находиться в одной точке. Фонари могут находиться в концах улицы.

Выходные данные
Выведите минимальный радиус освещения d, который необходим, чтобы осветить всю улицу. Ответ будет считаться правильным, если его абсолютная или относительная погрешность не превышает 10 - 9

Примеры
входные данные
7 15
15 5 3 7 9 14 0
выходные данные
2.5000000000
входные данные
2 5
2 5
выходные данные
2.0000000000
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task492B {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double l = sc.nextDouble();
		double[] lamp = new double[n];
		for (int i = 0; i < n; i++) {
			lamp[i] = sc.nextDouble();
		}
		for (int i = 0; i < lamp.length - 1; i++) {
			boolean swapped = true;
			for (int j = 0; j < lamp.length - 1 - i; j++) {
				if (lamp[j] > lamp[j+1]) {
					double temp = lamp[j];
					lamp[j] = lamp[j + 1];
					lamp[j + 1] = temp;
					swapped = false;
				}
			}
			if (swapped) {
				break;
			}
		}
		double max = 0;
		for (int i = 1; i < lamp.length; i++) {
			double length = (lamp[i] - lamp[i - 1]) / 2;
			if (length > max) {
				max = length;
			}
		}
		double[] abs = new double[3];
		abs[0] = max;
		abs[1] = lamp[0];
		abs[2] = l - lamp[lamp.length - 1];
		double absMax = -1;
		for (int i = 0; i < 3; i++) {
			if (abs[i] > absMax) {
				absMax = abs[i];
			}
		}
		String pattern = "##0.0000000000";
		DecimalFormat df = new DecimalFormat(pattern);
		String format = df.format(absMax);
		System.out.println(format);
	}
}
