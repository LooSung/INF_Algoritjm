package day2;

import java.util.Scanner;

public class Solve10_re {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) {
		// 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
		// 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요

		// 5
		// 5 3 7 2 3
		// 3 7 1 6 1
		// 7 2 5 3 4
		// 4 3 6 4 1
		// 8 7 3 5 2
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// 반복문으로 현재 상하좌우의 숫자보다 크면 봉우리로 확인
		int result = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				boolean flag=true;
				for(int t = 0; t < 4; t++){
					int nx = i + dx[t];
					int ny= j + dy[t];

					if( nx>= 0 && nx< N && ny>=0 && ny< N) {
						if(arr[nx][ny] >= arr[i][j]) {
							flag = false;
							break;
						}
					}
				}
				if(flag){
					result++;
				}
			}
		}
		System.out.println(result);
	}
}