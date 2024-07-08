package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve3 {
	public static void main(String[] args) {
		/*
		* A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D
		* 1:가위, 2:바위, 3:보로
		* 5
		* 2 3 3 1 3
		* 1 1 2 2 3
		* */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();

		ArrayList<String> result = new ArrayList<>();
		for(int i=0; i<N; i++){
			if(A[i] == B[i]){
				result.add("D");
			} else if(A[i] == 1 && B[i] == 3) {
				result.add("A");
			} else if(A[i] == 2 && B[i] == 1) {
				result.add("A");
			} else if(A[i] == 3 && B[i] == 2) {
				result.add("A");
			} else {
				result.add("B");
			}
		}

		System.out.println(String.join(" ", result));
	}
}