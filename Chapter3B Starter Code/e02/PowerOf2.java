package e02;

import java.lang.Math;

public class PowerOf2
{
   public static void main(String[] args)
   {
      // The powers of 2 from 2^0 to 2^20
      int  num = 2;
      int total = 0;
      
   for(int i = 0; i < 21; i++)
 {    

       System.out.println(Math.pow(num,i));
       total += Math.pow(num,i);
       
   }
   System.out.print()
}

}