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

        Scanner in = new Scanner(System.in);
        System.out.println("Enter in value you want to receive: ");
        int pos = in.nextInt();
        in.close();

        int num = 1;
        int add = 0;
        int v1 = 0;
        int v2 = 0;

        if (pos >= 1){
            num = 0;
            System.out.print(num+" ");
        }

        if (pos >= 2){
            num = 1;
            System.out.print(num);
        }

        if (pos >= 3) {
            for (int i = 0; i < (pos-2); i++) {
                v1 = v2;
                v2 = num;
                num = (v1+v2);
                System.out.print(" "+num);
            }
        }
        
    }
}
