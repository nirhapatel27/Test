package LeetCodeArray;

import org.junit.Test;

public class TestMajorityElement {

  private MajorityElement majorityElement = new MajorityElement();

  @Test
  public void testMajorityElement() {
    int nums[] = new int[]{1,1,1,3,3,2,2,2};
    System.out.println(majorityElement.majorityElement(nums));
  }
}
