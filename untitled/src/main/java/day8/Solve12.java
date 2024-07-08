package day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
	public int x, y;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Solve12 {
	// 토마토 상자 BFS
	// 0 이면 익지 않음, 1 이면 익은, -1 비어있음
	// 토마토가 모두 익을 때까지의 최소 날짜를 출력해야 한다.
	/*
6 4
0 0 -1 0 0 0
0 0 1 0 -1 0
0 0 -1 0 0 0
0 0 0 0 -1 1
	*/
	static int n, m;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] matrix, dis;
	static Queue<Point2> queue = new LinkedList<>();

	public static void BFS() {
		while (!queue.isEmpty()) {
			Point2 point2 = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = point2.x + dx[i];
				int ny = point2.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && matrix[nx][ny] == 0) {
					matrix[nx][ny] = 1;
					queue.offer(new Point2(nx, ny));
					dis[nx][ny] = dis[point2.x][point2.y] + 1;
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		dis = new int[n][m];
		matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt(); // 상자

				if (matrix[i][j] == 1) {
					queue.offer(new Point2(i, j)); // 토마토가 익어있는 가상의 상자
				}
			}
		}

		BFS();

		int result = Integer.MIN_VALUE;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					result = Math.max(result, dis[i][j]);
				}
			}
			System.out.println(result);
		} else {
			System.out.println(-1);
		}
	}
}
