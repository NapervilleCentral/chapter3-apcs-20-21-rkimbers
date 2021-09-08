import java.util.Scanner;
/**
   This program calculates the pay of an employee.
*/
public class PayCalculator
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Hourly wage: ");
      double hourlyWage = in.nextDouble();

      System.out.print("Hours worked: ");
      double hours = in.nextDouble();

      PayCheck aPayCheck = new PayCheck(hourlyWage, hours);

      System.out.printf("Pay: %.2f%n", aPayCheck.getPay());
   }
}
