package day7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solve8_re {
	// 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
	//현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
	//
	//송아지는 움직이지 않고 제자리에 있다.
	//현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
	//
	//최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

	// 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다.
	// 5 14
	// 3

	//  14를 찾아라
	//               			0 --        5
	//		반복 패턴 --					1  -1  5
	//       1 -- 					6   	4   	10
	//   2 --				7   5   11   4  3  "9"  11 "9"  15
	// 3--              8 6 12 6 3 10 12 10 16 5 3 9 108 14
	static int[] cal = {1,-1,5};
	static int[] ch;

	public static int BFS(int root, int target) {
		Queue<Integer> queue = new LinkedList<>();
		ch = new int[10001];
		ch[root] = 1;
		queue.offer(root);
		int level = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int cur = queue.poll();
				if (cur == target) {
					return level;
				}
				for (int k : cal) {
					int tmp = cur + k;
					if (tmp == target) {
						return level;
					}
					if(tmp>=1 && tmp<= 10000 && ch[tmp]==0) {
						ch[tmp] = 1;
						queue.offer(tmp);
					}
				}

			}
			level++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cur = sc.nextInt();
		int tar = sc.nextInt();

		System.out.print(BFS(cur, tar));
	}
}
