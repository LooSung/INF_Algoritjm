package day5;

import java.util.LinkedList;
import java.util.Scanner;

public class Solve3_re {
	public static void main(String[] args) {

		/*
		5
		0 0 0 0 0
		0 0 1 0 3
		0 2 5 0 1
		4 2 4 4 2
		3 5 1 3 1
		8
		1 5 3 5 1 2 1 4
		*/
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int k = sc.nextInt();
		int[] mov = new int[k];
		for(int i = 0; i < k; i++){
			mov[i] = sc.nextInt();
		}

		LinkedList<Integer> stack = new LinkedList<>();
		int result = 0;

		for(int p : mov) {
			for(int i = 0; i < matrix.length; i++) {
				if(matrix[i][p - 1] != 0) {
					int tmp = matrix[i][p - 1];
					matrix[i][p - 1] = 0;

					// 최근 추가된 요소와 비교
					if(!stack.isEmpty() && stack.peek() == tmp) {
						result += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}
					break;
				}
			}
		}

		System.out.println(result);
	}
}
