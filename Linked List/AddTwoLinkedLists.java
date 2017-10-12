package linkedList;

/*
 * Created by Sumedha Gupta
 */

public class AddTwoLinkedLists {
	
	public static void main(String args[]){
		
		//Create two linkedlist
		
		 ListNode l3= new ListNode(3,null);
		 ListNode l2= new ListNode(4,l3);
		 ListNode l1= new ListNode(2,l2);
		 ListNode head= new ListNode(l1.val,l1.next);
		 
		 
		 ListNode l31= new ListNode(4,null);
		 ListNode l21= new ListNode(6,l31);
		 ListNode l11= new ListNode(5,l21);
		 ListNode head1= new ListNode(l11.val,l11.next);
		
		 //call the function
		 ListNode resultHead= addTwoLinkedList(head,head1);
		 
		 //print resulting linked list
		 while(resultHead!=null){
			 System.out.println(resultHead.val);
			 resultHead= resultHead.next;
		 }
	}
	
	public static ListNode addTwoLinkedList(ListNode head, ListNode head1){
		ListNode newHead = new ListNode(0,null);
		ListNode ptr1 = head, ptr2 = head1, result =newHead;
		int carry=0;
		
		/*
		 * loop till either of the linked lists has elements
		 */
		while(ptr1!=null || ptr2!=null){
			int x=0, y=0, sum=0;
			
			if(ptr1!=null){
				x = ptr1.val;
				ptr1=ptr1.next;
			}
			if(ptr2!=null){
				y= ptr2.val;
				ptr2=ptr2.next;
			}
			
			//add values along with the carry from previous addition(if any)
			sum= carry+x+y;
			
			//compute carry as the quotient of sum divide by 10
			carry= sum/10;
			
			//compute resulting value as the remainder of sum divide by 10
			result.next= new ListNode(sum%10,null);
			
			result=result.next;
		}
		
		//if any carry left create a new node 
		if(carry>0){
			result.next= new ListNode(carry,null);
		}
		
		return newHead.next;
	}

}
