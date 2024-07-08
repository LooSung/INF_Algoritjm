package day6;

import java.util.Scanner;

public class Solve4_re {
	public static void main(String[] args) {
		// Least Recently Used
		//
		// 캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
		// 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요.

		// Hint 캐시 매모리 상태 변화 (삽입정렬로 Hit Miss 확인)
		// 1 0 0 0 0
		// 2 1 0 0 0
		// 3 2 1 0 0
		// 2 3 1 0 0
		// 6 2 3 1 0
		// 2 6 3 1 0
		// 3 2 6 1 0
		// 5 3 2 6 1
		// 7 5 3 2 6

		// 5 9
		// 1 2 3 2 6 2 3 5 7
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = new int[n];
		for (int cache : arr) {
			int pos = -1; // Hit, Miss 구분

			// Hit! (Cache 안에 같은게 있어!)
			for (int j = 0; j < n; j++) {
				if(cache == result[j]) {
					pos = j;
				}
			}

			// Miss!
			if(pos == -1) { //  같은게 없어! 한칸씩 뺴주고 맨 앞자리에 넣어!
				for (int j = n-1; j >= 1; j--) {
					result[j] = result[j-1];
				}
				result[0] = cache;
			} else { // 같은게 있어! 처음 구분 Flag 만큼 for 문돌아서 맨 앞에 넣어!
				for (int j = pos; j >= 1; j--) {
					result[j] = result[j-1];
				}
				result[0] = cache;
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
