
/**
 *
 *Ryan Kimberley
 *Planet Program
 *APCS Per 5
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class PlanetProgram
{
    public static void main(String[]args){
            //initializing variable    
            char choice;
            double weight;
            double nw = 0;
            
            //menu for selecting planet
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("What planet do you want to weigh yourself on? ");
            System.out.print("m) Mercury\n");
            System.out.print("v) Venus\n");
            System.out.print("e) Earth\n");
            System.out.print("M) Mars\n");
            System.out.print("j) Jupiter\n");
            System.out.print("s) Saturn\n");
            System.out.print("u) Uranus\n");
            System.out.print("n) Neptune\n");

            choice = Keyboard.next().charAt(0);
            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter in your weight: ");
            weight = in.nextDouble();
            
            //formatting output
            DecimalFormat fmt = new DecimalFormat("0.##");
            
            //sorting through char input to determine weight
             switch (choice){
                case 'm':
                    nw = weight*0.38;
                    break;
                case 'v':
                    nw = weight*0.91;
                    break;
                case 'e':
                    nw = weight;
                    break;
                case 'M':
                    nw = weight*0.38;
                    break;
                case 'j':
                    nw = weight*2.34;
                    break;
                case 's':
                    nw = weight*1.06;
                    break;
                case 'u':
                    nw = weight*0.92;
                    break;
                case 'n':
                    nw = weight*1.19;
                    break;
                    //default incase invalid
                default:
                    System.out.print("Invalid input \n");
                    
                    
           
                    
            }
            //printing out formatted weight
            System.out.print("Your weight is "+fmt.format(nw)+"lbs");
             
        
        
    }
}
