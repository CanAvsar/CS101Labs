/**
 * Dice Rolling with the Old Way
 * @author Can Avsar
 * @version 27 November 2019
 */ 

public class OldDiceGame
{
   public static void main( String[] args )
   {
      
      // constants
      
      // variables
      
      int die1;
      int die2;
      int count;
      
      // program code
      
      count = 0;
      
      do
      {
         die1 = ( int ) Math.floor( Math.random() * 6 + 1 );
         die2 = ( int ) Math.floor( Math.random() * 6 + 1);
         System.out.println( die1 + " " +  die2 );
         count++;
      }
      while ( die1 != 6 || die2 != 6 );
      
      System.out.println( count - 1 + " dice rolled." );
      
   }
   
}