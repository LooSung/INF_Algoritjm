package day2;

import java.util.Scanner;

public class Solve11_re {
	public static void main(String[] args) {
		// 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
		// 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.
		/*
		5
		2 3 1 7 3
		4 1 9 6 8
		5 5 2 4 4
		6 5 2 6 7
		8 4 2 2 2
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int result = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;
			for (int j = 0; j < arr.length; j++) {
				for(int k = 0; k < N; k++) {
					if(arr[i][k] == arr[j][k]) {
						tmp++;
						break;
					}
				}
			}
			if(tmp > max) {
				max = tmp;
				result = i;
			}
		}

		System.out.println(result + 1);
	}
}