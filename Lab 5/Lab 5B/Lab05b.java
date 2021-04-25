import java.util.Scanner;

//Numeric Table
//Can Avþar
//06.11.2019

public class Lab05b
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // Constants
      
      final int CELL = 6;

      // Variables
      
      int row;
      int column;
      int counter1;
      int counter2;
      int counter3;
      int counter4;
      int lengtha;
      int lengthb;
      int lengthTotal;
      int lengthOfSpace;
      int lengthab;
      String numbers;
 
      // Program Code
      
      System.out.println( "Welcome!" );
      
      System.out.print( "Enter a row count." );
      row = scan.nextInt();
      
      System.out.print( "Enter a column count." );
      column = scan.nextInt();
   
         if ( row == 0 || column == 0 )
         {
            System.out.println( "All values must be positive." );
         }
      
         else
         {   
         
            //1st Task----------------------------------------------------------
            
            System.out.println( "1st Task" + "\n" );
            
            for ( counter1 = 1; counter1 <= row; counter1++ )
            {
               for ( counter2 = 1; counter2 <= column; counter2++ )
               {
                  numbers = counter1 + "," + counter2;
                  
                  lengthOfSpace = ( CELL - numbers.length() );
                 
                  for ( counter3 = 0; counter3 < lengthOfSpace; counter3++ )
                  {
                     System.out.print( " " );
                  }
                  System.out.print( counter1 + "," + counter2 );  
               }
               System.out.println();
            }
            System.out.println();
            
            //2nd Task----------------------------------------------------------
            
            System.out.println( "2nd Task" + "\n" );
            
            for ( counter1 = 1; counter1 <= row; counter1++ )
            {
               for ( counter2 = 1; counter2 <= column; counter2++ )
               {
                  lengthab = String.valueOf( counter1 * counter2 ).length();
                  lengthOfSpace = CELL - lengthab;
                  
                  // numbers = counter1 + "*" + counter2;
                  // lengthOfSpace = (CELL - intNumbers.length());
                  // not working in this time because int cannot be changed to string
                  
                  for ( counter3 = 0; counter3 < lengthOfSpace; counter3++ )
                  {
                  System.out.print( " " );
                  }
                  System.out.print( counter1 * counter2 );
                  
               }
               System.out.println();
            }
            System.out.println();
            
            //3rd Task----------------------------------------------------------
            
            System.out.println( "3rd Task" + "\n" );
            
            counter4 = 0;
            
            for ( counter1 = 0; counter1 < row; counter1++ )
            {
               for ( counter2 = 0; counter2 < column; counter2++ )
               {
                  System.out.print( counter4 );
                  
                  lengthab = String.valueOf( counter4 ).length();
                  lengthOfSpace = CELL - lengthab;
                  
                  if ( counter2 < column - 1 )
                  {
                     System.out.print( "," );
                  } 
                  
                  for ( counter3 = 0; counter3 < lengthOfSpace; counter3++ )
                  {
                     System.out.print( " " );
                  }
                  
                  counter4 = counter4 + 1;
               }
               System.out.println();
            }
            System.out.println();
            
            //4th Task----------------------------------------------------------
            
            System.out.println( "4th Task" + "\n" );
               
            for ( counter1 = 1; counter1 <= row; counter1++ )
            {
               System.out.print(counter1);
              
               for ( counter2 = 1; counter2 <= column - 1; counter2++ )
               {
                  System.out.print( ",-"); 
               }
               System.out.println();
            }
            System.out.println();
         }
   } 
}