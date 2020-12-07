/* U6 Lab3: BigInt
 * Name:Ian Myers N2
 * Date:12/01/20
 *
 * AP CSA
 */

public class BigInt
{
  private int[] numOne;
  private int[] numTwo;

  public BigInt()
  {
    numOne = new int[1];
    numTwo = new int[2];
  }

  public BigInt(int[] one, int[] two)
  {
    numOne = reverseArray(one);
    numTwo = reverseArray(two);
    // Right now numOne and numTwo store an array of 0s with the correct lengths.
    // However, the arrays need to be reversed in order to add them easier later on.


  }
  public int [] arrayOne()
  {
    return numOne;
  }

  public int [] arrayTwo()
  {
    return numTwo;
  }


  //deep breath and take your time.
  public int[] addNumbers()
  {
    int [] num3 = new int[numOne.length+1];
    int [] num4 = new int[numTwo.length+1];
    if (numOne.length>numTwo.length)
    {
      for(int i = 0; i<num3.length-1; i++)
    {
      if((numOne[i] + numTwo[i])< 10)
      num3 [i] = numOne[i] + numTwo[i];
      else if (10 < (numOne[i] + numTwo[i]))
      {
        num3[i+1] = (numOne[i]+numTwo[i])/2;
        num3[i] = (numOne[i]+numTwo[i])%10;
      }
      else
      num3 [i+1] = 1;

    }
    return reverseArray(num3);
    }
    else
    {
      for(int i = 0; i<num4.length-1; i++)
    {
      if(numOne[i] + numTwo[i]< 10)
      num4 [i] = numOne[i] + numTwo[i] + num4[i];
      else if (10 < numOne[i] + numTwo[i])
      {
        num4[i+1] = num4[i+1] + (numOne[i]+numTwo[i])/2;
        num4[i] = num4[i] + (numOne[i]+numTwo[i])%10;
      }
      else
      num4 [i+1] = num4[i+1] + 1;
    }
    return reverseArray(num4);
    }





  }

  public static int[] reverseArray(int[] num)
  {
    int k = 0;
    int [] reverse = new int[num.length];
    for(int i=num.length-1; i>=0; i--)
    {

      reverse[k] = num[i];
      k++;
    }
    num = reverse;
    return num;
  }

}
