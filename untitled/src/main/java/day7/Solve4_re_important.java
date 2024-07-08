package day7;

import java.util.Scanner;

public class Solve4_re_important {
	static int[] fibo; // 배열에 넣어서 하는방식

	public static int factorial(int n) {
		if(fibo[n] > 0) return fibo[n]; // 메모리 제이션 이미 구한 값을 또 할 필요 없으니까.

		if (n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = factorial(n - 2) + factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		// 피보나키 재귀
		// 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
		// 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		fibo = new int[n + 1];
		factorial(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}
