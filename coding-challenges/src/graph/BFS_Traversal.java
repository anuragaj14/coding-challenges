package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BFS_Traversal {

	public static void main(String[] args) {
		HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<Integer,ArrayList<Integer>> ();
		adjList.put(1, new ArrayList<Integer> (Arrays.asList(2,3)));
		adjList.put(2, new ArrayList<Integer> (Arrays.asList(4)));
		adjList.put(3, new ArrayList<Integer> (Arrays.asList(5)));
		adjList.put(4, new ArrayList<Integer> (Arrays.asList(6)));
		adjList.put(5, new ArrayList<Integer> ());
		adjList.put(6, new ArrayList<Integer> ());
		List<Integer> traversal = bfsTraversal(adjList,1);
		traversal.stream().forEach(System.out::println);
		System.out.println("DFS");
		traversal = dfsTraversal(adjList,1);
		traversal.stream().forEach(System.out::println);
	}
	
	public static List<Integer> bfsTraversal(HashMap<Integer,ArrayList<Integer>> adjList, int startingNode){
		
		List<Integer> traversal = new ArrayList<Integer> ();
		
		HashMap<Integer,Boolean> visited = new HashMap<Integer,Boolean> ();
		Queue<Integer> queue = new LinkedList<Integer> ();
		queue.add(startingNode);
		visited.put(startingNode, true);
		while(!queue.isEmpty()) {
			Integer node = queue.poll();
			System.out.println(node);
			visited.put(node, true);
			traversal.add(node);
			for(Integer i : adjList.get(node)) {
				if(!visited.containsKey(i)) {	
					System.out.println("Adj "+ i);
					queue.add(i);
				}
			}
		}
		return traversal;
		
	}
	
	public static List<Integer> dfsTraversal(HashMap<Integer,ArrayList<Integer>> adjList, int startingNode){
		List<Integer> traversal = new ArrayList<Integer> ();
		
		HashSet<Integer> visited = new HashSet<Integer> ();
		
		Stack<Integer> stack = new Stack<Integer> ();
		stack.add(startingNode);
		visited.add(startingNode);
		while(!stack.isEmpty()) {
			Integer node = stack.pop();
			  
			traversal.add(node);
			for(Integer i : adjList.get(node)) {
				if(!visited.contains(i)) {	
					visited.add(node);
					stack.add(i);
				}
			}
		}
		
		
		return traversal;
	}
}
