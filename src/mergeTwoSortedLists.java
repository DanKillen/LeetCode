public class mergeTwoSortedLists
{

   public static void main(String args[])
   {
      ListNode list1 = new ListNode(1, new ListNode (2, new ListNode(4)));
      ListNode list2 = new ListNode(1, new ListNode (3, new ListNode(4)));
      System.out.println(mergeTwoLists(list1, list2));
   }
   public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode headNode = new ListNode();
      if (list1 == null)
         return list2;
      if (list2 == null)
         return list1;
      if (list1.val <= list2.val)
      {
         headNode.val = list1.val;
         if (list1.next != null)
         {
            list1 = list1.next;
         }
         else
         {
            headNode.next = list2;
            return headNode;
         }
      }
      else
      {
         headNode.val = list2.val;
         if (list2.next != null)
         {
            list2 = list2.next;
         }
         else
         {
            headNode.next = list1;
            return headNode;
         }
      }
      headNode = new ListNode(headNode.val, addNextValue(list1, list2));
      return headNode;
   }

   public static ListNode addNextValue(ListNode list1, ListNode list2)
   {
      ListNode nextNode = new ListNode();
      if (list1.val <= list2.val)
      {
         nextNode.val = list1.val;
         if (list1.next == null)
         {
            nextNode.next = list2;
            return nextNode;
         }
         list1 = list1.next;
      }
      else
      {
         nextNode.val = list2.val;
         if (list2.next == null)
         {
            nextNode.next = list1;
            return nextNode;
         }
         list2 = list2.next;
      }
      return new ListNode(nextNode.val, addNextValue(list1,list2));
   }
}
