package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve2 {
	public static void main(String[] args) {
		// 버븗 정렬 (매우 비효율적이나 구현이 간단함. 안정 정렬.)
		// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
		//
		// 정렬하는 방법은 버블정렬입니다.
		// 인접한 두 원소를 비교하여 필요시 교환하면서 리스트를 정렬하는 방식입니다. 이 과정을 리스트의 끝까지 반복하여 가장 큰 원소를 뒤로 보내고, 이를 반복하여 정렬합니다.
		// 선택정렬과 다르게 뒤에서부터 채워 넣는 방식
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
			for (int j = 0; j < arr.length - i - 1 ; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			result.add(arr[i]);
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i) + " ");
		}
	}
}
