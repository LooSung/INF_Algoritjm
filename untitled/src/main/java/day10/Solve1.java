package day10;

import java.util.Scanner;

public class Solve1 {
	// 철수는 계단을 오를 때 한 번에 한 계단 또는 두 계단씩 올라간다.
	// 만약 총 4계단을 오른다면 그 방법의 수는
	// 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2+1 로 5가지이다.
	// 7 -> 21
	static int[] fibo;

	public static int fibonacci(int n) {

		fibo[1] = 1;
		fibo[2] = 2;

		for (int i = 3; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		return fibo[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		fibo = new int[n + 1];

		System.out.print(fibonacci(n));

	}
}
