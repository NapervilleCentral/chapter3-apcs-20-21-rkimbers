import java.util.Scanner;

public class NumOrderCondition
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out
            .println("Enter S for strict ordering, L for lenient (S or L):");
      String answer = in.next();

      System.out.println("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();

   }
}
