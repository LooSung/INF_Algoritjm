package day3;

import java.util.Scanner;

public class Solve5_1 {
	public static void main(String[] args) {
		// N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
		//
		//만약 N=15이면
		//
		//7+8=15
		//
		//4+5+6=15
		//
		//1+2+3+4+5=15

		// 설명 :
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 16 이라는 값을 넣는다.

		int result = 0, init = 1; // init은 연속된 자리 수이다.
		N--; // 수학 공식에 있다는데 16 이라면 일단 -1을 한다.
		while (N > 0) {
			init++; // 두 자리 수에서 나올 수 있는 경우를 찾는다.
			N -= init;
			if(N%init == 0) {
				result++;
			}
		}

		System.out.println(result);
	}
}
