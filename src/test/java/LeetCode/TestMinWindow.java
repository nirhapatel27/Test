package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class TestMinWindow {

  private MinWindow minWindow = new MinWindow();

  @Test
  public void testMinWindow() {
    String ans = minWindow.minWindow("ADOBECODEBANC", "ABC");
    Assert.assertEquals(ans, "BANC");
  }
}
