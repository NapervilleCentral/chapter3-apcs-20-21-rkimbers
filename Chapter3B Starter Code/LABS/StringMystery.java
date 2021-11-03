package LABS;

import java.util.Scanner;

/*
 * Ryan Kimberley
 * APCS Per 5
 * String Mystery program
 */
public class StringMystery {

    public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter in a mystery string");
    String inputMystery = in.nextLine();
    int currentDigit = 0;
    int lastDigit = 0;
    int mysteryLength = 0;
    
    mysteryLength = inputMystery.length() - 1;
    lastDigit = inputMystery.charAt(mysteryLength);
    System.out.println(lastDigit);


  //  for (int i = 0; i < mysteryLength; i++) {
 //       currentDigit = inputMystery.charAt(i);
 //       System.out.print(" "+currentDigit);


//    }
    }
}
