package LeetCode;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Set<Multiset<Integer>> resultSet = new HashSet<>();
    List<Integer> num = new ArrayList<>();
    num.addAll(Ints.asList(nums));
    for(int i = 0; i < num.size(); i++) {
      int firstFixed = num.get(i);
      num.remove(i);
      for(int j = i; j < num.size(); j++) {
        int secondFixed = num.get(j);
        num.remove(j);
        int remaining = target - firstFixed - secondFixed;
        for(int k = 0; k < num.size(); k++) {
          int check1 = num.get(k);
          int check2 = remaining - check1;
          if(num.contains(check1)) {
            num.remove(k);
            if (num.contains(check2)) {
              Multiset<Integer> fourSumSet = HashMultiset.create();
              fourSumSet.add(check1);
              fourSumSet.add(check2);
              fourSumSet.add(firstFixed);
              fourSumSet.add(secondFixed);
              if (!resultSet.contains(fourSumSet)) {
                resultSet.add(fourSumSet);
                List<Integer> fourSumFound = ImmutableList
                    .of(firstFixed, secondFixed, check1, check2);
                result.add(fourSumFound);
              }
            }
            num.add(check1);
          }
        }
        num.add(secondFixed);
      }
      num.add(firstFixed);
    }
    return result;
  }

}
