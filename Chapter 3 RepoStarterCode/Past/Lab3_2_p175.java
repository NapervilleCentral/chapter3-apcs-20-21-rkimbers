
/**
 *Ryan Kimberley
 *APCS
 *Lab 3.2 p175
 *
 *Comments: As long as it works its great, good comments
 */
import java.util.Scanner;

public class Lab3_2_p175
{
    public static void main(String[]args){
        //initializing scanner method and integers
        Scanner in = new Scanner(System.in);
        int a,b,c;
        
        //gathering input
        System.out.print("Please enter a year: " );
        int year = in.nextInt();
        
        //math to decide if year fits criteria
        a = year%4;
        b = year%100;
        c = year%400;
        
       
        //if statements sorting through criteria to return type of year
        if (((year >= 1582) && (a == 0)!=((b==0)&&(c!=0)))){
            System.out.print("Leap year");  
        }
        else if (year < 1582){
            System.out.print("Gregorian year");
            
        }
        
        else{
            System.out.print("Not a leap year");
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}


/* Please enter a year: 2000
 * Leap year
 * 
 *  Please enter a year: 1900
 *  Not a leap year
 * 
 *  Please enter a year: 1984
 *  Leap year
 */