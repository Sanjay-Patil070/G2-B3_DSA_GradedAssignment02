package driver_2;

import service_2.BinarySearchTree;
import service_2.RightSkewedTree;

public class DriverClass {
	public static void main(String[] args) {
		System.out.println("Binary search tree into Skewed Tree");
		System.out.println("output as follows");
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(10);
		tree.insert(55);

		RightSkewedTree rst = new RightSkewedTree();
		rst.flattenBTToSkewed(tree.root);
		rst.print();
	}

}
