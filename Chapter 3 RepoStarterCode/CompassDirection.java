import java.util.Scanner;
/**
   Prints the compas direction N,NE,E,SE,S,SW,W,NW
   Given an angle as input.
*/
public class CompassDirection
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the direction the compass is pointing " + " (in degrees from North (0..360): ");
      double degrees = in.nextDouble();

      System.out.print(degrees + " Degrees is ");

      // Calculate the direction and print the rest
      // of the line here
     
      if (degrees==0 || degrees==360)
        System.out.print(degrees + " Degrees is North");
      else if (degrees>0 && degrees<90)
        System.out.print(degrees + " Degrees is North East");
      else if (degrees==90)
        System.out.print(degrees + " Degrees is East");
      else if (degrees>90 && degrees<180)
        System.out.print(degrees + " Degrees is South East");
      else if (degrees==180)
        System.out.print(degrees + " Degrees is South");
      else if (degrees>180 && degrees<270)
        System.out.print(degrees + " Degrees is South West");
      else if (degrees == 270)
        System.out.print(degrees + " Degrees is West");
      else if (degrees < 360 && degrees > 270)
        System.out.print(degrees + " Degrees is North West");
      else
        System.out.print(" Not in range");



   }
}
