package day5;

import java.util.LinkedList;
import java.util.Scanner;

public class Solve6_re {
	public static void main(String[] args) {
		// 예를 들어 총 8명의 왕자가 있고, 3을 외친 왕자가 제외된다고 하자. 처음에는 3번 왕자가 3을 외쳐 제외된다.
		//
		//이어 6, 1, 5, 2, 8, 4번 왕자가 차례대로 제외되고 마지막까지 남게 된 7번 왕자에게 공주를 구하러갑니다.
		//
		//N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램을 작성하시오.

		// 8 3
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int result = 0;
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}

		while (!queue.isEmpty()) {
			for (int i = 1; i<k; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();

			if (queue.size() == 1) result += queue.poll();
		}

		System.out.println(result);
	}
}
