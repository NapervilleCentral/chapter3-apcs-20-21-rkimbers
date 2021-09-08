import java.util.Scanner;
/**
   This program calculates the season for a given month and day.
*/
public class SeasonsDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter a date (month and day): " );
      int month = in.nextInt();
      int day = in.nextInt();
      //only used of writing class
      //Date date = new Date(month, day);

      //. . .  your code here
      System.out.println("Season: " + date.getSeason());
   }
}
