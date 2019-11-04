package LeetCodeArray.Google;

import org.junit.Test;

public class TestGoogle {

  private Contest contest = new Contest();
  @Test
  public void test() {
    String arr[] = new String[]{"hello", "hi", "helo"};
    System.out.println(contest.expressiveWords("heeellooo", arr));
  }
}
