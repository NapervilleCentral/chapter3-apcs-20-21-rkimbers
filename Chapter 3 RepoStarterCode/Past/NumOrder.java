import java.util.Scanner;

public class NumOrder
{
   public static void main(String[] args)
   {
      int a,b,c;
      int num1,num2,num3;
     
      Scanner in = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
      
      if ((a<b)&&(b<c)){
          
          System.out.print("Decreasing");
          
        }
      else if ((a>b)&&(b<c)){
          
          System.out.print("Increasing");
          
        }
      else{
          System.out.print("Neither");
        }
      


   }
}
