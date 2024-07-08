package day8;

import java.util.Scanner;

public class Solve8 {
	// 3 1 2 4
	//  4 3 6
	//   7 9
	//    16

	// 첫째 줄에 두개의 정수 N(1≤N≤10)과 F가 주어진다.
	//N은 가장 윗줄에 있는 숫자의 개수를 의미하며 F는 가장 밑에 줄에 있는 수로 1,000,000 이하이다.

	// 4 16
	static int n, m;
	static int[] result;

	public static void DFS (int level, int n, int m) {
		if ( level == n ) {

		} else {

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		DFS(0, n, m);
	}
}
