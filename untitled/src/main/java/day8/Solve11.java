package day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	public int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Solve11 {
	// 미로의 최단거리 통로(BFS)

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
	static int[][] matrix, dis;

	public static void BFS(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		matrix[x][y] = 1;

		while (!queue.isEmpty()) {
			Point Point = queue.poll();

			for(int k = 0; k < 4; k++){
				int nx = Point.x + dx[k];
				int ny = Point.y + dy[k];

				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && matrix[nx][ny] == 0) {
					matrix[nx][ny] = 1;
					queue.offer(new Point(nx, ny));
					dis[nx][ny] = dis[Point.x][Point.y] + 1;
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		dis = new int[8][8];
		matrix = new int[8][8];
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		matrix[1][1] = 1;

		BFS(1, 1);

		if (dis[7][7] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(dis[7][7]);
		}
	}
}