package LeetCodeArray;

import org.junit.Test;

public class TestPlusOne {

  private PlusOne plusOne = new PlusOne();

  @Test
  public void testPlusOne() {
    int arr[] = new int[]{9,9,9};
    int result[] = (plusOne.plusOne(arr));
    for(int i : result) {
      System.out.println(i);
    }
  }

}
