/*Театральная площадь в столице Берляндии представляет собой прямоугольник n × m метров. По случаю очередного юбилея города, было принято решение о замощении площади квадратными гранитными плитами. Каждая плита имеет размер a × a.

Какое наименьшее количество плит понадобится для замощения площади? Разрешено покрыть плитами большую поверхность, чем театральная площадь, но она должна быть покрыта обязательно. Гранитные плиты нельзя ломать или дробить, а разрешено использовать только целиком. Границы плит должны быть параллельны границам площади.

Входные данные
В первой строке записано три целых натуральных числа n, m и a (1 ≤ n, m, a ≤ 109).

Выходные данные
Выведите искомое количество плит.
*/
import java.util.Scanner;
public class Task1A {

	public static long counter (int x, int y) {
		int count = y / x;
		if (y % x > 0) {
			count = count + 1;
		}
		return count;
	}	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		long result = counter(a,m) * counter(a,n);
		System.out.println(result);
	}
}