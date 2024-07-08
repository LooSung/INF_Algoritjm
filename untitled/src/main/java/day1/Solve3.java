package day1;

import java.util.Scanner;

public class Solve3 {
	public static void main(String[] args){
		// it is time to study <-- 여기서 가장 긴 단어 찾기

		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split(" ");
		sc.close();

		String answer = "";
		int tmpCount = 0;
		for (String x : split) {
			int len = x.length();
			if (len > tmpCount) {
				answer = x;
			}
		}

		System.out.println(answer);
	}
}