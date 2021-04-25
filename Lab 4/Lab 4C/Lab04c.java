import java.util.Scanner;

//Number Calculator 2.0
//Can Avþar
//30.10.2019

public class Lab04c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // Constants

      // Variables
      
      int m;
      int k;
      int sum;
      double average;
      int max;
      int min;
      boolean negativeNumberFound;
      
      // Program Code
      
      negativeNumberFound = false;
      m = 0;
      sum = 0;
      max = Integer.MIN_VALUE;
      min = Integer.MAX_VALUE;
      
      while ( ! negativeNumberFound )
      {
         k = scan.nextInt();
         if ( k > 0 )
         {
            if (k > max)
            {
               max = k;
            }
      
            if (k < min)
            {
               min = k;
            }   
            m = m + 1;

// If numbers are wanted on screen then:
         //System.out.println( k );
            
            sum = sum + k;
         }
         
         else
         {
            negativeNumberFound = true;
         }
      }
  
      average = sum/m;
  
      System.out.println( "The sum of " + m + " numbers is " + sum + "." );
      System.out.println( "The average of " + m + " numbers is " + average + "." );
      System.out.println( "The maximum number is " + max + "." ); 
      System.out.println( "The minimum number is " + min + "." ); 
          
   }
}
// End Class