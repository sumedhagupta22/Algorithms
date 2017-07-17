import java.util.*;
public class AverageTreeLevels {
	
	public static void main(String args[]){
			//Tree 1
			TreeNode t14= new TreeNode(3);
			TreeNode t15= new TreeNode(5);
			TreeNode t16= new TreeNode(7);
			TreeNode t13= new TreeNode(6);
			TreeNode t12= new TreeNode(2);
			TreeNode t1= new TreeNode(4);
			t1.left=t12;
			t1.right=t13;
			t12.left= t14;
			t12.right=t15;
			t13.right=t16;
			List<Double> res= new ArrayList<Double>();
			res= average(t1);
			for(double d: res){
				System.out.println(d);
			}
	}
	
	public static List<Double> average(TreeNode root){		
		List<Double> res= new ArrayList<Double>();
		Queue < TreeNode > queue = new LinkedList < > ();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0, count = 0;
            Queue < TreeNode > temp = new LinkedList < > ();
            while (!queue.isEmpty()) {
        		TreeNode n= queue.remove();
        		sum+=n.val;
        		count++;
        		if(n.left!=null)
        			temp.add(n.left);
        		if(n.right!=null)
        			temp.add(n.right);
            	}  
            queue=temp;
            res.add(sum*1.0/count);
        }
		return res;
	}
}

class TreeNode
{
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) { val=x;}
	
}