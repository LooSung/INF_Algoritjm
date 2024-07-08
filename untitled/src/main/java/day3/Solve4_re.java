package day3;

import java.util.Scanner;

public class Solve4_re {
	// N개의 수로 이루어진 수열이 주어집니다.
	//
	//이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
	//
	//만약 N=8, M=6이고 수열이 다음과 같다면
	//
	//1 2 1 3 1 1 1 2
	//
	//합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
	// 8 6
	// 1 2 1 3 1 1 1 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}


		int result = 0, sum = 0, lt = 0;
		for (int rt = 0; rt < N; rt++) {
			sum += arr[rt];

			if(sum == K) {
				result++;
			}

			while(sum >= K) {
				sum -= arr[lt++];
				if(sum == K) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
