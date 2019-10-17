package LeetCodeArray;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNum {

  public int removeDuplicates(int[] nums) {
    int finalLength = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        finalLength++;
      } else {

      }
    }
    return finalLength;
  }

  public int[] nextPermutation(int[] nums) {
    int min = Integer.MAX_VALUE;
    int replace = -1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > nums[i]) {
        min = nums[i];
        int nextMin = Integer.MAX_VALUE;
        for (int j = i; j < nums.length; j++) {
          if (nums[j] < nextMin) {
            nextMin = nums[j];
            replace = j;
          }
        }
        int temp = nums[i];
        nums[i] = nums[replace];
        nums[replace] = temp;
        return nums;
      }
    }
    return nums;
  }

  public String multiply(String num1, String num2) {
    int n1 = 0;
    int n2 = 0;
    String finalResult = "";
    for (int i = 0; i < num1.length(); i++) {
      n1 = n1 * 10 + ((int) num1.charAt(i) - 48);
    }
    for (int j = 0; j < num2.length(); j++) {
      n2 = n2 * 10 + ((int) num2.charAt(j) - 48);
    }
    int result = n1 * n2;
    System.out.println(result);
    while (result != 0) {
      int remainder = result % 10 + 48;
      finalResult += (char) remainder;
      result = result / 10;
    }
    String f = "";
    for (int k = finalResult.length() - 1; k >= 0; k--) {
      f += finalResult.charAt(k);
    }
    return f;
  }

  public int divide(int dividend, int divisor) {
    int i = 0;
    boolean negative = false;
    if (dividend < 0) {
      dividend = dividend * -1;
      negative = true;
    }
    if (divisor < 0) {
      divisor = divisor * -1;
      if (negative == true) {
        negative = false;
      } else {
        negative = true;
      }
    }
    while (dividend * (-1) <= 0) {
      dividend -= divisor;
      i++;
    }
    if (negative == true) {
      return (i - 1) * -1;
    }
    return i - 1;
  }

  public int[] searchRange(int[] nums, int target) {
    int high = nums.length - 1;
    int low = 0;
    int mid = 0;
    int arr[] = new int[2];
    while (low < high) {
      mid = (high + low) / 2;
      if (nums[mid] >= target) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    arr[0] = mid;

    low = 0;
    high = nums.length - 1;
    while (low < high) {
      mid = (high + low) / 2;
      System.out.println(mid);
      if (nums[mid] > target) {
        break;
      } else {
        low = mid + 1;
      }
    }
    arr[1] = low - 1;
    return arr;
  }

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int currNum1 = nums1[0];
    int currNum2 = nums2[0];
    int i = 0;
    int j = 0;
    while (i < m) {
      if (currNum1 <= currNum2) {
        i++;
        currNum1 = nums1[i];
      } else {
        nums1[i] = nums2[j];
        nums2[j] = currNum1;
        currNum2 = nums2[j];
        currNum1 = nums1[++i];
      }
    }
    for (int l = 0; l < n; l++) {
      nums1[m + l] = nums2[l];
    }
  }

  public static void fullJustify(int lineLength, List<String> lines) {
    /* combine all lines in a single String separated by single space */
    String str = "";
    for (String word : lines) {
      str += word + " ";
    }

    List<String> res = new ArrayList<>();
    int start = 0;  // start index of current word in str
    while (start < str.length()) {
      /* find the substring in str which can fit in one line */
      int end = Math.min(start + lineLength, str.length() - 1);
      while (end > start && str.charAt(end) != ' ') {
        end--;
      }
      String substring = str.substring(start, end);

      /* fill the current line */
      StringBuilder sb = new StringBuilder();
      int count = 0;  // num of spaces in str[start:end)
      int index = substring.indexOf(' ');  // next index of space int str[start:end)
      while (index >= 0) {  // count the num of spaces in str[start:end)
        count++;
        index = substring.indexOf(' ', index + 1);
      }

      if (end == str.length() - 1 || count == 0) {  // at the last line or only fit one word
        sb.append(substring);
        for (int i = 0; i < lineLength - substring.length(); i++) {
          sb.append(' ');
        }
      } else {  // not at the last line
        int spaces = lineLength - (end - start
            - count);  // num of spaces to be filled in current line with capacity of chars of lineLength
        while (start < end) {  // scan str[start:end)
          char c = str.charAt(start);
          if (c != ' ') {  // put one char into this line
            sb.append(c);
          } else {
            int addSpace = spaces / count + (spaces % count == 0 ? 0 : 1);
            for (int i = 0; i < addSpace; i++) {  // put appropriate num of spaces between lines
              sb.append(' ');
            }
            count--;  // one space in str[start:end) has been filled
            spaces -= addSpace;  // spaces between two lines in current line has been filled
          }

          start++;  // move to next char in str[start:end)
        }
      }

      res.add(sb.toString());  // finish current line
      start = end + 1;  // start to process next line
    }

    for (int i = 0; i < res.size(); i++) {
      System.out.println(res.get(i));
    }
  }

}
