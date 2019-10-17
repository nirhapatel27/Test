package LeetCodeArray;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.Test;

public class TestDuplicateNum {
  private DuplicateNum duplicateNum = new DuplicateNum();

  @Test
  public void testRemoveDuplicates() {
    int arr1[] = new int[]{1,3,5,0,0,0};
    int arr2[] = new int[]{2,5,6};
    List<String> words = ImmutableList.of("It was the best", "of times it was", "the worst of times");
    DuplicateNum.fullJustify(8, words);
  }
}
