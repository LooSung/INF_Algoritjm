package day8;

import java.util.Scanner;

public class Solve13 {
	// N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
	// 각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
	// 섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.
/*
7
1 1 0 0 0 1 0
0 1 1 0 1 1 0
0 1 0 0 0 0 0
0 0 0 1 0 1 1
1 1 0 1 1 0 0
1 0 0 0 1 0 0
1 0 1 0 1 0 0
*/
	static int n;
	static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
	static int[][] matrix;

	public static void DFS(int x, int y, int[][] arr) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n && matrix[nx][ny] == 1) {
				matrix[nx][ny] = 0;
				DFS(nx, ny, arr);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 1) {
					result++;
					matrix[i][j] = 0;

					DFS(i, j, matrix);
				}
			}
		}

		System.out.println(result);
	}
}
