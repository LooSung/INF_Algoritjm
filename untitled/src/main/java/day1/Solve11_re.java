package day1;

import java.util.Scanner;

public class Solve11_re {
	public static void main(String[] args){
		// 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
		// 첫 줄에 압축된 문자열을 출력한다.
		// KKHSSSSSSSE -> K2HS7E
		// KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str + " ";
		String answer = "";

		int tmp = 1;
		for(int i = 0 ; i < str.length()-1 ; i++){
			if(str.charAt(i) == str.charAt(i+1)){
				tmp++;
			} else {
				answer += str.charAt(i);
				if(tmp > 1){
					answer += String.valueOf(tmp);
				}
				tmp = 1;
			}
		}

		System.out.println(answer);
	}
}