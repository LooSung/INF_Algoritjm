package day1;

import java.util.Scanner;

public class Solve5 {
	public static void main(String[] args) {
		// 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
		// a#b!GE*T@S
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(algo1(str));
	}

	private static String algo1(String str) {
		char[] chars = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;

		while (lt < rt) {
			if(!Character.isAlphabetic(chars[lt])) {
				lt++;
			} else if(!Character.isAlphabetic(chars[rt])) {
				rt--;
			} else {
				char tmp = chars[lt];
				chars[lt] = chars[rt];
				chars[rt] = tmp;
				lt++;
				rt--;
			}
		}
		return String.valueOf(chars);
	}
}