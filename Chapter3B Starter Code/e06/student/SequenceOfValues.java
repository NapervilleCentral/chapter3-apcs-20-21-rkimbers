import java.util.Scanner;

public class SequenceOfValues
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      DataSet data = new DataSet();

      // Prompt the user for a sequence of floating-point values.
      // End the input with a non-numeric value such as Q


      // Read the input values and put them into the DataSet

      System.out.printf("The average of the values is: %f%n", data.getAverage());
      System.out.printf("The smallest value is %f%n", data.getSmallest());
      System.out.printf("The largest value is %f%n", data.getLargest());
      System.out.printf("The range is %f%n", data.getRange());
   }
}
