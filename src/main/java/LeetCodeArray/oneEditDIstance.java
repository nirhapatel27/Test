package LeetCodeArray;

import java.util.HashMap;
import java.util.Map;

public class oneEditDIstance {

  public boolean isOneEditDistance(String s, String t) {
    boolean result = false;
    int total = 0;
    Map<Character, Integer> stringMap = new HashMap<>();
    for(int i = 0 ; i < s.length(); i++) {
      stringMap.putIfAbsent(s.charAt(i), 0);
      stringMap.put(s.charAt(i), stringMap.get(s.charAt(i)) + 1);
    }
    for(int j = 0 ; j < t.length(); j++) {
      char currChar = t.charAt(j);
      if(stringMap.containsKey(currChar)) {
        if(stringMap.get(currChar) == 1) {
          stringMap.remove(currChar);
        } else {
          stringMap.put(currChar, stringMap.get(currChar) - 1);
        }
      }
      System.out.println(stringMap);
    }
    for(int values : stringMap.values()) {
      total += values;
    }
    if((total == 1 && s.length() == t.length()) || (total == 0 && s.length() == t.length() - 1) || (total == 1 && s.length() -1 == t.length())) {
      result = true;
    }
    return result;
  }

}
