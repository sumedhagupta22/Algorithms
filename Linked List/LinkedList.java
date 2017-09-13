import java.util.*;
import java.lang.Integer;

public class LinkedList<Integer> implements Iterable<Integer> {
	
	
	/*******************************************************
	 *
	 *  The Node class
	 *
	********************************************************/
	private static class Node<Integer>{
		private int data;
		private Node<Integer> next;
		//constructor of Node class
		public Node(int d, Node<Integer> n){
			this.data=d;
			this.next=n;
		}
	}
	
	 /*******************************************************
	 *
	 *  The Iterator class
	 *
	 ********************************************************/

	   public Iterator<Integer> iterator()
	   {
	      return new LinkedListIterator();
	   }

	   private class LinkedListIterator  implements Iterator<Integer>
	   {
	      private Node<Integer> nextNode;

	      public LinkedListIterator()
	      {
	         nextNode = head;
	      }

	      public boolean hasNext()
	      {
	         return nextNode != null;
	      }

	      public Integer next()
	      {
	         if (!hasNext()) throw new NoSuchElementException();
	         Integer res = (Integer) java.lang.Integer.valueOf(nextNode.data);
	         nextNode = nextNode.next;
	         return res;
	      }

	      public void remove() { throw new UnsupportedOperationException(); }
	   }


	
	private Node<Integer> head;
	
	/* Linked list Operations
	 * */
	   public boolean isEmpty()
	   {
		   if(head == null)
			   return true;
		   else
			   return false;
	   }
	   
	public void addFirst(int n){
		
		head= new Node<Integer>(n,head);
		
	}
	
	public void traverse(){
		Node<Integer> tmp= head;
		while(tmp!=null){
			tmp= tmp.next;
		}
	}
	
	public void addLast(int n){
		if(head==null){
			addFirst(n);
		}
		else{
			Node<Integer> tmp= head;
			while(tmp!=null){
				tmp= tmp.next;
			}
			tmp.next= new Node<Integer>(n,null);
		}	
	}
	
	public void addAfter(int n, int key){	
			Node<Integer> tmp= head;
			while(tmp!=null && tmp.data!=key){
				tmp= tmp.next;
			}
			tmp.next= new Node<Integer>(n,tmp.next);	
	}
	
	public void addBefore(int n, int key){
		if(head==null){
			return;
		}
		if(head.data==key){
			addFirst(n);
		}
		Node<Integer> prev= null;
		Node<Integer> current= head;
		while(current!=null && current.data!=key){
				prev= current;
				current= current.next;
			}
		// insert between prev and current
		if(current != null){
			prev.next=new Node<Integer>(n,current);
		}	
	}
	
	public void delete(int key){
		if(head == null) throw new RuntimeException("cannot delete");

		   if( head.data== key)
		   {
		      head = head.next;
		      return;
		   }
		 Node<Integer> prev= null;
		 Node<Integer> current= head;
		 while(current!=null && current.data!=key){
				prev= current;
				current= current.next;
			}
		 if(current == null) throw new RuntimeException("cannot delete");
		 //delete current node
		  prev.next = current.next;
		   
	}
	
	public String toString()
	   {
	      StringBuffer result = new StringBuffer();
	      for(Object x : this)
	      	result.append(x + " ");

	      return result.toString();
	   }
	
	  /* Deep copy of a linked list in O(n^2) time
	   */
	   public LinkedList<Integer> deepcopy1()
	   {
	      LinkedList<Integer> copy = new LinkedList<Integer>();
	      Node<Integer> tmp = head;
	      while(tmp != null)
	      {
	    	 copy.addLast( tmp.data );
	         tmp = tmp.next;
	      }
	      return copy;
	   }
	   
	   public LinkedList<Integer> deepcopy2()
	   {
	      LinkedList<Integer> copy = new LinkedList<Integer>();
	      Node<Integer> tmp = head;
	      while(tmp != null)
	      {
	    	 copy.addFirst( tmp.data );
	         tmp = tmp.next;
	      }
	      return copy.reverse();
	   }
	   
	   public LinkedList<Integer> deepcopy3()
	   {
	      LinkedList<Integer> copy = new LinkedList<Integer>();
	      Node<Integer> tmp = head;
	      if(head==null) return null;
	      copy.head = new Node<Integer>(head.data, null);
	      Node<Integer> tmpTwin = copy.head;
	      while(tmp.next != null)
	      {
	         tmp = tmp.next;
	         tmpTwin.next = new Node<Integer>(tmp.data, null);
	         tmpTwin = tmpTwin.next;
	      }

	      return copy;
	   }
	   
	   public LinkedList<Integer> reverse()
	   {
	      LinkedList<Integer> list = new LinkedList<Integer>();
	      Node<Integer> tmp = head;
	      while(tmp != null)
	      {
	         list.addFirst( tmp.data );
	         tmp = tmp.next;
	      }
	      return list;
	   }
}
