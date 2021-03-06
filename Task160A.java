/*
Представьте себе, что у Вас есть брат или сестра-близнец. Это кажется очень необычным, что в мире есть еще один человек, который выглядит также как Вы. И даже трудно сказать хорошо это или плохо, что Вы как будто не один такой на этой планете. А если у Вас и вправду есть близнец, тогда Вы точно знаете, каково это.

Теперь представьте себе обычное утро в Вашей семье. Пока вы еще спите, мама уже собирается на работу. Она так торопилась, что чуть не забыла оставить вам, ее любимым детям, немного денег, чтобы покушать в школе в столовой. В кошельке она нашла некоторое количество монет, а именно n монет произвольных достоинств a1, a2, ..., an. Времени у нее было мало, поэтому поделить монеты она не успела. Тогда она написала записку, в которой попросила вас разделить деньги поровну.

Проснувшись, Вы нашли оставленные мамой монеты и прочитали записку. «Но зачем делить монеты поровну?» — подумали Вы, ведь Ваш близнец еще спит и ничего не узнает. Поэтому Вы решили поступить следующим образом: выбрать себе некоторое подмножество монет, так чтобы сумма достоинств взятых Вами монет оказалась строго больше, чем сумма достоинств оставшейся части монет, которая достанется Вашему близнецу. Однако, Вы справедливо решили, что если взять слишком много монет, то Ваш близнец подумает, что Вы его обманули. Поэтому, чтобы не вызывать подозрений, Вы решили взять наименьшее количество монет, сумма достоинств которых окажется строго больше суммы достоинств оставшихся. Исходя из этого, выясните, какое минимальное количество монет Вам понадобится взять, чтобы разделить их описанным образом.

Входные данные
В первой строке задано целое число n (1 ≤ n ≤ 100) — количество монет. Во второй строке задана последовательность из n целых чисел a1, a2, ..., an (1 ≤ ai ≤ 100) — достоинства монет. Все числа разделены пробелами.

Выходные данные
В единственной строке выведите одно число — минимальное необходимое количество монет.

Примеры
входные данные
2
3 3
выходные данные
2
входные данные
3
2 1 2
выходные данные
2
Примечание
В первом примере придется взять 2 монеты (суммы у Вас и Вашего близнеца равны 6, 0 соответственно). Если взять 1 монету, получим суммы 3, 3. Если взять 0 монет получим суммы 0, 6. Эти варианты Вам не подходят, потому что Ваша сумма должна быть строго больше суммы Вашего близнеца.

Во втором примере одной монетой мы снова не обойдемся. Можно выбрать монеты достоинством 1, 2, либо 2, 2. В любом случае наименьшее количество монет равно 2.
*/

import java.util.Scanner;

public class Task160A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] money = new int[n];
		int sum = 0;
		for (int i = 0; i < money.length; i++) {
			money[i] = sc.nextInt();
			sum += money[i];
		}
		for (int i = 0; i < money.length-1; i++) {
			boolean flag = true;
			for (int j = 0; j < money.length-1-i; j++) {
				if (money[j] > money[j+1]) {
					int temp = money[j];
					money[j] = money[j+1];
					money[j+1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		int counter = 0;
		int currentSum = 0;
		for (int i = money.length-1; i > -1; i--) {
			if (currentSum <= sum - currentSum) {
				counter++;
				currentSum += money[i];
			} else {
				break;
			}
		}
		System.out.println(counter);
	}
}
