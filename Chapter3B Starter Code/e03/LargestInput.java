package e03;

import java.util.Scanner;

public class LargestInput
{
   public static void main(String[] args)
   {

    
      
      String start = new String("Q");
      System.out.print("Enter a series of numbers, then type Q to process: ");
      
      Scanner in = new Scanner(System.in);
      String number = in.next();
      int num = Integer.parseInt(number);
      int largest = Integer.parseInt(number);
      int smallest = Integer.parseInt(number);    
        
      while (!number.equals("Q")){
        if (largest >= smallest){
             System.out.print("Largest: " + largest + "\n" + "Smallest: " + smallest);
            
            
        }
        
        
        }
      


            
      
      
          
      // Loop on input and check for a new min or max

      // Output the results
      
   
   System.out.print("Largest: " + largest + "\n" + "Smallest: " + smallest);
}
}
