//package LeetCodeRecursion;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class LetterCombination {
//
//  public List<String> letterCombinations(String digits) {
//    List<String> charCom = new ArrayList<>();
//    Map<Integer, String> numLetters = Map.of
//        (2, "abc", 3, "def", 4, "ghi",
//            5, "jkl", 6, "mno", 7, "pqrs", 8, "tuv", 9, "wxyz");
//
//    if(digits.length() == 1) {
//      for(int i = 0 ; i < numLetters.get(Integer.parseInt(digits)).length(); i++) {
//        charCom.add(Character.toString(numLetters.get(Integer.parseInt(digits)).charAt(i)));
//      }
//      return charCom;
//    }
//
//    for(int j = 0 ; j < numLetters.get(Integer.parseInt(digits.substring(0,1))).length(), j++) {
//      charCom.add(letterCombinations()
//    }
//    return charCom;
//  }
//
//}
