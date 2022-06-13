package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://workat.tech/problem-solving/practice/left-view-binary-tree

public class RightViewOfBinaryTree {
	int[] leftView(Node root) {
    	// add your logic here
		
		List<Integer> traversal = new ArrayList<Integer>();
		Queue<Node> queue = new LinkedList<Node> ();
		queue.add(root);
		while(!queue.isEmpty()) {
			

			int size = queue.size();
			for(int j =0;j<size;j++) {
				
				Node temp = queue.poll();
				if(j==0) {
					traversal.add(temp.data);
				}
				if(temp.left!= null) {
					queue.add(temp.left);
				}
				if(temp.right!= null) {
					queue.add(temp.right);
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
