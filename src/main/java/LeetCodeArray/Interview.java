package LeetCodeArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Interview {

  public List<Integer> getMinimumDifference(List<String> a, List<String> b) {
    List<Integer> result = new ArrayList<>();
    for (int k = 0; k < a.size(); k++) {
      int diff = 0;
      Map<Character, Integer> aChars = new HashMap<>();
      if (a.get(k).length() != b.get(k).length()) {
        result.add(-1);
      } else {
        for (int i = 0; i < a.get(k).length(); i++) {
          if (!aChars.containsKey(a.get(k).charAt(i))) {
            aChars.put(a.get(k).charAt(i), 1);
          } else {
            int updatedVal = aChars.get(a.get(k).charAt(i)) + 1;
            aChars.put(a.get(k).charAt(i), updatedVal);
          }
        }
        for (int j = 0; j < b.get(k).length(); j++) {
          if (aChars.containsKey(b.get(k).charAt(j))) {
            int decreasedVal = aChars.get(b.get(k).charAt(j)) - 1;
            if (decreasedVal == 0) {
              aChars.remove(b.get(k).charAt(j));
            } else {
              aChars.put(b.get(k).charAt(j), decreasedVal);
            }
          }
        }

        for (int val : aChars.values()) {
          diff += val;
        }
        System.out.println(diff);
        result.add(diff);
      }
    }

    return result;
  }

  public static String winner(List<Integer> andrea, List<Integer> maria, String s) {
    int j = 0;
    int and = 0;
    int i = 0;
    int numCards = andrea.size();
    if(s.equals("Odd")) {
      j = 1;
    }
    while ((2*i+j) < numCards) {
      and += andrea.get(2*i+j) - maria.get(2*i+j);
      i++;
    }
    if(and == 0) {
      return "Tie";
    } else if (and > 0) {
      return "Andrea";
    } else {
      return "Maria";
    }
  }

  public static long countMax(List<String> upRight) {
    long cMin = 1000000;
    long rMin = 1000000;
    for(int i = 0 ; i < upRight.size(); i++) {
      String[] cAndR = upRight.get(i).split(" ", 2);
      long c = Integer.parseInt(cAndR[0]);
      if(c < cMin) {
        cMin = c;
      }
      long r = Integer.parseInt(cAndR[1]);
      if(r < rMin) {
        rMin = r;
      }
    }
    return rMin*cMin;
  }

//  public static int getMinimumUniqueSum(List<Integer> arr) {
//    Set<Integer> arrSet = new HashSet<>();
//    for(int i = 0; i < arr.size(); i++) {
//      if(!arrSet.contains(arr.get(i))) {
//        arrSet.add(arr.get(i));
//      } else {
//        int updateVal = arr.get(i)+1;
//        arr.set(i, updateVal);
//        i--;
//      }
//    }
//    int sum = 0;
//    for(int j : arrSet) {
//      sum += j;
//    }
//    return sum;
//  }

  public int getMinimumUniqueSum(List<Integer> arr) {
    TreeMap<Integer, Integer> sortedKey = new TreeMap<>();
    for (int i = 0; i < arr.size(); i++) {
      if (!sortedKey.containsKey(arr.get(i))) {
        sortedKey.put(arr.get(i), 1);
      } else {
        int val = sortedKey.get(arr.get(i)) + 1;
        sortedKey.put(arr.get(i), val);
      }
    }

    int sum = 0;
    int needed = 0;
    for (int j = sortedKey.firstKey(); j <= sortedKey.lastKey(); j++) {
      if (sortedKey.containsKey(j)) {
        needed += sortedKey.get(j) - 1;
        sum += j;
      } else if (needed > 0) {
        needed--;
        sum += j;
      }
    }

    for (int k = 1; k <= needed; k++) {
      sum += sortedKey.lastKey() + k;
    }
    System.out.println(sum);
    return sum;
  }
}
