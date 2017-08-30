
 //Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x, ListNode l) { val = x; next=l;}
  }

   public class DeleteNodeFromList {
	
	 public void removeNthFromEnd(ListNode head, int n) {
		 	ListNode start = new ListNode(0,null);
		    ListNode slow = start, fast = start;
		    slow.next = head;
		    
		    //Move fast in front so that the gap between slow and fast becomes n
		    for(int i=1; i<=n+1; i++)   {
		        fast = fast.next;
		    }
		    //Move fast to the end, maintaining the gap
		    while(fast != null) {
		    	//System.out.println(slow.val);
		        slow = slow.next;
		        //System.out.println(fast.val);
		        fast = fast.next;
		    }
		    //Skip the desired node
		    slow.next = slow.next.next;
	        
	    }
	 
	 public static void main(String args[]){
		 ListNode l4= new ListNode(5,null);
		 ListNode l3= new ListNode(3,l4);
		 ListNode l2= new ListNode(2,l3);
		 ListNode l1= new ListNode(1,l2);
		 ListNode head= new ListNode(l1.val,l1.next);
		 DeleteNodeFromList d= new DeleteNodeFromList();
		 d.removeNthFromEnd(head, 2);
	 }
}
