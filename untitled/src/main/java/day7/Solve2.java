package day7;

import java.util.Scanner;

public class Solve2 {
	public static void main(String[] args) {
		// 10진수 N이 들어가면 2진수로 변환해서 들어가는 것을 만들어라
		// 11
		// 1011
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorial(n);
	}

	public static void factorial(int n) {
		if (n == 0) {
			return;
		}

		factorial(n/2);
		System.out.print(n%2);
	}
}
