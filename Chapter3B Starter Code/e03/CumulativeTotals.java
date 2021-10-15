package e03;
import java.util.Scanner;

public class CumulativeTotals
{
   public static void main(String[] args)
   {
      double number = 0.0;  //initializing doubles
      double sum = 0.0;
      
      Scanner in = new Scanner(System.in); //scanner for inputting numbers
      System.out.println("Enter in a series of numbers: "); //prompt for user input
      String num = in.nextLine(); //gathering input from user
      
      
      
      in = new Scanner(num); //setting in equal to scannner input
      while (in.hasNextDouble()){ //while the input has a next double, it continues
        number = in.nextDouble(); // setting number equal to next double within the input
        sum += number; //adding up the sum
        
        
          
        
          
 }

System.out.print("Sum of input: "+sum);
      
      // 1,2,3,4,5 - display the total
      //more numbers? y
      // 6,7,8,9,10 - display the total
      
      //more numbers - n
      //display the total of all number inputed
   }
}