package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class TestFirstUniqueCharacter {
  private FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();

  @Test
  public void testFirstUniqChar() {
    Assert.assertEquals(0,firstUniqueCharacter.firstUniqChar("leetcode"));
  }

}
