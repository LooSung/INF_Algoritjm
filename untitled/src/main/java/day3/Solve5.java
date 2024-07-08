package day3;

import java.util.Scanner;

public class Solve5 {
	public static void main(String[] args) {
		// N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
		//
		//만약 N=15이면
		//
		//7+8=15
		//
		//4+5+6=15
		//
		//1+2+3+4+5=15
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = N/2 + 1; // 2로 나눠서 더하기에서 가장 큰 값 구하기

		int[] arr = new int[K];
		for (int i = 0; i < K; i++) {
			arr[i] = i + 1;
		}

		int result = 0, sum = 0, lt = 0;
		for (int rt = 0; rt < arr.length; rt++) {
			sum += arr[rt];

			if (sum == N) {
				result++;
			}

			while (sum >= N) {
				sum -= arr[lt++];

				if(sum == N) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
