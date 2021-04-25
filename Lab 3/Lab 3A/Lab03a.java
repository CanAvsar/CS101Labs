import java.util.Scanner;

// Number Classifier 
// Can Avþar
// Version 2.2
// 23.10.2019

public class Lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      
      int noen; //noen = number of even numbers
      int noon; //noon = number of odd numbers
      int total;
      int fT;
      int n;
      
      // program code
      
      noen = 0;
      noon = 0;
      total = 0;
      n = 0;
      fT = 0;
      
      System.out.println("Welcome to number classifier, please write a number:");
      n = scan.nextInt();
     
      for ( int x = 0; x <= 50; x++ )
      {
         //in range or out of range
         if ( x <= 12 || x >= 25)
         {   
            System.out.println(x + " is out of range 12-25");
         }   
         else
         {   
            System.out.println(x + " is in range 12-25");
         }  
      
         //number of odd and even numbers
         if ( x % 2 == 0)
         {   
            noen = noen + 1;
         }   
         else
         {   
            noon = noon + 1;
         }  
      
         //classify with mod
         if ( x % 5 == 0 )
         {   
            System.out.println(x +" Hi Five");  
         }   
         else if ( x % 2 == 0)
         {   
            System.out.println(x +" Hi Two"); 
         }  
         else if ( x % 3 == 0 || x % 7 == 0  )
         {   
           System.out.println(x + " Hi ThreeOrSeven");
         } 
         if( x <= n ) 
         {
            total = total + x;
         }
      //total comparison   
      }
      fT = ( n * ( n + 1 ) ) / 2; //fT = formula total
      
      System.out.println( "There are " + noen + " even numbers and " + noon + " odd numbers." );  
      if( fT == total )
      {
         System.out.println( "Both totals are equal and " + total );
      }
      else
      {
         System.out.println( "They are not equal. Total is" + total + "and formula total is" + fT );
      }
   }
}