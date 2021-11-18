package LABS;

import java.util.*;
import java.io.*;

/*
 * Ryan Kimberley
 * APCS Per 5
 * String Mystery program
 * 
 */
public class StringMystery {

    public static void main(String[] args) throws IOException { //throwing an IO exception

        Scanner in = new Scanner(new File("LABS/String Mystery input.txt")); 
        String stringMystery = in.nextLine();

        int currentDigit = Integer.parseInt(stringMystery.substring(0, 1));  //getting first digit 
        int mysteryLength = stringMystery.length() - 1; //getting file length
        int lastDigit = Integer.parseInt(stringMystery.substring(mysteryLength, mysteryLength + 1)); //getting last digit
        int secondDigit = 0, count = 0; //initializing varables
        
        
        if (currentDigit == lastDigit){ //checking if first digit is equal to last digit in input 
                count += currentDigit;

        }
        for (int i = 0; i < mysteryLength; i++) { //loop executes the same time as charachters in input
            currentDigit = Integer.parseInt(stringMystery.substring(i, i+1)); //gathering first number in string 
            secondDigit = Integer.parseInt(stringMystery.substring(i+1, i+2)); //gathering second number in string


            if (currentDigit == secondDigit) { //comparing first number to second and adding if equal 
                count += currentDigit;
             }
        }
        System.out.println("Part 1 count: "+count); //output
        
        
        mysteryLength = (stringMystery.length() - 1)/2;
        
        
        for (int i = 0; i < mysteryLength; i++){
            
            currentDigit = Integer.parseInt(stringMystery.substring(i, i+1)); //gathering first number in string 
            secondDigit = Integer.parseInt(stringMystery.substring(((stringMystery.length()-1)/2)+i,(((stringMystery.length()-1)/2)+i)+1)); 
            
            if (currentDigit == secondDigit) {
                count += currentDigit;
                
            }
            
        }
        System.out.print("Part 2 count: "+count);
        
        }   
}       

