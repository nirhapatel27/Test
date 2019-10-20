package LeetCodeArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int firstPointer = 0;
    int secondPointer = 1;
    while(secondPointer < nums.length) {
      if(nums[firstPointer] != 0) {
        firstPointer++;
      }
      if(nums[secondPointer] == 0) {
        secondPointer++;
      } else if(nums[firstPointer] == 0){
        swap(nums, firstPointer, secondPointer);
      } else {
        secondPointer++;
      }
    }
  }
  public void swap(int[] nums, int fromIndex, int toIndex) {
    int temp = nums[fromIndex];
    nums[fromIndex] = nums[toIndex];
    nums[toIndex] = temp;
  }

  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    int firstPointer = 0;
    int secondPointer = 1;
    int maxLength = Integer.MIN_VALUE;
    int currLength = 1;
    Set<Character> charSet = new HashSet<>();
    Map<Character, Integer> charMap = new HashMap<>();
    charSet.add(s.charAt(firstPointer));
    charMap.put(s.charAt(firstPointer), 1);
    while(secondPointer < s.length()) {
      if(!charSet.contains(s.charAt(secondPointer)) && charSet.size() < k)  {
        charSet.add(s.charAt(secondPointer));
        charMap.put(s.charAt(secondPointer), 1);
        secondPointer++;
        currLength++;
      } else if(charSet.contains(s.charAt(secondPointer))){
        charMap.put(s.charAt(secondPointer), charMap.get(s.charAt(secondPointer))+1);
        secondPointer++;
        currLength++;
      } else {
        charMap.put(s.charAt(firstPointer), charMap.get(s.charAt(firstPointer))-1);
        if(charMap.get(s.charAt(firstPointer)) == 0) {
          charSet.remove(s.charAt(firstPointer));
        }
        firstPointer++;
        if(maxLength < currLength) {
          maxLength = currLength;
        }
        currLength--;
      }
    }
    if(maxLength < currLength) {
      maxLength = currLength;
    }
    return maxLength;
  }

  public boolean checkStraightLine(int[][] coordinates) {
    double slope = (double)(coordinates[1][1] - coordinates[0][1])/(coordinates[1][0] - coordinates[0][0]);
    for(int i  = 1 ; i < coordinates.length-1 ; i++) {
      double currSlope = (double)(coordinates[i+1][1] - coordinates[i][1])/(coordinates[i+1][0] - coordinates[i][0]);
      if(currSlope != slope) {
        return false;
      }
    }
    return true;
  }

  public int balancedString(String s) {
    Map<Character, Integer> charMap = new HashMap<>();
    int numMore = 0;
    int numLess = 0;
    int result = 0;
    int x = 0;
    for(int i = 0 ; i < s.length(); i++) {
      Character currChar = s.charAt(i);
      if(charMap.containsKey(currChar)) {
        charMap.put(currChar, charMap.get(currChar)+1);
      } else {
        charMap.put(currChar, 1);
      }
    }
    for(int value : charMap.values()) {
      if(value - s.length()/4 < 0) {
        numLess += Math.abs(value - s.length()/4);
      } else {
        numMore += Math.abs(value - s.length()/4);
      }
      if(numLess - numMore == 0) {
        result += numLess;
        numLess = numMore = 0;
      }
    }
    result += Math.abs(numLess - numMore);
    return result;
  }

  public int subarraySum(int[] nums, int k) {
    int currSum = nums[0];
    int firstPointer = 0;
    int secondPointer = 1;
    int total = 0;
    if(nums[0] == k) {
      total++;
    }
    while(secondPointer < nums.length) {
      currSum += nums[secondPointer];
      if(currSum == k) {
        total++;
        currSum = currSum - nums[firstPointer];
        firstPointer++;
        secondPointer++;
      } else if(currSum < k) {
        secondPointer++;
      } else {
        currSum = currSum - nums[firstPointer] - nums[secondPointer] ;
        firstPointer++;
      }
    }
    return total;
  }
}
