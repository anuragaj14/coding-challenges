package binaryTree;

import java.util.ArrayList;
import java.util.List;
//https://workat.tech/problem-solving/practice/binary-tree-inorder-traversal
class Node {
	public Node left;
    public Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}
public class BinaryTreeInorder {
	List<Integer> getInorderTraversal(Node root) {
    	// add your logic here
		List<Integer> list = new ArrayList<Integer> () ;
		return inOrder(root,list);
		


	}
	List<Integer> inOrder(Node root, List<Integer> list ) {
		
		if(root!=null) {
			inOrder(root.left,list);
			list.add(root.data);
			inOrder(root.right,list);
		}
		return list;
	}
}
