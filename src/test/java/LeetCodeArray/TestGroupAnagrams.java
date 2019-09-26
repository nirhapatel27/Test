package LeetCodeArray;

import org.junit.Test;

public class TestGroupAnagrams {
  private GroupAnagrams groupAnagrams = new GroupAnagrams();

  @Test
  public void testMapWordToSet() {
    String words[] = new String[]{"ate", "eat", "bat", "boo", "bob"};
    System.out.println(groupAnagrams.groupAnagrams(words));
  }

}
