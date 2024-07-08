package day8;

import java.util.Scanner;

public class Solve6 {
	// 메모리제이션 + 조합의 경우의수 문제
	// 예제 5C3 = 10가지가 나온다.

	// 5 3
	static int n, r, result = 0;
	static int[][] ch = new int[35][35];

	public static int DFS (int n, int r) {
		if (ch[n][r] > 0) return ch[n][r];

		if (n == r || r == 0) {
			return 1;
		} else {
			return ch[n][r] = DFS(n - 1, r - 1) + DFS(n - 1 , r);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();

		System.out.println(DFS(n, r));
	}
}
