import java.util.Scanner;
import java.util.ArrayList;

/**
 * Histogram Creator
 * @author Can Avsar
 * @version 11 December 2019
 */ 
public class DiceHistogramTest
{
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      int numberOfRolls;
      numberOfRolls = scan.nextInt();
      

      // constants
      
      // variables
      
      Dice dice;
      ArrayList<Integer> rollData;
      
      // program code
      
     
      
      rollData = new ArrayList<Integer>();
      
      // for not getting an java out of bounds exception, we add 11 zeros for making its size 11 ( 2 to 12)
      
      for ( int i = 0; i < 11; i++ )
      {
         rollData.add( 0 );
      }
      
      dice = new Dice();
      
      System.out.println(frequencyData( rollData, numberOfRolls, dice) );
      
      System.out.println(printHistogram( rollData, numberOfRolls ) );
   }
   
   /**
    * This method calculates frequency.
    * @return ArrayList
    */
   public static ArrayList frequencyData( ArrayList<Integer> rollData, int numberOfRolls, Dice dice) 
   {
      int sum;

      for ( int i = 0; i < numberOfRolls; i++ )
      {
         sum = dice.roll();
         
         rollData.set( sum - 2, (int)rollData.get( sum - 2 ) + 1 );
         
      }
      
      return rollData;
      
   }
   
   /**
    * This method creates histogram.
    * @return String
    */
   public static String printHistogram( ArrayList<Integer> rollData, int numberOfRolls) 
   {
      int max;
      int value;
      int represent;
      ArrayList<Integer> starCounts;
      String histogram;
      
      
      max = -1;
      
      for ( int i = 0; i < rollData.size(); i++ )
      {
         if ( (int) rollData.get( i ) > max)
         {
            max = (int) rollData.get( i );
         }
      }
      
      represent =( ( (int) max / 10) + 1);
      
      starCounts = new ArrayList<Integer>();
      
      for ( int i = 0; i < rollData.size(); i++ )
      {
         int count = (int) rollData.get(i) / represent;
         
         starCounts.add( count);
      }
      
      // histogram is defined as a string
      
      histogram = "";
      
      for ( int i = 10; i > 0; i--)
      {
         for ( int k = 0; k <= 10; k++ )
         {
            value = starCounts.get( k ); //gets the value of star count 
            
            if (  value >= i )
               histogram = histogram + "* ";
            else
               histogram = histogram + "  ";
         }
         
         histogram = histogram + "\n";
      } 
      
      System.out.println( starCounts);
      
      System.out.println( "Frequency Distribution\nfor " + numberOfRolls + " Dice rolls ( max freq is " + max + ")");
      return histogram;
      
   }
   
   
}