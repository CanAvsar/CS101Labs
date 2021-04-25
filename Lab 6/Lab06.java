import java.util.Scanner;

//Methods & Demonstration
//Can Avþar
//6.11.2019

public class Lab06
{
   
   //Power Method
   /**
   * Makes y to the power x.
   * @param x
   * @param y 
   * @return x^y
   */
   public static double power( double x , int y )
   {
      double product = 1;
      for ( int count = 1; count <= y; count++ )
      {
         product = product * x; 
      }
      return product;
   }
   
   //Factorial Method
   /**
   * Makes x factorial.
   * @param e
   * @return x!
   */
   public static int factorial( int e )
   {
      int product = 1;
      int d = e;
      for ( int count = 1; count <= e; count++ )
      {
         product = product * d;
         d = d - 1;
      }
      return product;
   }
   
   //Reverse Method
   /**
   * Makes string reversed.
   * @param name 
   * @return reversed string
   */
   public static String reverse(String name)
   {
      String reverse = "";
      int nL = name.length();
      for( int count = nL-1; count >= 0; count-- ) 
      {   
         reverse = reverse + name.charAt( count );
      }
      return reverse;
   }
   
   //Binary to Decimal Method
   /**
   * Makes binary decimal.
   * @param base2
   * @return decimal form of binary code
   */
   public static int toDecimal( String base2 )
   {
      int bL = base2.length();
      double sum = 0;
      double a = 0;
      int chValue;
      int errorcode = -404;
      
      for( int count = 0; count < bL; count++ )
      {
         char ch = base2.charAt( count );
         chValue = Character.getNumericValue( ch );
         if ( chValue == 0 || chValue == 1 )
         {   
            a = power( 2, bL - count - 1 );
            sum = sum + chValue * a; 
            //multiplying with 2 to the power of count - 1 in order to find decimal digit
         }
         else
            return errorcode; //errorcode is -404 and it will be used to print an error message
      }  
      return ( int ) sum;  
   }
   
   //Decimal to Binary Method
   /**
   * Makes decimal a binary code.
   * @param value
   * @return binary code form of decimal
   */
   public static String toBinary( int value )
   {
      String base2 = "";
      boolean zeroone = false;
      
      for( int count = 31; count >= 0; count-- ) 
         // 2^32 -1 is Largest number in Java and max. 2^31 can be translated into binary 
      {
         int a = ( value / ( int )power( 2,count ) );
         
         if( a == 0 )
         { 
            if ( zeroone == true ) // first 1 digit changes the boolean
            {
               base2 = base2 + '0';   
            }
         }
         else
         {  
            base2 = base2 + '1';
            zeroone = true;
            //after first 1 occurs other 0's will be printed in order to minimalise binary string
            value = value - ( int )power( 2,count );
         }
      }
      return base2;     
   }
   
   //Sin Method
   /**
   * Calculates sin of x.
   * @param x
   * @return sin(x)
   */
   public static double sin( double x )
   {
      double term;
      double sum;
      term = x;
      sum = x;
      double n;
      
      for( n = 1; n < 10 ; n++ )
      {
         term =  term * (((-1)*power( x,2 )) /( ( 2*n + 1 )*( 2*n ))); 
         //sin calculation in terms of previous term
         
          sum = sum + term;
   
      }
      return sum;
   }
   
   //Space Length Method
   /**
   * Prints spaces in order to make a table.
   * @param x ghxv
   * @param y
   * @return spaces as wanted number
   */
   public static String space( double x, int y )
   {
      int length;
      int lengthOfSpace;
      
      length = String.valueOf( x ).length();
      lengthOfSpace = y - length; 
      
      for ( int c = 0; c < lengthOfSpace; c++ )
      {
         System.out.print( " " );          
      }              
      return ( "" );
   }               
   
   //Main Method
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      Scanner scan2 = new Scanner( System.in );
      
      // Program Code
      
      //1st Task----------------------------------------------------------------
      System.out.println( "1st Task\n" );
      
