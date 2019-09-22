package LeetCode;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestTrappingRainWater {
  private TrappingRainWater trappingRainWater = new TrappingRainWater();

  @Test
  public void testSpiralOrder() {
    int intArray[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    List<Integer> expected = ImmutableList.of(1,2,3,6,9,12,11,10,7,4,5,8);
    Assert.assertEquals(expected, trappingRainWater.spiralOrder(intArray));
  }
}
