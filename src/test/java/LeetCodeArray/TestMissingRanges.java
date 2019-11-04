package LeetCodeArray;

import org.junit.Test;

public class TestMissingRanges {

  private MissingRanges missingRanges = new MissingRanges();

  @Test
  public void testFindMissingRanges() {
    int arr[] = new int[]{-2147483647, 2147483646};
    System.out.println(missingRanges.findMissingRanges(arr,-2147483648 , 2147483647));

  }

  @Test
  public void test() {

  }
}
