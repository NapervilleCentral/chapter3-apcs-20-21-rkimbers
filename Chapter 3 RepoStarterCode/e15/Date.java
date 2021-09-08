/**
   This class calculates the season for a given month and day.
*/
public class Date
{
   private int day;
   private int month;

   /**
      Constructs a Date with a month and day.
      @param month the month number with January being 1
      @param day the day of the month
   */
   public Date(int month, int day)
   {
      this.month = month;
      this.day = day;
   }

   /**
      @return the season of this date.
   */
   public String getSeason()
   {
      . . .
   }
}
