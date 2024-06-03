/**
 * Created by Daniel Killen on 04/05/2024
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 **/

public class ListNode
{
   int val;
   ListNode next;

   ListNode()
   {
   }

   ListNode(int val)
   {
      this.val = val;
   }

   ListNode(int val, ListNode next)
   {
      this.val = val;
      this.next = next;
   }
}
