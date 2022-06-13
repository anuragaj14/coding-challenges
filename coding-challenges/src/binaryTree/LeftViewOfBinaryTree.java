package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://workat.tech/problem-solving/practice/right-view-binary-tree

public class LeftViewOfBinaryTree {
	int[] rightView(Node root) {
    	// add your logic here
		
		List<Integer> traversal = new ArrayList<Integer>();
		Queue<Node> queue = new LinkedList<Node> ();
		queue.add(root);
		while(!queue.isEmpty()) {
			

			int size = queue.size();
			for(int j =0;j<size;j++) {
				
				Node temp = queue.poll();
				if(temp.left!= null) {
					queue.add(temp.left);
				}
				if(temp.right!= null) {
					queue.add(temp.right);
				}
				if(j==size-1) {
					traversal.add(temp.data);
				}
			}

		
		}
		return traversal.stream().mapToInt(i->i).toArray();
		
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
