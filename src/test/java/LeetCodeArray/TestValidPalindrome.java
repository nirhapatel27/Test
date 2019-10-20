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

  @Test
  public void testValidPalindromeTwo() {
    System.out.println(validPalindrome.validPalindromeTwo("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    System.out.println(validPalindrome.validPalindromeTwo("cupuuffuupucu"));
    String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
//    System.out.println(s.charAt(21) + " " + s.charAt(80) + " " + s.charAt(19) + " "+ s.charAt(81));
  }
}
