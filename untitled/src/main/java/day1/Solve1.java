package day1;

import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args){
		// 같은 문자 찾기
		// Computercooler
		// c

		Scanner sc = new Scanner(System.in);

		String input1 = sc.nextLine().toUpperCase();

		char input2 = sc.next().toUpperCase().charAt(0);

		int count = 0;

		for(int i=0; i < input1.length(); i++) {
			if(input1.charAt(i) == input2) {
				count ++;
			}
		}
		System.out.println(count);
	}
}