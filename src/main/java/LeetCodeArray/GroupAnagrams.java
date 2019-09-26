package LeetCodeArray;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>(mapWordToSet(strs).keySet());
    return result;
  }

  public Multiset<Character> convertStringToSet(String word) {

    Multiset<Character> setWord = HashMultiset.create();
    for(int i = 0; i < word.length(); i++) {
      setWord.add(word.charAt(i));
    }
    return setWord;
  }

  public Map<List<String>, Multiset<Character>> mapWordToSet(String[] words) {
    Map<List<String>, Multiset<Character>> result = new HashMap<>();
    for (String word : words) {
      Multiset<Character> wordChar = convertStringToSet(word);
      if(result.containsValue(wordChar)) {
        List<String> strings = result.entrySet()
            .stream()
            .filter(entry -> wordChar.equals(entry.getValue()))
            .map(Entry::getKey)
            .findFirst().get();
        List<String> copy = new ArrayList<>();
        copy.addAll(strings);
        result.remove(strings);
        copy.add(word);
        result.put(copy, wordChar);
      }
      else {
        result.put(Collections.singletonList(word), wordChar);
      }
    }
    return result;
  }
}
