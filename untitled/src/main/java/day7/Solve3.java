package day7;

import java.util.Scanner;

public class Solve3 {
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n -1);
		}
	}

	public static void main(String[] args) {
		// 자연수 N이 입력되면 N!를 구하는 것을 만들어라
		// 5! = 5*4*3*2*1 = 120 입니다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(factorial(n));
	}
}
