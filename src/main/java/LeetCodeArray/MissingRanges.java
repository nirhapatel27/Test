package LeetCodeArray;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

  public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> result = new ArrayList<>();
    if(nums.length == 0) {
      if(upper - lower == 0) {
        result.add(Integer.toString(lower));
      } else {
        result.add(lower + "->" + upper);
      }
      return result;
    }
    String currRange = "";
    if(nums[0] != lower) {
      if((nums[0] - lower) == 1) {
         currRange = Integer.toString(lower);
      } else {
        currRange = lower + "->" + (nums[0]-1);
      }
      result.add(currRange);
    }
    for(int i = 0 ; i < nums.length-1; i++) {
      if((long)nums[i+1] - nums[i] == 2) {
        result.add(Integer.toString(nums[i] +1));
      } else if((long)nums[i+1] - nums[i] > 2) {
        currRange = (nums[i] + 1) + "->" + (nums[i+1] - 1);
        result.add(currRange);
      }
    }

    if(nums[nums.length-1] != upper) {
      if((upper - nums[nums.length-1]) == 1) {
        currRange = Integer.toString(upper);
      } else {
        currRange = (nums[nums.length-1]+1) + "->" + upper;
      }
      result.add(currRange);
    }

    return result;
  }

}
