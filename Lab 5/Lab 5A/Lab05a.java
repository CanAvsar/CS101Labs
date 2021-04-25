import java.util.Scanner;

//Shapes
//Can Avşar
//06.11.2019

public class Lab05a
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // Constants

      // Variables
      
      int width;
      int height;
      int wallThickness;
      int counter1;
      int counter2;
      String answer;
      
      // Program Code
      
      do
      {
      
         System.out.println( "Welcome!" );
         
         System.out.println( "Enter a width." );
         width = scan.nextInt();
      
         System.out.println( "Enter a height." );
         height = scan.nextInt();
      
         System.out.println( "Enter a wall thickness." );
         wallThickness = scan.nextInt();
      
         if ( width == 0 || height == 0 || wallThickness == 0 )
         {
            System.out.println( "All values must be positive." );
         }
      
         else if ( ( 2 * wallThickness ) >= width ||  ( 2 * wallThickness ) >= height )
         {
            for ( counter1 = 1; counter1 <= height; counter1++ )
            {
               for ( counter2 = 1; counter2 <= width; counter2++ )
               {
                  System.out.print( "*" );
               }
               System.out.println();
            }
            System.out.println( "There is no hole." );
         }  
      
         else
         {   
         
            for ( counter1 = 1; counter1 <= wallThickness; counter1++ )
            {
               for ( counter2 = 1; counter2 <= width; counter2++ )
               {
                  System.out.print( "*" );
               }
               System.out.println();
            }
      
            for ( counter1 = 1; counter1 <= (height - 2 * wallThickness); counter1++ )
            {
               for ( counter2 = 1; counter2 <= wallThickness; counter2++ )
               {
                  System.out.print( "*" );
               }
         
               for ( counter2 = 1; counter2 <= (width - 2 * wallThickness); counter2++ )
               {
                  System.out.print( " " );
               }
         
               for ( counter2 = 1; counter2 <= wallThickness; counter2++ )
               {
                  System.out.print( "*" );
               }
               
               System.out.println();
            } 
      
            for ( counter1 = 1; counter1 <= wallThickness; counter1++ )
            {
               for ( counter2 = 1; counter2 <= width; counter2++ )
               {
                  System.out.print( "*" );
               }
               System.out.println();
            }
         }
     
         System.out.println( "Do you want to continue? If yes, press Y.");
         answer = scan.next();
      } 
      
      while ( answer.equals("Y") || answer.equals("y") ); 
      System.out.println("Goodbye!");  
   
   } 
}