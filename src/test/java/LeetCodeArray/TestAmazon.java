package LeetCodeArray;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestAmazon {

  private Amazon amazon = new Amazon();

  @Test
  public void test() {
    List<Integer> list = new ArrayList<>();
    list.add(30);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(19);
    list.add(89);

    amazon.addStrings("12345678901234567890", "12");

  }

}
