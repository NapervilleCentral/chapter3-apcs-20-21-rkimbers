package LABS;

import java.lang.Math;

/**
 * 
 * Ryan Kimberley
 * APCS Per 5
 * Monty Hall Paradox
 */
public class MontyHall
{
    public static void main(String[]args){
        
        for (int i = 0; i <= 1000; i++){
            
            int pick = (int)(Math.random()*3);
            int winner = (int)(Math.random()*3);
            
            int remove = (int)(Math.random()*3);
                
            
            System.out.print(pick);
            
            
        }
        
        
    }
}
