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
      
      if (a>b>c){
          num1 = a;
          num2 = b;
          num3 = c;
          
          System.out.print(a,b,c);
          
        }
      
      


   }
}
