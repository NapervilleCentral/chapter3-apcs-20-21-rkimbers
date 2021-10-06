import java.util.Random;

public class MontyHall
{
   public static void main(String[] args)
   {
      int strategy1Count = 0;
      int strategy2Count = 0;
      final int NUMBER_OF_RUNS = 1000;
      Random generator = new Random();

      // Simulate the game 1000 times

         // Host must pick a door that's not the player's door and not the
         // door with the car

            /**
               Host has only one choice, the door that is left over. We can
               do this in one step by adding the current player door with the
               car door to yield a number between 1 and 3, if we subtract 3
               from that, we get the leftover door
            */


         // Same trick as the above else case

      System.out.printf("After %d runs, strategy 1 yielded %d wins while "
            + "strategy 2 yielded %d.%n", NUMBER_OF_RUNS, strategy1Count,
            strategy2Count);
   }
}
