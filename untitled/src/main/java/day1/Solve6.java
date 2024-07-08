package day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solve6 {
	public static void main(String[] args){
		// 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
		// ksekkset
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(solve1(str));
		System.out.println(solve2(str));


	}

	private static String solve1(String str){
		String answer = "";
		for (int i = 0; i < str.length(); i++){
			if(str.indexOf(str.charAt(i)) == i){
				answer += str.charAt(i);
			}
		}

		return answer;
	}

	private static String solve2(String str){
		StringBuilder answer = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(!set.contains(c)) {
				answer.append(c);
				set.add(c);
			}
		}
		return answer.toString();
	}
}