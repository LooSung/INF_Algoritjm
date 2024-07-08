package day10;

import java.util.Scanner;

public class Solve2 {
	// 철수는 학교에 가는데 개울을 만났습니다. 개울은 N개의 돌로 다리를 만들어 놓았습니다.
	// 철수는 돌 다리를 건널 때 한 번에 한 칸 또는 두 칸씩 건너뛰면서 돌다리를 건널 수 있습니다.
	// 철수가 개울을 건너는 방법은 몇 가지일까요?
	static int[] fibo;

	public static int fibonacci(int n) {

		fibo[1] = 1;
		fibo[2] = 2;

		for (int i = 3; i <= n + 1; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		return fibo[n + 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		fibo = new int[n + 2];

		System.out.print(fibonacci(n));

	}
}
