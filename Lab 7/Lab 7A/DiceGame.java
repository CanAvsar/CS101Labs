/**
 * Dice Game Playing
 * @author Can Avsar
 */

public class DiceGame
{
   
   // properties
   
   private Dice dice;
   private int count;
   private int theDiceTotal;
   
   // constructors
   
   public DiceGame()
   {
      dice = new Dice();
   }
   
   // methods
   
   /**
    * This method rolls dice and returns total.
    * @return String
    */
   public String play() 
   {  
      
      theDiceTotal = dice.roll();
      
      while ( theDiceTotal != 12 )
      {   
         theDiceTotal = dice.roll();
         System.out.println( dice.getDie1FaceValue() + " " + dice.getDie2FaceValue() );
         count++;
      }
      
      return ( count  - 1 ) + " dice rolled."; 
   }
   
}