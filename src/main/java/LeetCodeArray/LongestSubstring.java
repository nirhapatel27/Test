package LeetCodeArray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
  public int lengthOfLongestSubstringTwoDistinct(String s) {
    int max = 0;
    int count = 1;
    Character currChar;
    int firstPointer = 0;
    int secondPointer = 1;
    Map<Character, Integer> map = new HashMap<>();
    map.put(s.charAt(firstPointer), 1);
   while(secondPointer < s.length()) {
      currChar = s.charAt(secondPointer);
      if(map.containsKey(currChar) || map.size() < 2) {
        map.put(currChar, map.getOrDefault(currChar, 0) + 1);
        count++;
        secondPointer++;
      } else {
        if(map.get(s.charAt(firstPointer)) == 1) {
          map.remove(s.charAt(firstPointer));
        } else {
          map.put(s.charAt(firstPointer), map.get(s.charAt(firstPointer))-1);
        }
        firstPointer++;
        max = Math.max(max, count);
        count--;
      }
    }
   max = Math.max(max, count);
   return max;
  }
}
