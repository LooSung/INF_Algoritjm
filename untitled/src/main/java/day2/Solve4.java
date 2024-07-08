package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve4 {
	public static void main(String[] args) {
		/*
		* 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
		* 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
		* 첫 줄에 피보나치 수열을 출력합니다.
		* 10
		* */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] result = new int[N];
		result[0] = 1;
		result[1] = 1;

		for (int i = 2; i < result.length; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}

		for (Integer integer : result) {
			System.out.println(integer + " ");
		}

		solve2(N);
	}

	private static void solve2(int N){
		int a = 1;
		int b = 1;
		int c;

		for (int i = 2; i <= N; i++) {
			c = a + b;
			System.out.println(a + " " + b + " " + c);
			a=b;
			b=c;
		}
	}
}