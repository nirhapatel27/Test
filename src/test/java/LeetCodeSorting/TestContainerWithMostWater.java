package LeetCodeSorting;

import org.junit.Test;

public class TestContainerWithMostWater {
  private ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

  @Test
  public void testMaxArea() {
    int arr[] = new int[]{1,8,6,2,5,4,8,3,7};
    System.out.println(containerWithMostWater.maxArea(arr));

  }
}
