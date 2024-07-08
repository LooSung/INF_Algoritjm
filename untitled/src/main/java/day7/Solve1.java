package day7;

import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args) {
		// 재귀 함수
		// 반복문 for 과 같기도 하지만, Stack의 형태로 작동하기도한다.
		// 재귀함수 Factorial은 DFS와 같은 개념이며, 자신의 함수가 모두 작동하고 조건의 마지막 단계에 왔을때
		// 그 나머지 작업을 수행한다.
		// 예시로 밑의 System.out.print(n + " "); 부분이 후에 넣은 이유는 Stack의 형태로 작업이 되며, 재귀 함수의 실행이 되는 이유이기도 하다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		factorial(n);
	}

	public static void factorial(int n) {
		if (n == 0) {
			return;
		}

		factorial(n - 1);
		System.out.print(n + " ");
	}
}
