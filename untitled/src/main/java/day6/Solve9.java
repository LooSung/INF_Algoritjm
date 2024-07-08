package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solve9 {
	public static void main(String[] args) {
		// 1-9까지의 3장에 담을 수 있는 최소용량을 구하시오
		// 설명 : 3개의 DVD용량이 17분짜리이면 (1, 2, 3, 4, 5) (6, 7), (8, 9) 이렇게 3개의 DVD로 녹음을 할 수 있다.
		// 17분 용량보다 작은 용량으로는 3개의 DVD에 모든 영상을 녹화할 수 없다.
		/*
		9 3
		1 2 3 4 5 6 7 8 9
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();

		int result = 0;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if(count(arr, mid) <= 3) {
				result = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}

		System.out.println(result);
	}

	public static int count(int[] arr, int count) {
		int cnt = 1, sum = 0;
		for (int x : arr) {
			if(sum + x > count) {
				cnt++;
				sum = x;
			} else {
				sum += x;
			}
		}
		return cnt;
	}
}
