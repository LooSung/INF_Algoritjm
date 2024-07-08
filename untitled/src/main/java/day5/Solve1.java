package day5;

import java.util.LinkedList;
import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args) {
		// 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
		// 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

		// (()(()))(() --> NO
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String result = "Yes";
		LinkedList<Character> list = new LinkedList<>();
		for (char c : s.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				list.push(c);
			} else {
				if (list.isEmpty()) {
					result = "NO";
				}
				list.pop();
			}
		}

		if(!list.isEmpty()) {
			result = "NO";
		}

		System.out.println(result);
	}
}
