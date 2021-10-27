package LABS;
import java.util.Scanner;

/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter in a string to check if it's a palindrome");
        String p = in.nextLine();
        
        p = p.toLowerCase();
        p = p.replace(" ","");
        
        int beg = 0;
        int end = p.length()-1;
        boolean flag = true;
        
        while (beg < end){
            
            char test = (char) p.charAt(beg);
            char test1 = (char) p.charAt(end);
            
            beg++;
            end--;
            
            if (test != test1){
                System.out.println("Not a palindrome!");
                break;
            }
            
            while (flag != false){
                System.out.println("Palindrome!");
                flag = false;
            }
            }
    }
 

}

