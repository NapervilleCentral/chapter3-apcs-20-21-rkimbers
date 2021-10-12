package e02;

import java.util.Scanner;

public class SumOfOddDigits
{
   public static void main(String[] args)
   {
      String word = new String("A");
      int num = 0;
      int total = 0;
      
      while (!word.equals("Q")){
          
          Scanner in = new Scanner(System.in);
          System.out.println("Enter in a number ");
          num = in.nextInt();
          
          if (num%2 != 0){
             total += num;
              
            }
         
          
          Scanner in1 = new Scanner(System.in);
          System.out.println("Enter 'Q' to stop, A to continue ");
          word = in1.nextLine();
          
       }
      
      System.out.println("Total sum of odd numbers, "+total);
      // Get the input

      // The sum of odd digits of the input
      // enter Q to stop

         // Only add digit if it is odd


      // Output the result

   }
}
