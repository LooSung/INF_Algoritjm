package day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solve2 {
	public static void main(String[] args) {
		// A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
		// 5
		//1 3 9 5 2
		//5
		//3 2 5 7 8
		// --> 2 3 5

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int K = sc.nextInt();
		int[] arr2 = new int[K];
		for (int i = 0; i < K; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr2);

		ArrayList<Integer> result = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while(p1 < arr.length && p2 < arr2.length) {
			if(arr[p1] < arr2[p2]) {
				p1++;
			} else if(arr[p1] == arr2[p2]) {
				result.add(arr[p1++]);
				p2++;
			} else {
				p2++;
			}
		}

		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i) + " ");
		}
	}
}
