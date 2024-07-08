package day8;

import java.util.Scanner;

public class Solve4_2 {
	// 조합 구하기
	// 1부터 N까지 적힌 구술이 있다, 이 중 중복을 허락하여 M번을 뽑아 일렬 하여라

	// 4 2
	static int n, m;
	static int[] combi;
	public static void DFS(int level, int s) {
		if (level == m) {
			for (int a : combi) {
				System.out.print(a + " ");
			}
			System.out.println();
		} else {
			for (int i = s; i <= n; i++) {
				combi[level] = i;
				DFS(level + 1, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];

		DFS(0, 1);
	}
}
