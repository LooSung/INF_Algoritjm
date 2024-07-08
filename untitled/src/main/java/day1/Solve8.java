package day1;

import java.util.Scanner;

public class Solve8 {
	public static void main(String[] args){
		// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
		// 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
		// found7, time: study; Yduts; emit, 7Dnuof

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		System.out.println(solve1(str));
		// System.out.println(solve2(str));

	}

	private static String solve1(String str) {
		String answer = "";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String revStr = new StringBuilder(str).reverse().toString();

		System.out.println(str);
		System.out.println(revStr);

		if(str.equals(revStr)) {
			answer = "YES";
		} else {
			answer = "NO";
		}

		return answer;


		/*String orgStr = str.toUpperCase();
		StringBuilder sb = new StringBuilder(str.toUpperCase());
		sb.reverse();

		if(orgStr.contentEquals(sb)){
			return "YES";
		} else {
			return "NO";
		}*/
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