package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter {

  public int firstUniqChar(String s) {
    Set<Character> listUnique = new LinkedHashSet<>();
    Set<Character> listRepeat = new LinkedHashSet<>();
    Map<Character, Integer> uniqueMap = new HashMap<>();
    for(int i = 0; i< s.length(); i++) {
      uniqueMap.put(s.charAt(i), i);
      if(!listUnique.contains(s.charAt(i)) && !listRepeat.contains(s.charAt(i))) {
          listUnique.add(s.charAt(i));
      } else if(listUnique.contains(s.charAt(i))) {
        listUnique.remove(s.charAt(i));
        listRepeat.add(s.charAt(i));
      }
    }
    if(!listUnique.isEmpty()) {
      return uniqueMap.get(listUnique.iterator().next());
    }
    else {
      return -1;
    }
  }

}
