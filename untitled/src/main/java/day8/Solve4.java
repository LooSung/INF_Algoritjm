package day8;

import java.util.Scanner;

public class Solve4 {
	// 중복순열 구하기
	// 1부터 N까지 적힌 구술이 있다, 이 중 중복을 허락하여 M번을 뽑아 일렬 하여라

	// 3 2
	static int n, m;
	static int[] arr;
	public static void DFS(int level) {
		if (level == m) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				arr[level] = i;
				DFS(level + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];

		DFS(0);
	}
}
