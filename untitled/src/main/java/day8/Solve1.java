package day8;

import java.util.Scanner;

public class Solve1 {
	// 부분집합 문제
	// N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
	// 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
	// 예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다
/*
6
1 3 5 6 7 10
*/
	static String result = "NO";
	static int n, total =0;
	static boolean flag = false;
	public static void DFS(int level, int sum, int[] arr) {
		if (flag) {
			return;
		} else {
			if (level == n) {
				if ((total - sum) == sum) {
					result = "YES";
					flag = true;
				}
			} else {
				DFS(level + 1, sum + arr[level], arr);
				DFS(level + 1, sum, arr);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		DFS(0, 0, arr);

		System.out.println(result);
	}
}
