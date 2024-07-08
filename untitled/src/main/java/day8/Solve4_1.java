package day8;

import java.util.Scanner;

public class Solve4_1 {
	// 오름차순 구하기
	// 3 2
	// 3 6 9

	// 3 2
	static int n, m;
	static int[] ch, pm, arr;
	public static void DFS(int level) {
		if (level == m) {
			for (int a : pm) {
				System.out.print(a + " ");
			}
			System.out.println();
		} else {
			for (int i = 0; i < n; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					pm[level] = arr[i];
					DFS(level + 1);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		ch = new int[n];
		pm = new int[m];

		DFS(0);
	}
}
