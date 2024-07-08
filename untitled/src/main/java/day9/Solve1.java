package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o){
		return o.x - this.x;
	}
}

public class Solve1 {
	// Greedy Algorithm
	// 최고의 시름선수 찾기
	/*
5
172 67
183 65
180 70
170 72
181 60
*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);

		int result = 0;
		int max = Integer.MIN_VALUE;
		for (Point p : arr) {
			if (p.y > max) {
				max = p.y;
				result++;
			}
		}

		System.out.println(result);

	}
}
