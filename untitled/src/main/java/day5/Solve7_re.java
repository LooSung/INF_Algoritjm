package day5;

import java.util.LinkedList;
import java.util.Scanner;

public class Solve7_re {
	public static void main(String[] args) {
		// CBA 순서대로 교육을 들어야한다.
		// B과목은 C과목을 이수한 후에 들어야 하고, A과목은 C와 B를 이수한 후에 들어야 한다는 것입니다.
		//
		// 현수가 C, B, D, A, G, E로 수업계획을 짜면 제대로 된 설계이지만
		//
		// C, G, E, A, D, B 순서로 짰다면 잘 못 설계된 수업계획이 됩니다.

		/*
		CBA
		CBDAGE
		* */

		Scanner sc = new Scanner(System.in);

		String ord = sc.nextLine();
		String sub = sc.nextLine();

		String result = "YES";
		LinkedList<Character> ordQueue = new LinkedList<>();
		for(char c : ord.toCharArray()) {
			ordQueue.offer(c);
		}

		for(char c : sub.toCharArray()) {
			if(ordQueue.contains(c)) {
				if(c != ordQueue.poll()) {
					result = "NO";
				}
			}
		}

		if(!ordQueue.isEmpty()) {
			result = "NO";
		}

		System.out.println(result);
	}
}
