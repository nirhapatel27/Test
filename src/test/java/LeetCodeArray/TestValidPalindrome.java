package LeetCodeArray;

import org.junit.Assert;
import org.junit.Test;

public class TestValidPalindrome {

  private ValidPalindrome validPalindrome = new ValidPalindrome();

  @Test
  public void testValidPalindrome() {
    Assert.assertTrue(validPalindrome.validPalindrome("A man, a plan, a canal: Panama"));
    Assert.assertFalse(validPalindrome.validPalindrome("aBcdbA"));
  }
}
