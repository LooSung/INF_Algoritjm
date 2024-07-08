package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point2 implements Comparable<Point2> {
	public int x, y;
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point2 o){
		if(this.y == o.x) {
			return this.x - o.x;
		} else {
			return  this.y - o.y;
		}
	}
}

public class Solve2 {
	/*
5
1 4
2 3
3 5
4 6
5 7
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Point2> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point2(x, y));
		}
		Collections.sort(arr);

		int result = 0;
		int min = 0;
		for (Point2 p : arr) {
			if (p.x >= min) {
				result++;
				min = p.y;
			}
		}

		System.out.println(result);

	}
}
