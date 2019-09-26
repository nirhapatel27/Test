package LeetCodeArray;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class Test {
  private Interview interview = new Interview();

  @org.junit.Test
  public void test1() {
    List<String> result1 = ImmutableList.of("a", "jk", "abb", "mn");
    List<String> result2 = ImmutableList.of("bb", "kj", "bbc", "op");
    List<Integer> list = ImmutableList.of(1,3,3,3,4,5,7,7);
    interview.getMinimumUniqueSum(list);
  }
}
