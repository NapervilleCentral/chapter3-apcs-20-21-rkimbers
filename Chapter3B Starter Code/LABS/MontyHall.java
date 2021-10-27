package LABS;
import java.lang.Math;
/**
 * Ryan Kimberley
 * APCS Per 5
 * Monty Hall Paradox
 */
public class MontyHall
{
    public static void main(String[]args){
        int s1 = 0; //initializing counter for both strategys to zero
        int s2 = 0;
        
        for (int i = 0; i < 1000; i++){ //for loop that runs 1000 times
            
            int pick = (int)(Math.random()*3); //math class to generate random numbers between 0 and 2 
            int winner = (int)(Math.random()*3);
            int remove = (int)(Math.random()*3);
            int Switch = (int)(Math.random()*3);
            
            while (remove == pick || remove == winner){ //generating new door to "remove" incase "removed" door is equal to the "user pick" or the "winner"
                remove = (int)(Math.random()*3);   }
            while (Switch == pick || Switch == remove){ //generating new door incase "switch" door is equal to either remove or pick
                Switch = (int)(Math.random()*3);   }
            if (Switch == winner){   //strategy 1 - checking if "switch" is the winner
                s1 += 1; //if the if executes, counter for s1 increases by 1
            }
            else if (pick == winner){     //strategy 2 - checking if the original "pick" is the winner 
                s2 += 1; //if the if executes, counter for s1 increases by 1
            }
        }
        System.out.println("Strategy 1 results "+s1); //outputting results
        System.out.println("Strategy 2 results "+s2); 
    }
}
