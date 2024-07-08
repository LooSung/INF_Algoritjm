package day1;

import java.util.Scanner;

public class Solve2 {
	public static void main(String[] args){
		// StuDY (대문자 -> 소문자, 소문자 -> 대문자)

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder answer = new StringBuilder();

		for(char c : input.toCharArray()) {
			if(Character.isLowerCase(c))
				answer.append(Character.toUpperCase(c));
			else {
				answer.append(Character.toLowerCase(c));
			}
		}
		System.out.println(answer);
	}
}