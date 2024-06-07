/**
 * Created by Daniel Killen on 27/05/2024
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 * An integer x.
 * Record a new score of x.
 * '+'.
 * Record a new score that is the sum of the previous two scores.
 * 'D'.
 * Record a new score that is the double of the previous score.
 * 'C'.
 * Invalidate the previous score, removing it from the record.
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
      System.out.println(reverseList(listNode1));
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
      return listNodes.getLast();
   }
}
