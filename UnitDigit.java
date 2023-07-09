/* Given two integers num and k, consider a set of positive integers with the following properties:
1)- The units digit of each integer is k.
2)- The sum of the integers is num.
Return the minimum possible size of such a set, or -1 if no such set exists.
* Eg 1 :  num = 58      k = 9        Output = 2 
* Eg 2 :  num = 37      k = 2        Output = -1
* Eg 3 :  num = 0       k = 7        Output = 0
*/
import java.util.*;
public class UnitDigit
{
      public int MinimumNumbers(int nums, int k)
      {
            if(nums == 0)     return 0;    //* Base Condition -> O(1)
            for(int i = 1; i * k <= nums && i <= 10; ++i)     //! Comparison -> O(N)
            {
                  if(k * i % 10 == nums % 10)   // If the condition is satisfied, then i set can be formed...
                        return i;
            }
            return -1;   // Otherwise, no set can be formed...
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x, x1;
            System.out.print("Enter the number : ");
            x = sc.nextInt();
            System.out.print("Enter value of K : ");
            x1 = sc.nextInt();
            UnitDigit unitdigit = new UnitDigit();     // Object creation...
            System.out.println("The Maximum Set possible : "+unitdigit.MinimumNumbers(x, x1));
            sc.close();
      }
}



//! Time Complexity -> O(N)
//* Space Complexity -> O(1)