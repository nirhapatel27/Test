package LeetCodeArray;

public class ValidPalindrome {

  public boolean validPalindrome(String s) {
    String t = "";
    for(int i = 0; i < s.length(); i++) {
    if(Character.isLetterOrDigit(s.charAt(i))) {
      t += s.charAt(i);
    }
  }
  StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(t);
    if(stringBuilder.reverse().toString().toLowerCase().equals(t.toLowerCase())) {
    return true;
  }
    return false;
}

}
