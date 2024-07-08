package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solve3 {
	public static void main(String[] args) {
		// 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
		//만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
		//12 15 11 20 25 10 20 19 13 15
		//연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

		//10 3
		//12 15 11 20 25 10 20 19 13 15
		// 참고 : 슬라이딩 윈도우 문제
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int tmp;
		ArrayList<Integer> list = new ArrayList<>();
		int result ,sum = 0;

		for(int i = 0; i < K; i++) {
			sum += arr[i];
		}
		result = sum;
		for(int i=K; i<N; i++) {
			sum += (arr[i] - arr[i-K]);
			result = Math.max(result, sum);
			list.add(sum);
		}

		tmp = Collections.max(list);

		System.out.println(result);
	}
}
