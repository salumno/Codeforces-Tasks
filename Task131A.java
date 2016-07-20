/*
зАЧЕМ НУЖНА КЛАВИША cAPS lOCK?

Caps Lock — клавиша компьютерной клавиатуры, предназначенная для автоматической (постоянной) смены регистра букв со строчных на прописные. Будучи случайно нажатой, она приводит к последствиям вроде первого абзаца в условии этой задачи.

Будем считать, что слово набрано с ошибочно нажатой клавишей Caps Lock, если:

либо оно полностью состоит из прописных букв;
либо прописными являются все его буквы, кроме первой.
В таком случае, нужно автоматически поменять регистр всех букв на противоположный. Например, регистр букв слов «hELLO», «HTTP», «z» должен быть изменен.

Напишите программу, которая применяет описанное выше правило или оставляет слово без изменения, если оно не применимо.

Входные данные
В первой строке входных данных записано слово, состоящее из прописных или строчных букв латинского алфавита. Длина слова — от 1 до 100 символов включительно.

Выходные данные
Выведите результат обработки данного слова.

Примеры
входные данные
cAPS
выходные данные
Caps
входные данные
Lock
выходные данные
Lock
*/

import java.util.Scanner;

public class Task131A {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (str.toUpperCase().equals(str)) {
			str = str.toLowerCase();
		} else {
			if (str.substring(1).toUpperCase().equals(str.substring(1))) {
				str = (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();
			}
		}
		System.out.println(str);
	}
}