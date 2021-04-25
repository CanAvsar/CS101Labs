import java.util.Scanner;

//Character Triangle
//Can Avþar
//30.10.2019

public class Lab04d
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // Constants

      // Variables
      
      String ch;
      int width;
      int a;
      int b;
      double d;
      
      // Program Code
      
      // TRIANGLE TASK----------------------------------------------------------
      
      System.out.println( "TRIANGLE TASK" );
      
      System.out.println( "Enter a character." );
      ch = scan.next();
      
      System.out.println( "Enter a width." );
      width = scan.nextInt();
      a = 1;
      
      while ( a <= width )
      {
         b = 1;
         
         while ( b <= a )
         {
            System.out.print( ch );
            b = b + 1;
         }
         
         System.out.println();
         a = a + 1;
         
      }
      
      System.out.println();
      
      // PREDICTON TASK---------------------------------------------------------
     
      System.out.println( "PREDICTION TASK" );
      
      d = 0.1;
     
      while ( d < 1.0 )
      {
         System.out.println( d );
         d = d + 0.1;
      }
      
      System.out.println( d + " <- final value after loop!" );
   }
}
// End Class