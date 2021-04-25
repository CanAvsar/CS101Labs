import java.util.Scanner;

//Types of Pi Calculation
//Can Avþar
//06.11.2019

public class Lab05d
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // Constants

      // Variables
      
      int termNumber;
      int denominator;
      int counter;
      double sum; // sum is pi calculated with term numbers in formula
      double sum2; // sum 2 is pi calculated with 
      double accuracy;
      double difference;
      
      // Program Code
      
      sum = 0;
      counter = 1;
      
      System.out.println( "Enter the term number which you want in formula." );
      termNumber = scan.nextInt();
      
      System.out.println( "Enter the accuracy in calculation." );
      accuracy = scan.nextDouble();
      
      for ( denominator = 1; denominator <= ( termNumber * 2 - 1 ); denominator = denominator + 2 ) // a is denominator
      {   
         if( counter % 2 == 0 )
         {   
            sum = sum - 4.0 / denominator;
            counter = counter + 1;
         } 
         
         else
         {  
            sum = sum + 4.0 / denominator;  
            counter = counter + 1;
         }
      }
      
      denominator = 1;
      counter = 1;
      sum2 = 0;
      
      do
      {   
         if( counter % 2 == 0 )
         {   
            sum2 = sum2 - 4.0 / denominator;
         } 
         
         else
         {  
            sum2 = sum2 + 4.0 / denominator;  
         }
         
         difference = Math.abs( sum2 - Math.PI );
         counter = counter + 1;
         denominator = denominator + 2;
      }
      while ( difference >= accuracy );
      
      System.out.println( "Constant Pi is: " + Math.PI );
      System.out.println( "First pi is " + sum + " calculated with " + termNumber + " terms in formula." );
      System.out.println( "Second pi is " + sum2 + " calculated in a wanted accuracy " + accuracy + "." );
    
   }
}
      