package day5;

import java.util.LinkedList;
import java.util.Scanner;

public class Solve2 {
	// 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
	// (A(BC)D)EF(G(H)(IJ)K)LM(N)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		LinkedList<Character> stack = new LinkedList<>();
		for (char c : str.toCharArray()) {
			if (c == ')') {
				while(!stack.isEmpty() && stack.pop() != '(');
			} else {
				stack.push(c);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.insert(0, stack.pop());
		}

		System.out.println(sb);
	}
}
