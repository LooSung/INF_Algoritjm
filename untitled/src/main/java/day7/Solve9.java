package day7;

import java.util.Scanner;

public class Solve9 {
	Node root;
	public static int DFS(int level, Node root) {
		if(root.lt == null && root.rt == null) {
			return level;
		} else {
			return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
		}
	}
	// 아래와 같은 이진트리에서 루트 노드 1에서 말단 노드까지의 길이중 가장 짧은 길이를구하는 것을 찾으시오
	public static void main(String[] args) {
		Solve9 tree = new Solve9();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.print(DFS(0, tree.root));
	}
}
