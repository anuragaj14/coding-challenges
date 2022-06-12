package binaryTree;
//https://workat.tech/problem-solving/practice/balanced-binary-tree
public class BalancedBinaryTree {
	class Node {
		public Node left;
		public Node right;
		public int data;

		public Node(int data) {
			this.data = data;
		}
	}
	
	
	boolean isBinaryTreeBalanced(Node root) {
	    // add your logic here
		if(root == null) {
			return true;
		} else {
			int ldepth = heightOfBinaryTree(root.left);
			int rdepth = heightOfBinaryTree(root.right);
			
			if(Math.abs(ldepth-rdepth) <= 1 && isBinaryTreeBalanced(root.left) && isBinaryTreeBalanced(root.right)){
				return true;
			}
			
			return false;
		}
		
	}
	
	int heightOfBinaryTree(Node root) {
		if(root == null) {
			return 0;
		} else {
			return 1+Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right));
		}
	}
}
