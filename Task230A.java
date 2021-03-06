/*
Кирито застрял на очередном уровне MMORPG, в которую он играет. Чтобы пройти игру дальше, ему нужно победить всех n драконов, которые живут на этом уровне. Как Кирито, так и драконы обладают силой, которая выражается целым числом. В схватке между двумя противниками исход схватки определяется их силой. Изначально сила Кирито равна s.

Если Кирито вступает в схватку с i-ым (1 ≤ i ≤ n) драконом и его сила не больше, чем сила этого дракона xi, то Кирито проигрывает схватку и умирает. Если же сила Кирито больше, чем сила дракона, то он побеждает дракона и получает бонус — его сила увеличивается на yi.

Кирито может сражаться с драконами в произвольном порядке. Определите, сможет ли он пройти на следующий уровень игры, то есть победить всех драконов, не умирая ни разу.

Входные данные
Первая строка содержит два целых числа s и n (1 ≤ s ≤ 10^4, 1 ≤ n ≤ 10^3), разделенные пробелом. Далее следуют n строк: i-ая строка содержит целые числа xi и yi (1 ≤ xi ≤ 10^4, 0 ≤ yi ≤ 10^4), разделенные пробелом — силу i-го дракона и бонус за победу над ним.

Выходные данные
В единственной строке выведите «YES» (без кавычек), если Кирито сможет пройти на следующий уровень, и «NO» (без кавычек), если не сможет.

Примеры
входные данные
2 2
1 99
100 0
выходные данные
YES
входные данные
10 1
100 100
выходные данные
NO
*/

import java.util.Scanner;

public class Task230A {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[][] dragons = new int[n][2];
		for (int i = 0; i < n; i++) {
			dragons[i][0] = sc.nextInt();
			dragons[i][1] = sc.nextInt();
		}
		for (int i = 0; i < dragons.length - 1; i++) {
			boolean swapped = true;
			for (int j = 0; j < dragons.length - 1 - i; j++) {
				if (dragons[j][0] > dragons[j+1][0]) {
					int temp1 = dragons[j][0];			int temp2 = dragons[j][1];
					dragons[j][0] = dragons[j+1][0];	dragons[j][1] = dragons[j+1][1];
					dragons[j+1][0] = temp1; 			dragons[j+1][1] = temp2; 
					swapped = false;
				}
			}
			if (swapped) {
				break;
			}
		}
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (s > dragons[i][0]) {
				s += dragons[i][1];
			} else {
				flag = false;
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
