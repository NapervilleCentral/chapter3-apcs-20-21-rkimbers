



import java.util.Scanner;
public class switch_example
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
            char choice;
            
            
       // switch statement------------------------------


            System.out.print("What would you like to buy?\n");
            System.out.print("f) fries\n");
            System.out.print("c) cheese\n");
            System.out.print("s) small drink\n");


            choice = Keyboard.next().charAt(0);
            
            //choice can be a char, int, or string
            
            //switch will cascade through

            switch (choice){
            
                case 'f':
                    System.out.print("0.99");
                    break;
                case 'c':
                    System.out.print("1.50");
                    break;
                case 's':
                    System.out.print("0.79");
                    break;
            
            }
    }//endo of main

}//end of class