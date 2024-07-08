package day7;

import java.util.Scanner;

public class Solve6 {
	// 자연수 N이 주어지면 1 부터 N까지 원소를 갖는 집합의 부분집합을 모두 출력하게 하시오.
	// 3

	// 1 2 3
	// 1 2
	// 1 3
	// 1
	// 2 3
	// 2

	static int n;
	static int[] ch;

	public static void DFS(int L) {
		if(L == n + 1) {
			String output = "";
			for(int i = 1; i <= n; i++) {
				output += (i + " ");
			}

			if(!output.isEmpty()) {
				System.out.println(output);
			}
		} else {
			ch[L] = 1;
			DFS(L + 1); // Left Node
			ch[L] = 0;
			DFS(L + 1); // Right Node
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ch = new int[n + 1];
		DFS(1);
	}
}
