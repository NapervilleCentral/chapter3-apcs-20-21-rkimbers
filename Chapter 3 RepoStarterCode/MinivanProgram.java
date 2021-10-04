/**
 * Minivan Program
 *
 *Ryan Kimberley
 *APCS Per 5 
 */
import java.util.Scanner;
public class MinivanProgram
{
    public static void main(String[]args){
        int DL, DR, CL, MU, IL, IR, OL, OR;
        String gear;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in status code: ");
        DL = in.nextInt();
        DR = in.nextInt();
        CL = in.nextInt();
        MU = in.nextInt();
        IL = in.nextInt();
        IR = in.nextInt();
        OL = in.nextInt();
        OR = in.nextInt();
        in.nextLine();
        gear = in.nextLine();
      

      if (gear.equals("P") && MU == 1){
        if (CL == 1){
          if ((OR == 1 || DR ==1) && (OL == 1 || DL == 1)){
              System.out.print("Both doors opened");
            }
          else if(OR == 1 || DR == 1){
              System.out.print("Right door opened");
            }
          else if (OL == 1 || DL == 1){
              System.out.print("Left doors opened");
            }
          
          /*else if(IL == 1 && IR == 0){
              System.out.print("Right door opened");
            }
          else if (IR == 1 && IL == 0){
              System.out.print("Left door opened");
            }
            */

        }
        }
        else if (gear.equals("P") && CL == 0){
          if (IL == 0 || OL == 0){
            if (IR == 1 || OR == 1){
              System.out.println("Both doors are opened");
            }
            else{
              System.out.println("Left door opened");
            }
          }
          else if (IR != 1 && OR == 1){
            System.out.println("Right door opened");
          }
        
            else{
            System.out.print("Both doors stay closed");
        }
    }
    else{
       System.out.print("Both doors closed"); 
        }
}
}
