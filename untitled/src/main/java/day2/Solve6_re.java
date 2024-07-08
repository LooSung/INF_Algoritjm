package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Solve6_re {
	public static void main(String[] args){
		/*
		N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
		예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
		첫 자리부터의 연속된 0은 무시한다.

		9
		32 55 62 20 250 370 200 30 100

		추가 설명 :
		뒤집기  123 -> 321 (a = 123, reverse = 0)
		tmp = a % 10 (나머지 구하기)
		1. 0
		2. 3
		3. 2
		4. 1

		reverse = reverse * 10 + tmp
		1. 0 = 0 * 10 + 0
		2. 3 = 0 * 10 + 3
		3. 32 = 3 * 10 + 2
		4. 321 = 32* 10 + 1

		a = a / 10
		1. 123 = 1230 / 10
		2. 12 = 123 / 10
		3. 1 = 12 / 10
		4. 0 = 1 / 10

		*/

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();

		int[] newArr = new int[N];
		for(int i = 0; i < N; i++){
			int rev = 0;
			while(arr[i] != 0) {
				rev = rev * 10 + arr[i] % 10;
				arr[i]/=10;
			}

			if(rev != 1) {
				for(int j=2; j<rev; j++) {
					if(rev%j != 0) {
						newArr[i] = rev;
					}
				}
			}

		}


		System.out.println(Arrays.toString(newArr));
	}
}