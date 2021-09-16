package e15;

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
      
      if ((month >= 3 && month <= 6 && day >=20) || (month <= 6 && day < 20)){
          
          System.out.print("It is spring");
        }
      else if ((month >= 6 && month <= 9 && day >= 20) || (month <= 9 && day < 22)){
          
          System.out.print("It is summer");
        }
      else if ((month >= 9 && month <= 12 && day <= 22) || (month <= 12 && day < 21)){
          
          System.out.print("It is Fall");
        }
      else if ((month >= 12 && month <= 3 && day >= 21) || (month <= 3 && day < 20)){
          
          System.out.print("It is Winter");
        }  
      //System.out.println("Season: " + date.getSeason());
   }
}
