package day8;

import java.util.Scanner;

public class Solve2 {
	// 부분집합 문제
	// N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.

/*
259 5
81
58
42
33
61
*/

	static int n, base = 0, result;
	public static void DFS(int level, int sum, int[] arr) {
		if(sum > base) return;

		if (level == n) {
			result = Math.max(result, sum);
		} else {
			DFS(level + 1, sum + arr[level], arr);
			DFS(level + 1, sum, arr);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		base = sc.nextInt();
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] += sc.nextInt();
		}

		DFS(0, 0, arr);

		System.out.println(result);
	}
}
