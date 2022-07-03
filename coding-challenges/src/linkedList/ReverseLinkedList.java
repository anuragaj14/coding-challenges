package linkedList;

import java.util.Stack;

public class ReverseLinkedList {
	void printLinkedListReverse (ListNode head) {
	    // add your logic here
		
		Stack<Integer> stack = new Stack<Integer>();
		while(head!=null) {
			stack.push(head.data);
			head = head.next;
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+ " ");
		}
	}
	class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

}
