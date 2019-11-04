package LeetCodeArray;

import java.math.BigInteger;
import java.util.List;

public class Amazon {

  public int finalInstances(int instances, List<Integer> averageUtil) {
    int i = 0;
    while(i < averageUtil.size()) {
      if(averageUtil.get(i) < 25) {
        if(instances > 1) {
          instances = (int)Math.ceil((double)instances / 2);
          i = i + 10;
        } else {
          i++;
        }
      } else if(averageUtil.get(i) > 60) {
        if(instances <= 2*Math.pow(10, 8)) {
          instances = instances * 2;
          i = i+10;
        } else {
          i++;
        }
      } else {
        i++;
      }
    }

    return instances;
  }

  public void addStrings(String num1, String num2) {
    BigInteger num1Big = BigInteger.valueOf((int)num1.charAt(0)-48);
    BigInteger num2Big = BigInteger.valueOf((int)num2.charAt(0)-48);
    String resultString = "";
    for(int i = 1 ; i < num1.length(); i++) {
      num1Big = num1Big.multiply(BigInteger.valueOf(10));
      num1Big = num1Big.add(BigInteger.valueOf((int)num1.charAt(i) - 48));
    }

    for(int i = 1 ; i < num2.length(); i++) {
      num2Big = num2Big.multiply(BigInteger.valueOf(10));
      num2Big = num2Big.add(BigInteger.valueOf((int)num1.charAt(i) - 48));
    }

    BigInteger result = num1Big.add(num2Big);
  }

}
