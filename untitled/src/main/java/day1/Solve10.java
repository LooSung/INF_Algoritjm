package day1;

import java.util.Scanner;

public class Solve10 {
	public static void main(String[] args){
		// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
		// 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
		// teachermode e

		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		char input2 = sc.next().charAt(0);
		for(int i : solve1(input1, input2)) {
			System.out.println(i+" ");
		}
	}

	private static int[] solve1(String s, char c){
		int[] res = new int[s.length()];
		int tmp = 1000;

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == c){
				tmp=0;
				res[i] = tmp;
			} else {
				tmp++;
				res[i] = tmp;
			}
		}

		tmp = 1000;
		for(int i=s.length()-1; i>= 0; i--){
			if(s.charAt(i) == c){
				tmp=0;
			} else {
				tmp++;
				res[i] = Math.min(res[i], tmp);
			}
		}

		return res;
	}
}