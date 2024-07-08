package day7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solve10 {
	Node root;
	public static int BFS(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				Node cur = queue.poll();
				if(cur.lt == null && cur.rt == null) {
					return level;
				} else {
					if(cur.lt != null) {
						queue.offer(cur.lt);
					}
					if(cur.rt != null) {
						queue.offer(cur.rt);
					}
				}
			}
			level++;
		}
		// 여기까지도 오지 않아!
		return level;
	}

	// 아래와 같은 이진트리에서 루트 노드 1에서 말단 노드까지의 길이중 가장 짧은 길이를구하는 것을 찾으시오
	public static void main(String[] args) {
		Solve10 tree = new Solve10();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.print(BFS(tree.root));
	}
}
