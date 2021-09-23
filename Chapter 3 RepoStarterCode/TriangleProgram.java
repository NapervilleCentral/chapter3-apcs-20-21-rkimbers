
/**
 * Write a description of class TriangleProgram here.
 *
 * Ryan Kimberley
 * APCS Per 5 Triangle Program
 */

//importing scanner
import java.util.Scanner;
public class TriangleProgram
{
    public static void main(String[]args){
        
        //initializing variables 
        int a1, a2, a3, s1, s2, s3;
        Scanner in = new Scanner(System.in);        
        System.out.print("Enter in sides (1) or angles (2) of a triangle? (1 or 2) ");
        int choice = in.nextInt();
        
        //checking if user wants sides or angles
        if (choice == 1){
            
            System.out.print("Enter in the sides of the triangle");
            s1 = in.nextInt();
            s2 = in.nextInt();
            s3 = in.nextInt();
            if ((s1>0 && s2>0 && s3>0)){
                if (s1 == s2 && s2 == s3){
                        System.out.print("Equilateral triangle");
                    }   //ifs to check criteria to determine which triangle to print
                    else if ((s1 == s2 && s2 != s3) || (s1 != s2 && s2 == s3)){
                        System.out.print("Isoceles triangle");
                    }
                    else if ((s1 + s2 > s3)||(s1 + s3 > s2)||(s2 + s3 > s1) && (s1 != s2 && s2 != s3) || (s1 != s2 && s2 != s3)){
                        System.out.print("Scalene Triangle");
                    }   
                    else{    
                    System.out.print("Try again - invalid");
               }
            }//else to print a error message
            else{
                    System.out.print("Try again - invalid");
               }
            
        }
  
        else if (choice == 2){
            
            System.out.print("Enter in the angles of the triangle");
            a1 = in.nextInt();
            a2 = in.nextInt();
            a3 = in.nextInt();
            
            if ((a1 + a2 + a3 == 180) && (a1>0 && a2>0 && a3>0)){
                if (a1 == 60 && a2 == 60 && a3 == 60){
                    System.out.print("Equilateral triangle");
                }   //ifs to check criteria to determine which triangle to print
                else if (a1 == 90 || a2 == 90 || a3 == 90){
                    System.out.print("Right Triangle");
                }
                else if ((a1 == a2 && a2 != a3) || (a1 != a2 && a2 == a3)){
                    System.out.print("Isoceles triangle");
                }
            }//else to print a error message
            else{    
                System.out.print("Try again - invalid");
           }
        
        }
        else{
            System.out.print("Try again");
        }
        }
    }
        
       
        
        
        
        
        
        
        
        
        
    

