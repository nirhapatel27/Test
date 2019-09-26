package LeetCodeArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {

  public boolean isValid(String s) {
    List<Character> validString = new ArrayList<>();
    Map<Character, Character> parentheses = new HashMap<>();
    parentheses.put(')', '(');
    parentheses.put('}', '{');
    parentheses.put(']', '[');
    if(s.length() == 0) {
      return true;
    }
    if (parentheses.containsKey(s.charAt(0))) {
      return false;
    } else {
      for (int i = 0; i < s.length(); i++) {
        Character currChar = s.charAt(i);
        if (parentheses.containsValue(currChar)) {
          validString.add(currChar);
        } else if(validString.size() != 0){
          if(validString.get(validString.size()-1) != parentheses.get(currChar)) {
            return false;
          } else {
            validString.remove(validString.size() - 1);
          }
        } else {
          return false;
        }
      }
    }

    if(validString.size() == 0) {
      return true;
    }

    return false;
  }

}
