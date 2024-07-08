package day2;

import java.util.Scanner;

public class Solve2 {
	public static void main(String[] args){
		// 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
		// 선생님이 볼 수 있는 학생의 수
		// 8
		// 130 135 148 140 145 150 150 153

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();

		int result = 1;
		int fst = arr[0];
		for(int i=1; i < arr.length; i++){
			if(arr[i] > fst){
				result++;
				fst = arr[i];
			}
		}

		System.out.println(result);
	}
}