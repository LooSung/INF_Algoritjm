package day2;

import java.util.Scanner;

public class Solve7 {
	public static void main(String[] args) {
		// OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.
		// 0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.
		// 10
		// 채점 : 1 0 1 1 1 0 0 1 1 0
		// 점수 : 1 0 1 2 3 0 0 1 2 0
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int tmpSco = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				tmpSco = 0;
			} else {
				tmpSco++;
			}

			result += tmpSco;
		}

		System.out.println(result);
	}
}