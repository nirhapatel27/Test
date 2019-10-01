package LeetCodeLinkedList;

import LeetCodeLinkedList.AddTwoNums.ListNode;
import org.junit.Test;

public class TestMergeTwoLists {

  private MergeTwoLists mergeTwoLists = new MergeTwoLists();

  @Test
  public void test() {
    ListNode l1 = new ListNode(5);
    ListNode l2 = new ListNode(8);
    ListNode l4 = new ListNode(1);
    ListNode l5 = new ListNode(2);
    ListNode l6 = new ListNode(10);
    l1.next = l2;
    l4.next = l5;
    l5.next = l6;

    ListNode r = mergeTwoLists.mergeTwoLists(l1,l4);
    while (r != null) {
      System.out.println(r.val);
      r = r.next;
    }
  }
}
