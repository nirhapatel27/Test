package LeetCode;

public class ArrayProduct {

  public int[] productExceptSelf(int[] nums) {
    int arr[] = new int[nums.length];
    int leftProd[] = new int[nums.length];
    int rightProd[] = new int[nums.length];
    leftProd[0] = 1;
    rightProd[nums.length-1] = 1;
    for(int i = 1 ; i < nums.length ; i++) {
      leftProd[i] = leftProd[i-1] * nums[i-1];
      rightProd[nums.length - i - 1] = rightProd[nums.length - i] * nums[nums.length-i];
    }
    for(int j = 0; j < nums.length; j++ ) {
      arr[j] = leftProd[j] * rightProd[j];
      System.out.println(arr[j]);
    }
    return arr;
  }
}
