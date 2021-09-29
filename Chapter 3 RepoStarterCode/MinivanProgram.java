/**
 * Write a description of class MinivanProgram here.
 *
 *Ryan Kimberley
 */
import java.util.Scanner;
public class MinivanProgram
{
    public static void main(String[]args){
        boolean DL, DR, CL, MU, IL, IR, OL, OR;
        String gear;
        String p = new String("P");
        
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
        gear = in.nextLine();
      

      if (gear.equals(p) && MU = 1){
        if (CL = 1){
          System.out.println("Both doors stay closed");
        }
        else if (CL = 0){
          if (IL = 0 || OL = 0){
            if (IR = 0 || OR = 0){
              System.out.println("Both doors are opened");
            }
            else{
              System.out.printlm("Left door opened");
            }
          }
          else if (IR = 0 || OR = 0){
            System.out.println("Right door opened");
          }
        }

      }


    }
}