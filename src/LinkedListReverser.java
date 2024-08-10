/**
 * Created by Daniel Killen on 07/06/2024
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 **/

import java.util.ArrayList;
import java.util.List;

public class LinkedListReverser
{

   public static void main(String[] args)
   {
      ListNode listNode5 = new ListNode(5);
      ListNode listNode4 = new ListNode(4, listNode5);
      ListNode listNode3 = new ListNode(3, listNode4);
      ListNode listNode2 = new ListNode(2, listNode3);
      ListNode listNode1 = new ListNode(1, listNode2);
      System.out.println(reverseListRecursion(listNode1));
   }

   public static ListNode reverseList(ListNode head) {
      if (head == null || head.next == null)
      {
         return head;
      }
      List<ListNode> listNodes = new ArrayList<>();
      ListNode traversalNode = head;
      listNodes.add(traversalNode);
      while (traversalNode.next != null)
      {
         traversalNode = traversalNode.next;
         listNodes.add(traversalNode);
      }
      for (int i = listNodes.size() - 1; i > 0; i--)
      {
         traversalNode.next = listNodes.get(i - 1);
         traversalNode = listNodes.get(i - 1);
      }
      traversalNode.next = null;
      return listNodes.get(listNodes.size() - 1);
   }

   public static ListNode reverseListRecursion(ListNode head) {
      if(head == null || head.next == null) return head;
      ListNode prev = null;
      ListNode h2 = reverseList(head.next);
      head.next.next = head;
      head.next=prev;
      return h2;
   }
}
