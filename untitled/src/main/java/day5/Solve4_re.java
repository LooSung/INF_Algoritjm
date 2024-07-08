package day5;

import java.util.LinkedList;
import java.util.Scanner;

public class Solve4_re {
	public static void main(String[] args) {
		// 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
		// 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
		// 352+*9-
		// 설명 후위연산식이란 기본 연산식에서 숫자가 보이면 + - * / 연산식이 뒤로 가는 것을 말한다.
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		LinkedList<Integer> stack = new LinkedList<>();
		for (char c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				stack.push(Character.getNumericValue(c));
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(c == '+') {
					stack.push(lt + rt);
				} else if(c == '-') {
					stack.push(lt - rt);
				} else if(c == '*') {
					stack.push(lt * rt);
				} else if(c == '/') {
					stack.push(lt / rt);
				}
			}
		}

		System.out.println(stack.get(0));


	}
}
