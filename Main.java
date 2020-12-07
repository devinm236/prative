/* U6 Lab3: BigInt
 * Name:Ian Myers N2
 * Date:12/01/20
 *
 * AP CSA
 */

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    int [] num1 = {5,6,1,3,0,9};
    int [] num2 = {1,7,2};
    BigInt test = new BigInt(num1,num2);
   System.out.println(Arrays.toString(test.addNumbers()));
  }
}