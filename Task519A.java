/*
A и B готовятся к олимпиадам про программированию.

Чтобы развить свое логическое мышление и лучше решать задачи, A и B решили сыграть в шахматы. Во время игры A задумался, чья же позиция в данный момент сильнее.

Для каждой шахматной фигуры известен ее вес:

вес ферзя равен 9,
вес ладьи равен 5,
вес слона равен 3,
вес коня равен 3,
вес пешки равен 1,
вес короля не учитывается при оценке позиции.
Вес позиции игрока равен сумме весов всех его фигур на доске.

Так как A не любит считать, он попросил вас помочь определить, вес позиции какого из двух игроков больше.

Входные данные
На вход подаются восемь строк, по восемь символов каждая — описание доски.

На доске белые фигуры обозначаются заглавными буквами, черные фигуры — строчными.

Белые фигуры обозначаются следующим образом: ферзь обозначается символом 'Q', ладья — 'R', слон — 'B', конь — 'N', пешка — 'P', король — 'K'.

Черные фигуры обозначаются, соответственно, 'q', 'r', 'b', 'n', 'p', 'k'.

Пустая клетка доски обозначается символом '.' (точка).

Не гарантируется, что заданная шахматная позиция достижима во время реальной игры. В частности, каждой фигуры может быть произвольное (в том числе нулевое) количество, король может находиться под боем, и так далее.

Выходные данные
Выведите "White" (без кавычек), если вес позиции белых больше веса позиции черных, "Black" если вес позиции черных больше веса позиции белых, и "Draw" если веса позиций белых и черных равны.

Примеры
входные данные
...QK...
........
........
........
........
........
........
...rk...
выходные данные
White
входные данные
rnbqkbnr
pppppppp
........
........
........
........
PPPPPPPP
RNBQKBNR
выходные данные
Draw
входные данные
rppppppr
...k....
........
........
........
........
K...Q...
........
выходные данные
Black
*/

import java.util.Scanner;

public class Task519A {

	public static int finder (char c) {
		int p = 0;
		char s = Character.toLowerCase(c);
		switch (s) {
			case 'q': 
				p += 9;
				break;
			case 'r': 
				p += 5;
				break;
			case 'b': 
				p += 3;
				break;
			case 'n': 
				p += 3;
				break;
			case 'p': 
				p += 1;
				break;
			case 'k': 
				p += 0;
				break;
		}
		return p;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int blackPoint = 0;
		int whitePoint = 0;
		for (int i = 0; i < 8; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < line.length(); j++) {
				char symbol = line.charAt(j);
				if (symbol >= 'a' && symbol <= 'z') {
					blackPoint += finder(symbol);
				} else {
					if (symbol >= 'A' && symbol <= 'Z') {
						whitePoint += finder(symbol);
					}
				}
			}
		}
		String ans = "Draw";
		if (blackPoint > whitePoint) {
			ans = "Black";
		} else {
			if (blackPoint < whitePoint) {
				ans = "White";
			}
		}
		System.out.println(ans);
	}
}
