package day2;

import java.util.Scanner;

public class Solve5_re {
	public static void main(String[] args){
		/* (에라토스네체)
		자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
		만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

		첫 줄에 소수의 개수를 출력합니다.
		20

		부가 설명 :
		2가 0 인 것을 확인하여 소수로 인지하고
		2가 소수인 것을 확인하고 2의 배수가 된 친구들을 1로 만든다.
		2 3 4 5 6 7 8 9 10
		1 0 1 0 1 0 1 0 1

		다음 3이 0 인 것을 확인하고
		3의 배수가 된 것을 1로 만든다.
		2 3 4 5 6 7 8 9 10
		1 1 1 0 1 0 1 1 1
		*/

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];

		int result = 0;
		for(int i=2; i<=N; i++){
			if(arr[i] == 0) {
				result++;
				for(int j=i; j<=N; j=j+i){
					arr[j]=1;
				}
			}
		}

		System.out.println(result);
	}
}