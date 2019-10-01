package LeetCodeLinkedList;

import LeetCodeLinkedList.AddTwoNums.ListNode;
import org.junit.Test;

public class TestReverseLinkedList {

  private ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

  @Test
  public void testReverseLinkedList() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(5);
    l1.next = l2;
    l2.next = l3;
    l3.next = null;
    ListNode r = reverseLinkedList.reverseList(l1);
    while (r != null) {
      System.out.println(r.val);
      r = r.next;
    }
  }

}
