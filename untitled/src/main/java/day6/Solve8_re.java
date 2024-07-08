package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solve8_re {
	public static void main(String[] args) {
		// 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
		//
		// 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
		// 이분 검색이란 오름차순 또는 내림차순이 되어있다는 전제하에 진행한다.
		// 그리고 난 후에 전체 List에서 가운데 mid를 찾고 원하는 검색값고 같은 곳의 범위를 재 설정하여 반복한다.

		/*
		8 32
		23 87 65 12 57 32 99 81
		*/

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int lt = 0, rt = n - 1, result = 0;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (arr[mid] == target) {
				result = mid + 1;
				break;
			}

			if(arr[mid] > target) { rt = mid - 1; }
			else { lt = mid + 1; }
		}

		System.out.println(result);
	}
}
