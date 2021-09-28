
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
        double income;
        double tax = 0;
        double total = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e  = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in your income: $");
        income = in.nextDouble();
        
        if (income < 50000){
            tax = income*0.01;
        }
        else if (income > 50000 && income < 75000){
            a = income - 50000;
            tax = (50000*0.01) + (a*0.02);
        }
        else if (income > 75000 && income < 100000){
            a = 25000;
            b = income - 75000;
            tax = (50000*0.01) + (a*0.02) + (b*0.03);
        }   
        else if (income > 100000 && income < 250000){
            a = 25000;
            b = 25000;
            c = income - 100000;
            tax = (50000*0.01) + (a*0.02) + (b*0.03) + (c*0.04);
        }
        else if (income > 250000 && income < 500000){
            a = 25000;
            b = 25000;
            c = 150000;
            d = income - 250000;
            tax = (50000*0.01) + (a*0.02) + (b*0.03) + (c*0.04) + (d*0.05);
        }
       else if (income > 500000 ) {
            a = 25000;
            b = 25000;
            c = 150000;
            d = 250000;
            e = income - 500000;
            tax = (50000*0.01) + (a*0.02) + (b*0.03) + (c*0.04) + (d*0.05) + (e*0.06);
        }

        
        
        System.out.print("You're taxed $"+tax);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
