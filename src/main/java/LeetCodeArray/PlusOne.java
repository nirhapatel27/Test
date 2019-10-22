package LeetCodeArray;

import java.util.Arrays;

public class PlusOne {
  public int[] plusOne(int[] digits) {
    int currNum = digits[digits.length - 1] + 1;
    int result[] = new int[digits.length+1];
    result[digits.length] = currNum%10;
    int carry = currNum == 10 ? 1 : 0;
    for(int i = 1 ; i < digits.length; i++) {
      currNum = digits[digits.length - i - 1] + carry;
      carry = currNum == 10 ? 1 : 0;
      result[digits.length - i] = currNum%10;
    }
    if(carry == 1) {
      result[0] = 1;
    } else {
      return Arrays.copyOfRange(result, 1, result.length);
    }
    return result;
  }
}
