package binaryTree;
//https://workat.tech/problem-solving/practice/maximum-depth-of-binary-tree
public class MaximumDepthOfTree {


class Node {
	public Node left;
    public Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}
	int getMaxDepth(Node root) {
    	// add your logic here
		if(root == null) {
			return 0;
		} 
		int ldepth= getMaxDepth(root.left);
		int rdepth= getMaxDepth(root.right);
		return Math.max(ldepth,rdepth)+1;
			
	}
	
}
