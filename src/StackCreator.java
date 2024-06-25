/**
 * Created by Daniel Killen on 27/06/2024
 * Implement a last-in-first-out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 **/

public class StackCreator
{

   public static void main(String[] args)
   {
      testCase1();
      testCase2();
      testCase3();
   }

   public static void testCase1() {
      MyLinkedList obj = new MyLinkedList();
      obj.addAtHead(1);
      obj.addAtTail(3);
      obj.addAtIndex(1, 2);
      System.out.println(obj.get(1));
      obj.deleteAtIndex(1);
      System.out.println(obj.get(1));
   }

   public static void testCase2() {
      MyLinkedList obj = new MyLinkedList();

      obj.addAtHead(1);
      obj.deleteAtIndex(0);
   }

   public static void testCase3() {
      MyLinkedList obj = new MyLinkedList();

      obj.addAtHead(7);
      obj.addAtHead(2);
      obj.addAtHead(1);
      obj.addAtIndex(3, 0);
      obj.deleteAtIndex(2);
      obj.addAtHead(6);
      obj.addAtTail(4);
      System.out.println(obj.get(4));
      obj.addAtHead(4);
      obj.addAtIndex(5, 0);
      obj.addAtHead(6);
   }

}
