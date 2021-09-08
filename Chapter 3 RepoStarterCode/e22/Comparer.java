/**
   This class is used to test whether two floating-point
   numbers are the same.
*/
public class Comparer
{
   int dec_places;

   /**
      Creates a Comparer object to determine if two floating-point numbers
      are approximately the same.
      @param d the number of significant digits in the comparison
   */
   public Comparer(int d)
   {
      dec_places = d;
   }

   /**
      Tests whether two numbers are "the same".
      @param x1 the first number
      @param x2 the second number
      @return true if the two numbers differ by less than the number of
      significant digits
   */
   public boolean areSame(double x1, double x2)
   {
      // your code here. . .
      return true;
   }
}
