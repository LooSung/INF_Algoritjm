package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o){
		// 오름차순 정렬 내림차순 정렬은 반대로.
		if(this.x==o.x) return this.y - o.y; // o.y - this.y
		else return this.x - o.x; // o.x = this.x
	}
}


public class Solve7_re {
	public static void main(String[] args) {
		// N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
		// 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
		/*
		5
		2 7
		1 3
		1 2
		2 5
		3 6
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(arr);

		for(Point p : arr){
			System.out.println(p.x + " " + p.y);
		}
	}
}
