
public class MergeBinaryTress {
	
	public static void main(String args[])
	{
		//Tree 1
		TreeNode t14= new TreeNode(4);
		TreeNode t15= new TreeNode(5);
		TreeNode t13= new TreeNode(3);
		TreeNode t12= new TreeNode(5);
		TreeNode t1= new TreeNode(6);
		t1.left= t12;
		t1.right=t13;
		t12.left= t14;
		t12.right=t15;
		
		//Tree 1
		TreeNode t32= new TreeNode(1);
		TreeNode t33= new TreeNode(4);
		TreeNode t31= new TreeNode(2);
		TreeNode t22= new TreeNode(6);
		TreeNode t21= new TreeNode(3);
		TreeNode t2= new TreeNode(5);
		t2.left= t21;
		t2.left= t22;
		t21.left=t31;
		t22.left= t32;
		t22.right=t33;
		
		t1= mergeTrees(t1,t2);
		System.out.println(t1.val);
	}
	
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2)
	{
		if(t1==null)
			return t2;
		if(t2== null)
			return t1;
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right= mergeTrees(t1.right, t2.right);
		return t1;
	}

}
 
class TreeNode
{
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) { val=x;}
	
}
