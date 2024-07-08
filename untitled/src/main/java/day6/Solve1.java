package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args) {
		// 선택정렬 (단순하지만 효율성이 떨어짐. 불안정 정렬.)
		// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
		//
		// 정렬하는 방법은 선택정렬입니다.
		// 리스트에서 매번 가장 작은(혹은 큰) 원소를 찾아내어 정렬되지 않은 부분의 첫 번째 원소와 교환하는 방식입니다.
		// 그레서 앞자리에 임시 index를 넣어 거게에 가장 작은 값을 넣는 방법을 택한다.

		/*
		6
		13 5 11 7 23 15
		* */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[idx]) {
					idx = j;
				}
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
			}
			result.add(arr[i]);
		}

		for (Integer i : result) {
			System.out.println(i + " ");
		}
	}
}
