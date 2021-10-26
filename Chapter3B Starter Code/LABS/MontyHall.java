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
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < 1000; i++){
            
            int pick = (int)(Math.random()*3);
            int winner = (int)(Math.random()*3);
            int remove = (int)(Math.random()*3);
            int Switch = (int)(Math.random()*3);
            
            while (remove == pick || remove == winner){
                remove = (int)(Math.random()*3);   }
            while (Switch == pick || Switch == remove){
                Switch = (int)(Math.random()*3);   }
            if (Switch == winner){   //strategy 1
                s1 += 1;
            }
            else if (pick == winner){     //strategy 2
                s2 += 1;
            }
        }
        System.out.println("Strategy 1 results "+s1);
        System.out.println("Strategy 2 results "+s2); 
    }
}
