package graphs;

//import java.io.*;
import java.util.*;

//implementation of Graph in java using LinkedList
public class Graph {

	private int noOfVertices=0;
	private LinkedList<Integer> adj[];

	Graph(int v){
		noOfVertices=v;
		adj= new LinkedList[noOfVertices];
		for(int i=0;i<noOfVertices;i++){
			adj[i]= new LinkedList<Integer>();
		}
	}

	void addEdge(int v1, int v2){
		adj[v1].add(v2);
	}

	/*
	 * Breadth First Search using queues in java
	 */

	void bfs(int source){

		// a boolean array to keep track of visited nodes
		boolean visited[]= new boolean[noOfVertices];

		// a queue to print the nodes in FIFO order
		Queue<Integer> queue= new LinkedList<Integer>();

		// set the source node as visited in the visited array
		visited[source]=true;
		queue.add(source);

		while(queue.size() !=0){

			source= queue.poll();
			System.out.print(source + " ");

			Iterator<Integer> itr= adj[source].listIterator();
			while(itr.hasNext()){
				int nextnode= itr.next();
				if(!visited[nextnode]){
					visited[nextnode]= true;
					queue.add(nextnode);
				} 
			}	 
		}	

	}

	/*
	 * Depth First Search using queues in java
	 */

	void dfs(int source){

		// a boolean array to keep track of visited nodes
		boolean visited[]= new boolean[noOfVertices];

		// a stack to print the nodes in LIFO order
		Stack<Integer> stack= new Stack<Integer>();

		// push the source node to stack
		stack.push(source);
		
		loop: while(stack.size() !=0){
			source= stack.peek();
			if(!visited[source]){
				System.out.print(source + " ");	
				visited[source]=true;		
			}
			Iterator<Integer> itr= adj[source].listIterator();
			while(itr.hasNext()){
				int nextnode= itr.next();
				if(!visited[nextnode]){
					stack.push(nextnode);
					continue loop;
				} 
			}
			stack.pop();
			}
			
		}		

	public static void main(String args[]){

		//initialize a graph
		Graph graph= new Graph(7);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		System.out.println("The Breadth First Search Traversal of the graph is as follows:");
		graph.bfs(0);
		System.out.println("\nThe Depth First Search Traversal of the graph is as follows:");
		graph.dfs(0);


	}

}

