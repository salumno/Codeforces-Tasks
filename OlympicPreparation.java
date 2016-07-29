/*
У вас есть n задач. Сложность i-й из них вы оценили целым числом ci. Теперь вы хотите подготовить комплект задач для олимпиады, используя некоторые из придуманных задач.

Комплект задач для олимпиады должен состоять не менее чем из двух задач. Вы считаете, что суммарная сложность задач олимпиады должна быть не менее l и не более r. Также вы считаете, что разница в сложности между самой легкой и самой тяжелой из выбранных задач должна быть не меньше x.

Найдите количество способов выбрать комплект задач для олимпиады.

Входные данные
Первая строка содержит четыре целых числа n, l, r, x (1 ≤ n ≤ 15, 1 ≤ l ≤ r ≤ 109, 1 ≤ x ≤ 106) — соответственно количество задач в вашем распоряжении, минимальное и максимальное значение суммарной сложности комплекта задач и минимальная разница по сложности между самой сложной задачей в комплекте и самой лёгкой.

Вторая строка содержит n целых чисел c1, c2, ..., cn (1 ≤ ci ≤ 106) — сложность каждой из придуманных задач.

Выходные данные
Выведите количество способов выбрать подходящий комплект задач для олимпиады.

Примеры
входные данные
3 5 6 1
1 2 3
выходные данные
2
входные данные
4 40 50 10
10 20 30 25
выходные данные
2
входные данные
5 25 35 10
10 10 20 10 20
выходные данные
6
Примечание
В первом примере подходят два комплекта: состоящий из второй и третьей задачи, а также состоящий из всех трех задач.

Во втором примере подходят два комплекта задач — комплект из задач сложностями 10 и 30, а также комплект из задач сложностями 20 и 30.

В третьем примере подходит любой комплект, в котором одна задача имеет сложность 10, а вторая — сложность 20.
*/

import java.util.Scanner;

public class OlympicPreparation {

    public static void cleaner (int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            comb[i] = 0;
        }
    }

    public static boolean arrSum (int[] comb, int l, int r) {
        boolean flag = false;
        int sum = 0;
        for (int i = 0; i < comb.length; i++) {
            sum += comb[i];
        }
        if (sum >= l && sum <= r) {
            flag = true;
        }
        return flag;
    }

    public static boolean residual (int[] comb, int x) {
        boolean flag = false;
        int max = -1;
        int min = 1000001;
        for (int i = 0; i < comb.length; i++) {
            if (comb[i] != 0) {
                if (comb[i] > max) {
                    max = comb[i];
                }
                if (comb[i] < min) {
                    min = comb[i];
                }
            }
        }
        int res = max - min;
        if (res >= x) {
            flag = true;
        }
        return flag;
    }

    public static boolean arrLength (int[] comb) {
        boolean flag = false;
        int sum = 0;
        for (int i = 0; i < comb.length; i++) {
            if (comb[i] != 0) {
                sum++;
            }
        }
        if (sum >= 2) {
            flag = true;
        }
        return flag;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int counter = 0;
        int[] comb = new int[n];
        int num = 1;
        String binNum = Integer.toBinaryString(num);
        while (binNum.length() <=  n){
            cleaner(comb);
            int k = 0;
            for (int i = binNum.length()-1; i > -1; i--) {
                if (binNum.charAt(i) == '1') {
                    comb[k] = c[Math.abs(i - binNum.length() + 1)];
                    k++;
                }
            }
            if (arrLength(comb) && arrSum(comb, l, r) && residual(comb, x)) {
                counter++;
            }
            num++;
            binNum = Integer.toBinaryString(num);
        }
        System.out.println(counter);
    }
}
