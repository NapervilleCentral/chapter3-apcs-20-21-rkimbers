package e03;

import java.util.Scanner;

public class LargestInput
{
   public static void main(String[] args)
   {

   
     
     
      System.out.print("Enter a series of numbers, and type Q to process: ");
     
      Scanner in = new Scanner(System.in);
   
       
      String num; // returns num as string
      int num1 = 0; // integer defined
     
      num = in.next();// read first word of the input string
      num1 = Integer.parseInt(num);// converts num into integer
     
      int largest = num1; //  assigns first number as largest
      int smallest = num1;// assigns first number as smallest
       
     while (true) // to read each word until the end of string
         {
           num = in.next();// reads next word of the input string
           
           if (num.equals("Q")) //check if end of string
           {
               break;
           }
           num1 = Integer.parseInt(num);// convert string into integer
           
           if (num1 >= largest) // checks for the largest number and assigns as largest
           {
               largest = num1;
           }
           if (num1 <= smallest)    // checks for the smaller number and assigns as smallest
           {
               smallest = num1;
           }    
        }
       
      System.out.print("Largest: " + largest + "\n" + "Smallest: " + smallest); // Output
    }
     

}
           
     
     
         
      // Loop on input and check for a new min or max

      // Output the results
     