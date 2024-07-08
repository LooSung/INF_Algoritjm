package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solve6 {
	public static void main(String[] args) {
		// 선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다.

		// 그런데 철수가 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨습니다. 선생님은 이 사실을 모르고 학생들에게 서있는 순서대로 번호를 부여했습니다.

		// 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때
		// 철수가 받은 번호와 철수 짝꿍이 받은 번호를 출력하세요.
		/*
		9
		120 125 152 130 135 135 143 127 160
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int[] sortArr = arr.clone();
		Arrays.sort(sortArr);

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (sortArr[i] != arr[i]) {
				result.add(i + 1);
			}
		}

		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
	}
}
