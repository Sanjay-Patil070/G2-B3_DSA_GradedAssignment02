package service_2;

class Node {

	int data;
	Node left, right;

	public Node(int val) {
		data = val;
		left = right = null;
	}
}

public class BinarySearchTree {
	public Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	public Node insertRec(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
	}

}

