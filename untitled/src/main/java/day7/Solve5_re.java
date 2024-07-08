package day7;

public class Solve5_re {
	// 아래와 같은 이진트리를 전위순회 중위순회 후위순회 만들어보시오
	//  1
	// 2  3
	//4 5 6 7

	// 전위순회 : 부모 - 왼쪽자식 - 오른쪽자식
	// 중위순회 : 왼쪽자식 - 부모 - 오른쪽 자식
	// 후위순회 : 왼쪽자식 - 오른쪽자식 - 부모
	Node root;
	public static void DFS(Node root) {
		if(root == null) {
			return;
		} else {
			System.out.print(root.data + " ");
			DFS(root.lt);
			// System.out.println("중위순회 : " + root.data + " ");
			DFS(root.rt);
			// System.out.println("후위순회 : " + root.data + " ");
		}
	}

	public static void main(String[] args) {
		Solve5_re tree = new Solve5_re();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

}
