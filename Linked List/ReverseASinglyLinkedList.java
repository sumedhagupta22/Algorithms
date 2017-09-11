package linkedList;

/**
 * Definition for singly-linked list.
  	class ListNodes {
     int val;
     ListNodes next;
     ListNodes(int x,ListNodes n) { val = x; next=n; }
  }*/
 

public class ReverseASinglyLinkedList {
	
	    public ListNode reverseList(ListNode head) {
	    	ListNode next= head;
	    	ListNode prev= null;
	    	while(next!=null){ 
	    		ListNode temp= next.next;
	    		next.next= prev;
	    		prev= next;
	    		next= temp;	    			
	    	}
	  	    return prev;
	    	
	        
	}
	    
	    public static ListNode reverseListRecursively(ListNode head, ListNode previous) {
	    	
	    	if(head==null){ 
	    		return previous;
	    	}
	    	ListNode next= head.next;
	    	head.next= previous;
	    	return reverseListRecursively(next,head);
       
	}
	    
	     public static void main(String args[]){
			 ListNode l4= new ListNode(5,null);
			 ListNode l3= new ListNode(3,l4);
			 ListNode l2= new ListNode(2,l3);
			 ListNode l1= new ListNode(1,l2);
			 ListNode head= new ListNode(l1.val,l1.next);
			 ReverseASinglyLinkedList d= new ReverseASinglyLinkedList();
			 ListNode n1= d.reverseList(head);
			 System.out.println(n1.val);
			 ListNode n2= d.reverseListRecursively(head,null);
			 System.out.println(n2.val);
		 }

}
