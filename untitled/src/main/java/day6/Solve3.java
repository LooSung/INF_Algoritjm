package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve3 {
	public static void main(String[] args) {
		// 삽입 정렬 ( 리스트의 앞부분이 이미 정렬되어 있을 때 효율적. 안정 정렬.)
		// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
		//
		// 정렬하는 방법은 삽입정렬입니다.
		// 삽입정렬은 리스트를 순차적으로 탐색하면서 각 원소를 그보다 앞에 있는 정렬된 부분과 비교하여 알맞은 위치에 삽입하는 방식입니다.
		/*
		6
		11 7 5 6 10 9
		* */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i], j;
			for(j = i - 1 ; j >= 0; j--) {
				if(arr[j] > tmp) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
				arr[j + 1] = tmp;
			}
			result.add(tmp);
		}

		for (Integer integer : result) {
			System.out.println(integer + " ");
		}
	}
}
