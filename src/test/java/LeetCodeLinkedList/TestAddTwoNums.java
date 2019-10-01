package LeetCodeLinkedList;

import LeetCodeLinkedList.AddTwoNums.ListNode;
import org.junit.Test;

public class TestAddTwoNums {

  private AddTwoNums addTwoNums = new AddTwoNums();

  @Test
  public void testAddTwoNums() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
//    ListNode l3 = new ListNode(4);
    ListNode l4 = new ListNode(5);
    ListNode l5 = new ListNode(8);
//    ListNode l6 = new ListNode(6);
    l1.next = l2;
//    l2.next = l3;
    l4.next = l5;
//    l5.next = l6;

    ListNode t1 = new ListNode(6);
    ListNode t2 = new ListNode(0);
    ListNode t3 = new ListNode(1);
    t1.next = t2;
    t2.next = t3;
    ListNode r = addTwoNums.addTwoNumbers(l1,l4);
    while (r != null) {
      System.out.println(r.val);
      r = r.next;
    }
//    Assert.assertEquals(t1, addTwoNums.addTwoNumbers(l1,l4));
  }

}
