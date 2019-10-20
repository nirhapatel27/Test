package LeetCodeArray;

import org.junit.Test;

public class TestMoveZeroes {

  private MoveZeroes moveZeroes = new MoveZeroes();

  @Test
  public void testLengthOfLongestSubstringKDistinct() {
    int nums[] = new int[]{-1,-1,1};
    System.out.println(moveZeroes.subarraySum(nums, 0));
  }

}
