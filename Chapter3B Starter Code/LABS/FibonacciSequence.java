package LABS;


import java.util.Scanner;

/*
 * Ryan Kimberley
 * APCS Per 5
 * Fibonacci Sequence Program
 */

//  (1,2,3,4,5,6,7,8,9)
// (0,1,1,2,3,5,8,13,21)

public class FibonacciSequence {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);   //gathering input
        System.out.println("Enter in value you want to receive: ");
        int pos = in.nextInt(); //setting int equal to user input
        in.close(); //closing scanner, ide making me do this

        int num = 1; //initialzing variables
        int add = 0;
        int v1 = 0;
        int v2 = 0;

        if (pos >= 1){ //checking what value  intpos should print
            num = 0;
            System.out.print(num+" ");
        }

        if (pos >= 2){ //printing if int pos is greater than 2
            num = 1;
            System.out.print(num);
        }

        if (pos >= 3) { //checking if int pos is greater than 3
            for (int i = 0; i < (pos-2); i++) { //for loop that runs for the value of pos
                v1 = v2; 
                v2 = num; //changing values of first and second in sequence, for the next time loop runs
                num = (v1+v2); //re-defining num
                System.out.print(" "+num); //outputting num
            }
        }
        
    }
}
