package LeetCodeSorting;

public class DivideNumber {

  public int divide(int dividend, int divisor) {
    int quotient = 0;
    int x = 0;
    boolean isNegative = false;
    if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
      isNegative = true;
    }
    if(dividend == Integer.MIN_VALUE) {
      isNegative = true;
      dividend = dividend - 1;
      x=1;
    }
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);
    while(dividend >= divisor) {
      dividend -= divisor;
      if(quotient < Integer.MAX_VALUE-1) {
        quotient++;
      } else {
        if(divisor < 0) {
          return 0 - Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
      }
    }

    if(x == 1) {
      dividend = dividend + 1;
    }
    if(dividend >= divisor) {
      quotient++;
    }
    if(isNegative) {
      quotient = 0 - quotient;
    }
    return quotient;
  }

}
