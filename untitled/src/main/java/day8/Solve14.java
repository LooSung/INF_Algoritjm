package day8;

import java.util.ArrayList;
import java.util.Scanner;

class Point3 {
	public int x, y;

	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Solve14 {
	/*
4 4
0 1 2 0
1 0 2 1
0 2 1 2
2 0 1 2
*/
	static int n, m, len, result;
	static int[] combi;
	static ArrayList<Point3> hs, pz;

	public static void DFS(int x, int y) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		hs = new ArrayList<>();
		pz = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int tmp = sc.nextInt();
				if(tmp == 1) hs.add(new Point3(i, j));
				else if (tmp == 2) pz.add(new Point3(i, j));
			}
		}
		// len C combi
		len = pz.size();
		combi = new int[m];
		DFS(0, 0);
	}
}
