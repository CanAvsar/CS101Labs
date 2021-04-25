/**
 * Die Rolling
 * @author Can Avsar
 */

public class Die
{
   
   // properties
   
   private int faceValue;
   
   // constructors
   
   public Die()
   {
      faceValue = 0;
   }
     
   //methods
   
   /**
    * This method rolls the die.
    * @return int
    */
   public int roll() 
   {
      faceValue = ( int ) Math.floor( Math.random() * 6 + 1 );
      
      return faceValue;
   }
   
   /**
    * This method gets the face value.
    * @return int
    */
   public int getFaceValue() 
   {  
      return faceValue;
   }
   
   /**
    * This method writes string.
    * @return String
    */
   public String toString()
   {
      return faceValue + "";
   }
   
}