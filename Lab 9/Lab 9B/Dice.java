/**
 * Dice Rolling
 * @author Can Avsar
 */

public class Dice
{
   
   // properties
   
   private Die die1;
   private Die die2;
   
   private int diceTotal;
   private int die1FaceValue;
   private int die2FaceValue;
   
   // constructors
   
   public Dice()
   {
      die1 = new Die();      
      die2 = new Die();
   }
   
   // methods
   
   /**
    * This method rolls dice.
    * @return int
    */
   public int roll() 
   {
      
      die1FaceValue = die1.roll();
      die2FaceValue = die2.roll();
      
      diceTotal = die1FaceValue + die2FaceValue;
      
      return diceTotal;
   }
   
   /**
    * This method gets the face value.
    * @return int
    */
   public int getDie1FaceValue()
   {
      return die1FaceValue;
   }
   
   /**
    * This method gets the face value.
    * @return int
    */
   public int getDie2FaceValue()
   {
      return die2FaceValue;
   }
   
   /**
    * This method gets the dice total.
    * @return int
    */
   public int getDiceTotal()
   {
      return diceTotal;
   }
   
   /**
    * This method writes string.
    * @return String
    */
   public String toString()
   {
      return "Die one is " + die1FaceValue +
         " and die two is " + die2FaceValue +
         " and dice total is " + diceTotal + "." ;
   }
 
}