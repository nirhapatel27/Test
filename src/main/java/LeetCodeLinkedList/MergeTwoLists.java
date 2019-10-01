package LeetCodeLinkedList;

import LeetCodeLinkedList.AddTwoNums.ListNode;

public class MergeTwoLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode curr = result;
    ListNode x = l1;
    ListNode y = l2;
    int xVal, yVal = 0;
    while (x != null || y != null) {
      xVal = x != null ? x.val : Integer.MAX_VALUE;
      yVal = y != null ? y.val : Integer.MAX_VALUE;
      if (xVal < yVal && x != null) {
        curr.next = x;
        x = x.next;
        curr = curr.next;
      } else if (y != null) {
        curr.next = y;
        y = y.next;
        curr = curr.next;
      }
    }
    return result.next;
  }
}
