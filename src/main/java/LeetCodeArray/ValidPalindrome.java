package LeetCodeArray;

public class ValidPalindrome {

  public boolean validPalindrome(String s) {
    String t = "";
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetterOrDigit(s.charAt(i))) {
        t += s.charAt(i);
      }
    }
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(t);
    if (stringBuilder.reverse().toString().toLowerCase().equals(t.toLowerCase())) {
      return true;
    }
    return false;
  }

  public boolean validPalindromeTwo(String s) {
    int firstPointer = 0;
    int secondPointer = s.length()-1;
    boolean isOdd = (s.length() % 2) == 1;
    int numRemove = 0;
    while(firstPointer <= secondPointer) {
      if(s.charAt(firstPointer) == s.charAt(secondPointer)) {
        firstPointer++;
        secondPointer--;
      } else if(s.charAt(firstPointer+1) == s.charAt(secondPointer)) {
        firstPointer++;
        numRemove++;
      } else if(s.charAt(firstPointer) == s.charAt(secondPointer-1)) {
        secondPointer--;
        numRemove++;
      } else {
        return false;
      }
    }
    if(numRemove < 2) {
      return true;
    }
    return false;
  }

}
