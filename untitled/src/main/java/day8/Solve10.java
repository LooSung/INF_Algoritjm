package day8;

import java.util.Scanner;

public class Solve10 {
	// 미로탐색 DFS
	// 7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.
	// 출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 통로이다.
	// 격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면

	/*
	0 0 0 0 0 0 0
	0 1 1 1 1 1 0
	0 0 0 1 0 0 0
	1 1 0 1 0 1 1
	1 1 0 0 0 0 1
	1 1 0 1 1 0 0
	1 0 0 0 0 0 0
	*/
	// 상하좌우 체크
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] matrix;
	static int result = 0;

	public static void DFS(int x, int y) {
		if (x == 7 && y == 7) {
			result++;
		} else {
			for(int k = 0; k < 4; k++){
				int nx = x + dx[k];
				int ny= y + dy[k];

				if( nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && matrix[nx][ny] == 0) {
					matrix[nx][ny] = 1;
					DFS(nx, ny);
					matrix[nx][ny] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		matrix = new int[8][8];
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		matrix[1][1] = 1;

		DFS(1, 1);

		System.out.println(result);
	}
}