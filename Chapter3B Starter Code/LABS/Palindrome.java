package LABS;
import java.util.Scanner;

/**
 * Ryan Kimberley
 * APCS Per 5
 * Palindrome Program
 */
public class Palindrome
{
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter in a string to check if it's a palindrome");
        String p = in.nextLine(); //getting user input
        in.close(); //IDE making me do this, throws error if I don't close scanner object
        
        p = p.toLowerCase(); //sending string to lowercase, ex: 'A' != 'a'
        p = p.replace(" ",""); //replacing spaces with nothing, ex: "a a" -> "aa"
        
        int beg = 0; //initializing "beginning" to zero and end to length of the input
        int end = p.length()-1;
        boolean flag = true; //flag placed out of loop to make sure output is only displayed 1x
        
        while (beg < end){ //while loop that runs as long as there are more chars to check
            
            char test = (char) p.charAt(beg); //first char
            char test1 = (char) p.charAt(end); //last char
            
            beg++; //beg increasing by 1 every time the loop executes
            end--; //end decreasing by 1, so loop ends when no char left to check
            
            if (test != test1){  //testing if any char isnt equal to the counterpart
                System.out.println("Not a palindrome!"); 
                break; //breaks loop if the if statement executes
            }
            
            while (flag != false){ //while loop runs if loop hasn't been broken
                System.out.println("Palindrome!");
                flag = false; //setting boolean to false so loop can only execute once
            }
            }
    }
 

}

