package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	List<Integer> getLevelOrderTraversal(Node root) {
    	// add your logic here
		
		List<Integer> traversal = new ArrayList<Integer>();
		Queue<Node> queue = new LinkedList<Node> ();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			traversal.add(temp.data);
			if(temp.left!= null) {
				queue.add(temp.left);
			}
			if(temp.right!= null) {
				queue.add(temp.right);
			}
		
		}
		return traversal;
		
	}
	class Node {
		public Node left;
	    public Node right;
	    int data;

	    Node(int data) {
	        this.data = data;
	    }
	}
}
