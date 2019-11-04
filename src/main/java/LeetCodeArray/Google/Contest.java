package LeetCodeArray.Google;

import java.util.HashMap;
import java.util.Map;

public class Contest {

  public boolean validMountainArray(int[] A) {
    int i = 1;
    if(A[0] > A[1]) {
      return false;
    }
    while( i < A.length) {
      if(A[i] <= A[i-1]) {
        break;
      } else {
        i++;
      }
    }
    while(i < A.length) {
      if(A[i] >= A[i-1]) {
        break;
      } else {
        i++;
      }
    }
    if(i == A.length) {
      return true;
    }
    return false;
  }

  public int expressiveWords(String S, String[] words) {
    Map<Character, Integer> sMap = new HashMap<>();
    boolean isStretched = false;
    int count = 0;
    for (int i = 0; i < S.length(); i++) {
      sMap.put(S.charAt(i), sMap.getOrDefault(S.charAt(i), 0) + 1);
    }
    for (int i = 0; i < words.length; i++) {
      Map<Character, Integer> currMap = new HashMap<>();
      for (int j = 0; j < words[i].length(); j++) {
        currMap.put(words[i].charAt(j), currMap.getOrDefault(words[i].charAt(j), 0) + 1);
      }
      if (sMap.size() == currMap.size()) {
        for (Map.Entry<Character, Integer> entry : currMap.entrySet()) {
          if ((!sMap.containsKey(entry.getKey()))
              || sMap.get(entry.getKey()) != (entry.getValue()) && sMap.get(entry.getKey()) < 3) {
            isStretched = true;
          }
          if (sMap.get(entry.getKey()) != 0 && sMap.get(entry.getKey()) < (entry.getValue())) {
            isStretched = true;
          }
        }
        if (!isStretched) {
          count++;
        }
      }
    }
    return count;
  }

}
