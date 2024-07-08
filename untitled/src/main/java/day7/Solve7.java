package day7;

import java.util.LinkedList;
import java.util.Objects;

public class Solve7 {
	// BFS (Breadth First Search) : Level Search
	// 아래와 같은 이진트리를 레벨 탐색하세요.
	//  1
	// 2  3
	//4 5 6 7
	Node root;
	public static void BFS(Node root) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			System.out.print(level + " : ");
			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				System.out.print(Objects.requireNonNull(node).data + " ");

				if(node.lt != null) {
					queue.offer(node.lt);
				}

				if(node.rt != null) {
					queue.offer(node.rt);
				}
			}
			level++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Solve7 tree = new Solve7();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		BFS(tree.root);
	}
}
