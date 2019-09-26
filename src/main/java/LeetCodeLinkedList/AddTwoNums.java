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
    ListNode l = new ListNode(2);
    l.next = l;
    System.out.println(l);
    return l;
  }
}
