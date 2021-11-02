package LABS;

import java.io.*;
import java.util.Scanner;


/**
 * Ryan Kimberley
 * APCS Per 5
 * Speeches Program
 */
public class SpeechProgram
{
    public static void main(String[]args) throws IOException{
        
        //C:\Users\rkimberley\Desktop\APCS Github\chapter3-apcs-20-21-rkimbers\Chapter3B Starter Code\speeches
        int wordCount = 0, pickCount = 0; //initializing ints and strings
        String word, speechName, userPick, filePath;
        
        System.out.println("Enter in desired file path: "); //gathering input allowing user to input file path vs hardcoding file path
        Scanner in = new Scanner(System.in);
        filePath = in.nextLine();
        
        System.out.println("Enter in word to find: "); //allowing user to input desired word to search for
        Scanner in1 = new Scanner(System.in);
        userPick = in1.nextLine();
        
        Scanner scanFile = new Scanner(new File(filePath)); //scanner class to grab data within file
        
        speechName = filePath.substring((filePath.lastIndexOf("/"))+1,filePath.length()); //substringing file path to return a file name
        
        while(scanFile.hasNext()){ //while loop checking if there is another token in "scanFile"
            word = scanFile.next();
            wordCount += 1; //counter adding by 1 every time loop runs, to count total words
            if (word.equalsIgnoreCase(userPick)){
                pickCount += 1; //if user inputted word is found, counter adds 1 
            }
        }
        System.out.println("File name: "+speechName); //outputting
        System.out.println("Total words : "+wordCount);
        System.out.println("Total times the word '"+userPick+"' was said: "+pickCount);
    }
}
