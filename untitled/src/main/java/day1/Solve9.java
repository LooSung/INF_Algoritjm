package day1;

import java.util.Scanner;

public class Solve9 {
	public static void main(String[] args){
		// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
		// 첫 줄에 자연수를 출력합니다.
		// g0en2T0s8eSoft

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(solve1(str));
		System.out.println(solve2(str));
	}

	private static int solve1(String str){
		str = str.replaceAll("[a-zA-Z]", "");
		return Integer.parseInt(str);
	}

	private static int solve2(String str){
		int ans = 0;
		for(char c : str.toCharArray()){
			if(c >= 48 && c <= 57){
				ans = ans*10 + (c - 48);
			}
		}
		return ans;
	}
}