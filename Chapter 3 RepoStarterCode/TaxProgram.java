
/**
 * 
 * Tax Program
 * Ryan Kimberley
 * APCS Per 5
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class TaxProgram
{
    public static void main(String[]args){
        double tax;
        double total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in your income: $");
        tax = in.nextDouble();
        
        if (tax > 500000){
            total = tax*0.06;
        }
        if (tax > 250000){
            total = tax*0.05;
        }
        if (tax > 100000){
            total = tax*0.04;
        }
        if (tax > 75000){
            total = tax*0.03;
        }
        if (tax > 50000){
            total = tax*0.02;
        }
        if (tax > 0){
            total = tax*0.01;
        }
        
        System.out.print("You're taxed $"+total);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
