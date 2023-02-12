package service_2;

public class RightSkewedTree {
	
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	public void flattenBTToSkewed(Node root) {

		if (root == null) {
			return;
		}

		flattenBTToSkewed(root.left);

		Node rightNode = root.right;
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		flattenBTToSkewed(rightNode);

	}
	public void print() {
		
		traverseRightSkewed(headNode);
	}
	public void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);
	}

}
