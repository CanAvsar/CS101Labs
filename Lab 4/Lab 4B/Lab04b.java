import java.util.Scanner;

//Number Calculator
//Can Avþar
//30.10.2019

public class Lab04b
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // Constants

      // Variables
      
      int n;
      int m;
      int k;
      int sum;
      double average;
      int max;
      int min;
      
      // Program Code
      
      n = 5;
      m = 0;
      sum = 0;
      max = Integer.MIN_VALUE;
      min = Integer.MAX_VALUE;
      
      while ( m < n )
      {
      k = scan.nextInt();
      
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
       //System.out.println(k); 
      
      sum = sum + k;
      }
      
      average = sum / n;
      
      System.out.println( "The sum of " + n + " numbers is " + sum + "." );
      System.out.println( "The average of " + n + " numbers is " + average + "." );
      System.out.println( "The maximum number is " + max + "." ); 
      System.out.println( "The minimum number is " + min + "." );     
      
   }
}
// End Class