      //Variables
      int n;
      int b;
      int c;
      int value;
      
      for ( n = -1; n <= 10; n++ )
      {
         for ( b = 1; b <= 4; b++ )
         {
            value = (int) power(n,b);
            
            space(value, 10);
            
            System.out.print(value);
         }
         System.out.println();
      }
      System.out.println();
      
      
      //2nd Task----------------------------------------------------------------
      System.out.println( "2nd Task\n" );
      
      for ( n = 1; n <= 15; n++ )
      {
         System.out.print( n );
         value = factorial( n );
         //space (value, 20);
         int length = String.valueOf( value ).length() + String.valueOf( n ).length();
         int lengthOfSpace = 15 - length;
         for ( c=0; c < lengthOfSpace; c++ )
         {
            System.out.print(" ");          
         }
         System.out.println( value );
      }
      System.out.println();
      
      //3rd Task----------------------------------------------------------------
      System.out.println( "3rd Task" );
      
      //Variables
      String b1;
      String b2;
      int d1;
      int d2;
      int sum;
      String bsum;
      
      do
      {
         System.out.println( "Enter a binary code." );
         b1 = scan.next();
         d1 = toDecimal( b1 );
         if ( d1 < 0 )
         {
            System.err.println( "Please enter a proper binary code!" );
         }
      }
      while ( d1 < 0 ); //errorcode is returned as -404 and it is less than zero
      
      do
      {
         System.out.println( "Enter another binary code." );
         b2 = scan.next();
         d2 = toDecimal( b2 );
         if ( d2 < 0 )
         {
            System.err.println( "Please enter a proper binary code!" );
         }
      }
      while ( d2 < 0 ); //errorcode is returned as -404 and it is less than zero
      
      sum = d1 + d2;
      bsum = toBinary( sum );
      
      System.out.print( "Binary of " + b1 + " is " + d1 );
      System.out.println( " and binary of " + b2 + " is " + d2 );
      System.out.print( "Sum of " + d1 + " and " + d2 + " is " + sum );
      System.out.println( " and binary of " + sum + " is " + bsum );
      System.out.println();
      
      //4th Task----------------------------------------------------------------
      System.out.println( "4th Task" );
      
      //Variables
      String text;
      int i;
      char chr;
      String word;
      String reword;
      
      word = "";
      
      System.out.println( "Enter a sentence." );
      text = scan2.nextLine();
      
      for (i = 0; i < text.length(); i++)
      {
         chr = text.charAt( i );
         
         if ( chr == ' ' )
         {
            reword = reverse( word );
            System.out.print( reword + " " );
            word = "";
         }
         else
         {   
            word = word + chr;
         }       
      }
      if( word != "" ) 
         System.out.println( reverse( word ) );
      System.out.println();
      
      
      //5th & 6th Task----------------------------------------------------------
      System.out.println( "5th & 6th Task" );
      
      //Variables
      double sin = 0;
      double a;
      double t;
      double f;
      
      System.out.print( "Enter a value which you want to calculate its sin value." );
      double x = scan.nextDouble();
      
      
      a = power( -1, n );
      t = factorial( 2 * n + 1 );
      f = power ( x, 2 * n + 1 );
      
      for ( n = 1; n <= 10; n++ )
      {
         a = power( -1, n );
         t = factorial( 2 * n + 1 );
         f = power ( x, 2 * n + 1 );
         
         sin = sin + ((a / t) * f); // with the help of Taylor series
         
         //making the table
         space(n,10);
         System.out.print(n);
         space(a,20);
         System.out.print((int)a);
         space(f,30);
         System.out.print(f);
         space( t,30 );
         System.out.print(t);
         System.out.println();
      }    
      
      System.out.println( "Sin calculated with the formula is: " + sin );
      
      double sinn = sin( x );
      System.out.println( "Sin calculated with formula calculated by previous term is: " + sinn );
      
      System.out.println( "Real sin is: " + Math.sin( x ) );
      
   }   
}