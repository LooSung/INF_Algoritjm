package day6;

import java.util.Scanner;

public class Solve5 {
	public static void main(String[] args) {
		// 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
		// N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
		/*
		8
		20 25 52 30 39 33 43 33
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		String result = "D";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					result = "U";
				} else {
					result = "D";
					break;
				}
			}
			if(result.equals("D")) break;
		}

		System.out.println(result);
	}
}
