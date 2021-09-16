package e20;

import java.util.Scanner;
/**
 * Read three floating-point numbers and print
 * the largest of the three.
 */
public class MaxOfThree
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter three numbers: ");
      double largest = 0.0;
      double a,b,c;
      
      a = in.nextDouble();
      b = in.nextDouble();
      c = in.nextDouble();
      
      if (a>b && a>c){ 
          largest = a;
        }
      else if (b>a && b>c){ 
          largest = b;
        }
      else if (c>a && c>b){
          largest = c;
        }
         
      System.out.println("The largest number is " + largest + " yo.");
   }
}
