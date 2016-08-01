/*
Слово или предложение на некотором языке называется панграммой, если в нем встречаются все символы алфавита этого языка хотя бы один раз. Панграммы часто используют в типографии для демонстрации шрифтов или тестирования средств вывода различных устройств.

Вам дана строка, состоящая из маленьких и больших латинских букв. Проверьте, является ли эта строка панграммой. Считается, что строка содержит букву латинского алфавита, если эта буква встречается в верхнем или нижнем регистре.

Входные данные
В первой строке записано одно целое число n (1 ≤ n ≤ 100) — количество символов в строке.

Во второй строке записана сама строка. Строка содержит исключительно строчные и заглавные латинские буквы.

Выходные данные
Выведите «YES», если строка является панграммой, и «NO» в противном случае.

Примеры
входные данные
12
toosmallword
выходные данные
NO
входные данные
35
TheQuickBrownFoxJumpsOverTheLazyDog
выходные данные
YES
*/

import java.util.Scanner;

public class Task520A {

    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	
    	sc.nextLine();
    	String str = sc.nextLine();
    	int[] counter = new int[26];
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
    			counter[str.codePointAt(i) - 65]++;
    		}
    		if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
    			counter[str.codePointAt(i) - 97]++;
    		}
    	}
    	boolean flag = true;
    	for (int i = 0; i < counter.length; i++) {
    		if (counter[i] == 0) {
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
