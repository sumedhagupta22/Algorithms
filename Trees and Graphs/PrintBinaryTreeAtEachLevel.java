package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTreeAtEachLevel {

	/*
	 * http://www.geeksforgeeks.org/print-level-order-traversal-line-line/
	 */

	public static void main(String args[]){

		BinaryTree bTree= new BinaryTree();
		bTree.root = new TreeNode(1);
		bTree.root.left = new TreeNode(2);
		bTree.root.right = new TreeNode(3);
		bTree.root.left.left = new TreeNode(4);
		bTree.root.left.right = new TreeNode(5);
		bTree.root.right.right = new TreeNode(6);
		printTree(bTree.root);
	}

	public static void printTree(TreeNode root){

		if(root==null)
			return;

		// queue(FIFO) to perform BFS 
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.add(root);
		while(true)	
		{

			int nodesInQueue= q.size();

			if(nodesInQueue==0)
				break;
			while(nodesInQueue>0){

				TreeNode temp= q.poll();
				System.out.print(temp.val + " ");
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				nodesInQueue--;
			}
			System.out.println();
		}

	}
}