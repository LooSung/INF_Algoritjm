package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve8 {
	public static void main(String[] args) {
		// N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력
		// 5
		// 87 89 92 100 76
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int rank = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					rank++;
				}
			}
			list.add(rank);
		}

		System.out.println(list);
	}
}