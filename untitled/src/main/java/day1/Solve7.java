package day1;

import java.util.Scanner;

public class Solve7 {
	public static void main(String[] args){
		// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
		// 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
		// gooG
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		System.out.println(solve1(str));
		System.out.println(solve2(str));

	}

	private static String solve1(String str) {
		String orgStr = str.toUpperCase();
		StringBuilder sb = new StringBuilder(str.toUpperCase());
		sb.reverse();

		if(orgStr.contentEquals(sb)){
			return "YES";
		} else {
			return "NO";
		}
	}

	private static String solve2(String str) {
		str = str.toUpperCase();
		int len = str.length();
		String ans = "";

		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) == str.charAt(len-i-1)){
				ans = "YES";
			} else {
				ans = "NO";
			}
		}
		return ans;
	}
}