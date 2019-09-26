package LeetCodeArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

  public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();
    Map<Integer, Integer> elementToCount = new HashMap<>();
    for(int num : nums) {
      if(elementToCount.containsKey(num)) {
        elementToCount.put(num, elementToCount.get(num) + 1);
      }
      else {
        elementToCount.put(num, 1);
      }
    }
    for(Entry<Integer, Integer> entry: elementToCount.entrySet()) {
      if(entry.getValue() > (nums.length/3)) {
        result.add(entry.getKey());
      }
    }
    return result;
  }

}
