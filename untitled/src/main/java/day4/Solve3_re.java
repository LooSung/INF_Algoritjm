package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solve3_re {
	public static void main(String[] args) {
		// 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
		//
		//각 구간별로 구하라고 했습니다.
		//
		// 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
		//
		//두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
		//
		//세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
		//
		//네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
		/*
		7 4
		20 12 20 10 23 17 10
		풀이 : 투포인터 (LT, RT) + HashMap으로 넣으면서 찾는다.
		*/

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 1; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> result = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i < K-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		int lt = 0;
		for (int rt = K-1; rt < N; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			result.add(map.size());
			map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);

			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			lt++;
		}

		System.out.println(result);
	}
}
