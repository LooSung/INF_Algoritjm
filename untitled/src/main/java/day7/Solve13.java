package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve13 {
	// 인접리스트로 풀기 (DFS의 비효율 적인 것을 리스트 방식으로 푼다.)
	// 그래프에서 연결 된 1번 정점에서 N번정점으로 가는 모든 경로의 가지수를 출력하는 것을 찾아라
	// 그래프에서 갈 수 있는  5번의 정점으로 갈 수 있는 수는
	// 1 2 3 4 5
	// 1 2 5
	// 1 3 4 2 5
	// 1 3 4 5
	// 1 4 2 5
	// 1 4 5
	// 첫째 줄에는 Node(정점)의 수 그리고 간선의 수가 주어진다.
/*
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
*/

	static int node, line, result = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;

	public static void DFS(int v) {
		if (v == node) {
			result++;
		} else {
			for (int nv : graph.get(v)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		node = sc.nextInt();
		line = sc.nextInt();

		graph = new ArrayList<>();
		for(int i = 0; i < node; i++) {
			graph.add(new ArrayList<>());
		}

		ch = new int[node + 1];
		for(int i = 0; i < line; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}

		ch[1] = 1; // 첫 캐쉬 List에 1번 노드 저장
		DFS(1); // 1번 노드부터 DFS시작
		System.out.println(result);
	}
}
