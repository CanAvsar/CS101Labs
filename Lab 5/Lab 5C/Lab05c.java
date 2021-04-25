import java.util.Scanner;

//Simple Calculator
//Can Avþar
//06.11.2019

public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
   
      // variables
      
      double result;
      char operation;
      double value;
      String input;
      
      // program code
      
      result = 0;
      input = " ";
      operation = 'c';
      value = 0;
      
      do
      {
         
         System.out.println( "--------------------------" );
         System.out.println( "[" + result + "]" );
         System.out.println( "--------------------------" );
         System.out.println( "+,-,*,/ value" + "\n" + "Quit!" + "\n" + "Clear!" + "\n" );
         System.out.print( "Select: " );   
         input = scan.nextLine();
         
         if ( input.charAt(0) == 'c' || input.charAt(0) == 'C' )
         {
            result = 0.0;
         }
        
         else if ( input.charAt(0) == 'q' || input.charAt(0) == 'Q' ) 
         { 
            System.out.println( "Goodbye!" );
         }
         
         else 
         {
            operation = input.charAt(0);
           
            if ( input.length() >= 3 )
            {   
            value = Double.valueOf(input.substring( 2 , input.length() ));
            }
            
            if ( operation == '+' )
            {
               result = result + value;
            }
            
            else if ( operation == '-' )
            {
               result = result - value;
            }
            
            else if ( operation == '/' )
            {
               result = result / value;
            }
           
            else if ( operation == '*' )
            {
               result = result * value;
            }
            
            else
            {
               System.out.println( "Invalid input." );
            } 
         }
      }
      while ( input.charAt(0) != 'q' && input.charAt(0) != 'Q' );
   }
}
