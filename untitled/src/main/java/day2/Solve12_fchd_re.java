package day2;

import java.util.Scanner;

public class Solve12_fchd_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] arr = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int result = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j) continue;  // 같은 학생끼리는 비교하지 않음
				int tmp = 0;
				for (int k = 0; k < M; k++) {
					int pi = -1;
					int pj = -1;
					for (int s = 0; s < N; s++) {
						if (arr[k][s] == i) pi = s;
						if (arr[k][s] == j) pj = s;
					}
					if (pi < pj) tmp++;
				}
				if (tmp == M) result++;
			}
		}

		System.out.println(result);
		sc.close();
	}
}
