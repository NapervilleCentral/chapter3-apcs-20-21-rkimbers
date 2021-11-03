package LABS;

import java.util.Scanner;



public class StringMystery {

    public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter in a mystery string");
    String inputMystery = in.nextLine();
    int currentDigit = 0;
    int lastDigit = 0;

    lastDigit = inputMystery.charAt(inputMystery.length()-1);
    //System.out.println(inputMystery.length() -1 );
    System.out.println(lastDigit);


    for (int i = 0; i < inputMystery.length() - 1; i++) {
        currentDigit = inputMystery.charAt(i);
        System.out.print(" "+currentDigit);






    }
    }
}
