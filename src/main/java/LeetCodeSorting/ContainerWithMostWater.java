package LeetCodeSorting;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int lo = 0;
    int hi = height.length-1;
    int area = 0;
    while(lo < hi) {
      int currArea = (hi - lo) * (Math.min(height[hi], height[lo]));
      area = Math.max(currArea, area);
      if(height[hi] < height[lo]) {
        hi--;
      } else {
        lo++;
      }
    }
    return area;
  }

}
