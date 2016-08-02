/*
Слоник решил сходить в гости к другу. Оказалось, что дом слоника находится в точке 0, а дом его друга в точке x(x > 0) координатной прямой. За один шаг слоник может переместиться на 1, 2, 3, 4 или 5 позиций вперёд. Помогите ему определить, за какое минимальное количество шагов он может добраться до дома друга.

Входные данные
В первой строке входных данных записано одно целое число x (1 ≤ x ≤ 1 000 000) — координата дома друга слоника.

Выходные данные
Выведите минимальное количество шагов, которые необходимо сделать слонику, чтобы попасть из точки 0 в точку x.

Примеры
входные данные
5
выходные данные
1
входные данные
12
выходные данные
3
Примечание
В первом примере слоник может за один шаг передвинуться на 5 позиций и достигнуть точки x.

Во втором примере слоник может попасть в точку x, сходив на 3, 5 и 4 позиции. Есть и другие способы получить оптимальный ответ, но слоник не может достичь x быстрее, чем за 3 шага.
*/

import java.util.Scanner;

public class Task617A {

    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int sum = 0;
    	if (x % 5 == 0) {
    		sum = x / 5;
    	} else {
    		sum = x / 5 + 1;
    	}
    	System.out.println(sum);
    }
}