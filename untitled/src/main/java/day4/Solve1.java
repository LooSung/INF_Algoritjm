package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args) {
		// 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
		//
		//투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
		//
		//선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
		//
		//반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.

		// 15
		// BACBACCACCBDEDE
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		String result = "";
		int max = Integer.MIN_VALUE;
		for(char c : map.keySet()) {
			if(map.get(c) > max) {
				max = map.get(c);
				result = String.valueOf(c);
			}
		}

		System.out.println(result);
	}
}
