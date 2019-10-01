package LeetCodeLinkedList;

public class AddTwoNums {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode x = l1;
    ListNode y = l2;
    int sum, carry = 0;
    ListNode result = new ListNode(0);
    ListNode curr = result;
    while(x != null || y != null) {
      int xVal = (x != null) ? x.val : 0;
      int yVal = (y != null) ? y.val : 0;
      sum = xVal + yVal + carry;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if(x != null) {
        x = x.next;
      }
      if(y != null) {
        y = y.next;
      }
    }
    if(carry > 0) {
      curr.next = new ListNode(carry);
    }
    return result.next;
  }
}
