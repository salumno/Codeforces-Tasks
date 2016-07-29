/*
Дан квадратный торт, который имеет вид таблицы размером r × c. Каждая ячейка таблицы содержит либо гадкую клубничку, либо является пустой. Например, торт размера 3 × 4 может выглядеть так:


Тортминатор намерен съесть этот торт! Каждый раз, когда он ест, он выбирает строку или столбец, не содержащие гадкой клубнички, а содержащие по крайней мере одну несъеденную ячейку торта. Затем Тортминатор поедает все выбранные им ячейки торта. Тортминатор может есть сколько угодно раз.

Пожалуйста, выведите максимальное количество ячеек, которые может съесть Тортминатор.

Входные данные
Первая строка содержит два целых числа r и c (2 ≤ r, c ≤ 10), обозначающих количество строк и количество столбцов в торте. Следующие r строк содержат по c символов — j-ый символ i-ой строки обозначает содержимое ячейки в строке i и столбце j, и имеет одно из следующих значений:

символ '.' обозначает ячейку торта без гадкой клубнички;
символ 'S' обозначает ячейку торта с гадкой клубничкой.
Выходные данные
Выведите максимальное количество ячеек торта, которые может съесть тортминатор.

Примеры
входные данные
3 4
S...
....
..S.
выходные данные
8
*/

import java.util.Scanner;

public class Tortminator {

    public static boolean checkLine (char[][] cake, int i, int c) {
        boolean flag = true;
        for (int j = 0; j < c; j++) {
            if (cake[i][j] == 'S') {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean checkColumn (char[][] cake, int j, int r) {
        boolean flag = true;
        for (int i = 0; i < r; i++) {
            if (cake[i][j] == 'S') {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int changeLine(char[][] cake, int i, int c) {
        int sum = 0;
        for (int j = 0; j < c; j++) {
            if (cake[i][j] != '_') {
                cake[i][j] = '_';
                sum++;
            }
        }
        return sum;
    }

    public static int changeColumn(char[][] cake, int j, int r) {
        int sum = 0;
        for (int i = 0; i < r; i++) {
            if (cake[i][j] != '_') {
                cake[i][j] = '_';
                sum++;
            }
        }
        return sum;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        char[][] cake = new char[r][c];
        int [][] s = new int[100][2];
        for (int i = 0; i < r; i++) {
            String str = sc.nextLine();
            cake[i] = str.toCharArray(); 
        }
        int counter = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (checkLine(cake, i, c)) {
                    counter += changeLine(cake, i, c);
                }
                if (checkColumn(cake, j, r)) {
                    counter += changeColumn(cake, j, r);
                }
            }
        }
        System.out.println(counter);
    }
}
