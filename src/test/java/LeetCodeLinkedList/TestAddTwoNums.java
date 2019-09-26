package LeetCodeLinkedList;

import LeetCodeLinkedList.AddTwoNums.ListNode;
import org.junit.Test;

public class TestAddTwoNums {

  private AddTwoNums addTwoNums = new AddTwoNums();

  @Test
  public void testAddTwoNums() {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(2);
    addTwoNums.addTwoNumbers(l1,l2);
  }

}
