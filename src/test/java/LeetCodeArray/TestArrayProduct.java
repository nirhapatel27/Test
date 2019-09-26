package LeetCodeArray;

import org.junit.Test;

public class TestArrayProduct {

  private ArrayProduct arrayProduct = new ArrayProduct();

   @Test
  public void testProductExceptSelf() {
     int arr[] = new int[] {1,2,3,4};
     arrayProduct.productExceptSelf(arr);
   }
}
