package LeetCodeArray;

public class SubarraySum {
  public int subarraySum(int[] nums, int k) {
    int numArrays = 0;
    int currSum = 0;
    for(int i = 0 ; i < nums.length; i++) {
      if(currSum < k) {
        currSum += nums[i];
      }
    }
    return numArrays;
  }
}
