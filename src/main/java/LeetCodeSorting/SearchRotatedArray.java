package LeetCodeSorting;

public class SearchRotatedArray {

  public int search(int[] nums, int target) {
    int mid = nums.length / 2;;
    int first = nums[0];
    int last = nums[nums.length - 1];
    boolean rotated = false;
    if(nums.length == 1) {
      if(nums[0] == target) {
        return 0;
      } else {
        return -1;
      }
    }
    if(nums.length == 2) {
      if(nums[0] == target) {
        return 0;
      } else if(nums[1] == target) {
        return 1;
      } else {
        return -1;
      }
    }
    return -1;
  }

  public int findRotateIndex(int[] nums) {
    int mid = nums.length / 2;
    int left = 0;
    int right = nums.length - 1;
    if(nums[0] <= nums[nums.length - 1]) {
      return 0;
    } else {
      while (left < right) {
        if(nums[mid] < nums[mid + 1]) {

          mid += mid/2;
        } else {

        }
      }
    }
    return 0;
  }
}
