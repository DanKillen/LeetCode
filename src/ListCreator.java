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

public class ListCreator
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
