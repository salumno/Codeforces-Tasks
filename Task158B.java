/*
После окончания уроков n групп школьников вышли на улицу и собрались ехать домой к Поликарпу на празднование его дня рождения. Известно, что i-ая группа состоит из si друзей (1 ≤ si ≤ 4), которые не хотят расставаться по пути к Поликарпу. Решено ехать на такси. Каждая машина может вместить не более четырех пассажиров. Какое минимальное количество машин потребуется школьникам, если каждая группа должна целиком находиться в одной из машин такси (но одна машина может вмещать более чем одну группу)?

Входные данные
В первой строке записано целое число n (1 ≤ n ≤ 105) — количество групп школьников. Вторая строка содержит последовательность целых чисел s1, s2, ..., sn (1 ≤ si ≤ 4). Числа записаны через пробел, si — количество ребят в i-ой группе.

Выходные данные
Выведите единственное число — минимальное необходимое количество такси, чтобы отвезти всех ребят к Поликарпу.

Примеры
входные данные
5
1 2 4 3 3
выходные данные
4
входные данные
8
2 3 4 4 2 1 3 1
выходные данные
5
*/

import java.util.Scanner;

public class Task158B {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] groupCount = new int[4];
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			switch (s) {
				case 1: 
					groupCount[0]++;
					break;
				case 2: 
					groupCount[1]++;
					break;
				case 3: 
					groupCount[2]++;
					break;
				case 4: 
					groupCount[3]++;
					break;
			}
		}
		int sum = groupCount[3] + groupCount[2] + (groupCount[1] / 2);
		if (groupCount[2] < groupCount[0]) {
			groupCount[0] = groupCount[0] - groupCount[2];
		} else {
			groupCount[0] = 0;
		}
		if (groupCount[1] % 2 != 0) {
			groupCount[1] = 2;
		} else {
			groupCount[1] = 0;
		}
		int trash = groupCount[1] + groupCount[0];
		sum = sum + (trash / 4);
		if (trash % 4 != 0) {
			sum = sum + 1;
		}
		System.out.println(sum);
	}
}
