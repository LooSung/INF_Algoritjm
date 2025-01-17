package day10;

import java.util.Scanner;

// N개의 자연수로 이루어진 수열이 주어졌을 때,
// 그 중에서 가장 길게 증가하는(작은 수에서 큰 수로) 원소들의 집합을 찾는 프로그램을 작성하라.
//
// 예를 들어, 원소가 2, 7, 5, 8, 6, 4, 7, 12, 3 이면 가장 길게 증가하도록 원소들을 차례대로 뽑아내면 2, 5, 6, 7, 12를 뽑아내어
// 길이가 5인 최대 부분 증가수열을 만들 수 있다.

/*
8
5 3 7 8 6 2 9 4
*/

public class Solve3_re {
	static int[] dy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		dy = new int[arr.length];
		dy[0] = 1;

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					if (dy[j] > max) {
						max = dy[j];
					}
				}
			}
			dy[i] = max + 1;
			result = Math.max(result, dy[i]);
		}

		System.out.print(result);
	}
}
