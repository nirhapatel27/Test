package LeetCodeSorting;

public class FindPeekIndex {

  public int findPeakElement(int[] nums) {
    int hi = nums.length - 1;
    int lo = 0;
    int mid = 0;
    if (nums.length < 2) {
      return 0;
    }
    if (nums.length == 2) {
      if (nums[0] > nums[1]) {
        return 0;
      }
      return 1;
    }
    if (nums[0] > nums[1]) {
      return 0;
    }
    while (lo < hi - 1) {
      mid = (hi + lo) / 2;
      if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
        lo = mid + 1;
      } else if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
        return mid;
      } else if (nums[mid] < nums[mid - 1]) {
        hi = mid - 1;
      }
    }
    if (nums[lo] > nums[hi]) {
      return lo;
    }
    return hi;
  }
}
