/**
 * Two Dice Simulating with Methods
 * @author  Can Avsar
 * @version 27 November 2019
 */ 

public class TestDie
{
   public static void main( String[ ] args )
   {
      
      // constants
      
      // variables
      
      Die die1;
      Die die2;
      
      die1 = new Die();
      die2 = new Die();
      
      // program code
      
      die1.roll();
      die2.roll();
      
      System.out.println( die1 + " " + die2 );
      
   }
   
}