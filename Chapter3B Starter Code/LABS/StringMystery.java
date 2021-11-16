package LABS;

import java.util.Scanner;
import java.util.*;
import java.io.*;

/*
 * Ryan Kimberley
 * APCS Per 5
 * String Mystery program
 */
public class StringMystery {

    public static void main(String[] args)throws IOException {

        Scanner in = new Scanner(new File("LABS/String Mystery input.txt"));
        String stringMystery = in.nextLine();

        int currentDigit = Integer.parseInt(stringMystery.substring(0, 1));
        int lastDigit = Integer.parseInt(stringMystery.substring(2195, 2196));
        int secondDigit, count, mysteryLength;
        
        count = 0;

        mysteryLength = stringMystery.length() - 1;



        for (int i = 0; i < mysteryLength; i++) {
            currentDigit = Integer.parseInt(stringMystery.substring(i, i+1));
            secondDigit = Integer.parseInt(stringMystery.substring(i+1, i+2));


            if (currentDigit == secondDigit) {
                count += currentDigit - '0';
            }
            if (currentDigit == lastDigit){
                count += currentDigit - '0';

            }
        }
        System.out.print("Count: "+count);
        
        
        mysteryLength = (stringMystery.length() - 1)/2;
        
        for (int i = 0; i < mysteryLength; i++){
            
            currentDigit = Integer.parseInt(stringMystery.substring(i, i+1));
            
            if (currentDigit == secondDigit) {
                count += currentDigit - '0';
            }
            
        }
        System.out.print("Count: "+count);
        }   
}

