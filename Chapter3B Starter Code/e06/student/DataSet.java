/**
   This class is used to calculate the average, smallest, largest
   and range of the values.
*/
public class DataSet
{
   private double sum;
   private double largestValue;
   private double smallestValue;
   private int n;

   /**
      Constructs a DataSet object to hold the number of items,
      the extreme values and the sum.
   */
   public DataSet()  {  . . .  }

   /**
      Adds a value to this data set.
      @param x the input value
   */
   public void add(double x)
   {
      sum = sum + x;
      sumSquare = sumSquare + x * x;
      n++;
   }

   /**
      Method used to calculate the average of the data set.
      @return average the average of the data set
   */
   public double getAverage() { . . . }

   /**
      The smallest value contained in the data set.
      @return the smallest value in the data set
   */
   public double getSmallest()  { . . . }

   /**
      The largest value contained in the data set.
      @return the largest value in the data set
   */
   public double getLargest()  { . . . }

   /**
      The range of values in the data set.
      @return the range of values in the data set
   */
   public double getRange()  { . . . }

   /**
      Gets the total number of input values.
      @return n the total number of inputs
   */
   public int getCount() { . . . }
}
