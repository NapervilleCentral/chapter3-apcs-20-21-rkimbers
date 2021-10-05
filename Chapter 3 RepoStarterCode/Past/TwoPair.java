/*
 * Ryan Kimberley & Roman Kapur
 * Period 5 AP Comp Sci
 * 9/15/21
 */
import java.util.Scanner;

public class TwoPair
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      /*
       * Two pair - program reads four integers
       * and prints “two pair”
       * 1221 - 2 pair, 1223 - not 2 pair, 2222 - two pair
       */
     
      System.out.print("Enter four numbers: ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();
     
      if (a == b && c == d)
        System.out.println("two pair");
      else if (a == c && b == d)
        System.out.println("two pair");
      else if (a == d && b == c)
        System.out.println("two pair");
      else
        System.out.println("not two pair");

   }
}