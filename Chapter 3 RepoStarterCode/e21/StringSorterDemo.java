import java.util.Scanner;

/**
   This program sorts three strings.
*/
public class StringSorterDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String small = "", middle = "",large = "";

      System.out.print("Please enter three strings:");
      String str1 = in.next();
      String str2 = in.next();
      String str3 = in.next();

	//chalenge to use a class
      //StringSet s = new StringSet(str1, str2, str3);

      //System.out.println(s.getSmallest() + "\n"
      //                 + s.getMiddle() + "\n"
      //                 + s.getLargest());

      // . . .  your code here

      System.out.println("Smalest is"+ small + "\n"
	  + "In the Middle is" + middle+ "\n"
      + "The Largest is" + large);



   }
}
