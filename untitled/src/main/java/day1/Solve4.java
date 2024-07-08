package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve4 {
	public static void main(String[] args){

		/*
		N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다
		3
		good
		Time
		Big
		*/
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();  // 개행 문자를 소비하여 다음 입력을 받을 준비를 합니다.

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextLine());
		}
		sc.close();

		System.out.println(algo1(list));
		System.out.println(algo2(list));


	}

	private static ArrayList<String> algo1(ArrayList<String> list){
		ArrayList<String> answer = new ArrayList<>();
		for(String asw : list) {
			char[] c = asw.toCharArray();
			int lt = 0;
			int rt = c.length - 1;
			while(lt < rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt ++;
				rt --;
			}
			String tmp = String.valueOf(c);
			answer.add(tmp);
		}
		return answer;
	}

	private static ArrayList<String> algo2(ArrayList<String> list) {
		ArrayList<String> answer = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			StringBuilder sb = new StringBuilder(list.get(i));
			sb.reverse();
			answer.add(sb.toString());
		}
		return answer;
	}
}