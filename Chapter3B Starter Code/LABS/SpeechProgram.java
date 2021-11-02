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
        int wordCount = 0, pickCount = 0;
        String word, speechName, userPick, filePath;
        
        System.out.println("Enter in desired file path: ");
        Scanner in = new Scanner(System.in);
        filePath = in.nextLine();
        
        System.out.println("Enter in word to find: ");
        Scanner in1 = new Scanner(System.in);
        userPick = in1.nextLine();
        
        Scanner scanFile = new Scanner(new File(filePath));
        
        speechName = filePath.substring((filePath.lastIndexOf("/"))+1,filePath.length());
        
        while(scanFile.hasNext()){
            word = scanFile.next();
            wordCount += 1;
            
            if (word.equalsIgnoreCase(userPick)){
                pickCount += 1;
                
            
            }
        }
        System.out.println("File name: "+speechName);
        System.out.println("Total words : "+wordCount);
        System.out.println("Total times the word '"+userPick+"' was said: "+pickCount);
    }
}
