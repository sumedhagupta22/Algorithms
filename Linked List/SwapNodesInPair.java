public class SwapNodesInPair
{

    public static void main(String args[])
    {

        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        head.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode swapHead = swapPairs(head);
        while(swapHead != null)
        {
            System.out.println(swapHead.val);
            swapHead = swapHead.next;
        }
    }

    public static ListNode swapPairs(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode second = head.next;
        ListNode third = head.next.next;
        head.next = swapPairs(third);
        second.next = head;
        return second;
    }
}

//Definition for singly-linked list.
class ListNode
{
    int      val;
    ListNode next;

    ListNode(int x) { val = x; }
}
