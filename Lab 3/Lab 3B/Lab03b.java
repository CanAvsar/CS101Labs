import java.util.Scanner;

// Basic Triangle Calculator
// Can Avþar
// Version 4.0
// 23.10.2019

public class Lab03b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      
      double a;
      double b; 
      double c;
      double sP;
      double area;
      int fC;
      
      // program code
     
      System.out.println( "Welcome to the basic triangle calculator." );
      
      System.out.println( "Enter the first sidelength:" );
      a = scan.nextDouble();
      
      System.out.println( "Enter the second sidelength:" );
      b = scan.nextDouble();
      
      System.out.println( "Enter the third sidelength:" );
      c = scan.nextDouble();
      
      sP = (( a + b + c )/2 ); //sP = semi parameter
       
      area = Math.sqrt( sP *( sP - a )*( sP - b )*( sP - c ));
      
      if ( a < b + c && b < a + c && c < a + b )
      {   
         fC = ( int )( area * 17 ); //fC = flower count: maximum number of flowers in area
     
         System.out.println( "The area of the triangle is " + area );
      
         System.out.println( "The maximum number of flowers is " + fC );     
      }
      else
      {      
        System.out.println( "This values can't form a triangle." );
      }   
    }  
}

   
   
  
