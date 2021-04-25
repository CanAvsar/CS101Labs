import java.util.Scanner;

//Numbers
//Can Avþar
//30.10.2019

public class Lab04a
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // Constants

      // Variables
      
      int n;
      int m;
      double t;
      int k;
      
      // Program Code

      System.out.println( "Please enter an integer." );
      n = scan.nextInt();
      
      if ( n > 0 )
      {
         
         // 1ST TASK------------------------------------------------------------
         
         m = 0;
         System.out.println( "1ST TASK" );
         
         while ( m < n )
         {
            System.out.print( m + " " );
            m = m+1;
         }
         
         // 2ND TASK------------------------------------------------------------
         
         m = 0;
         System.out.print( "\n\n" );
         System.out.println( "2ND TASK" );
         
         while ( m < n )
         {
            System.out.print( m + " " );
            m = m + 1;
            
            if(m % 5 == 0)
            System.out.println();
         }
         
         // 3ND TASK------------------------------------------------------------       
         
         m = n;
         System.out.print( "\n\n" );
         System.out.println( "3RD TASK" ); 
        
         while ( m <= n && m >= 0 )
         {
            System.out.print( m + " " );
            m = m - 1; 
         }       
         
         // 4TH TASK------------------------------------------------------------
         
         m = -n;
         System.out.print( "\n\n" );
         System.out.println( "4TH TASK" );
         
         while ( m <=n )
         {
            if ( m % 2 == 0)
            {
               System.out.print(m + " "); 
            }
         m = m + 1;
         } 
         

         // 5TH TASK------------------------------------------------------------
         
         m = 0;
         k = 0;
         System.out.print( "\n\n" );
         System.out.println( "5TH TASK" );
         
         while (m < n)
         {
            if ( m % 2 == 0 )
            {
               System.out.print( m * m + " " );
               k = k + 1;
               if ( k % 5 == 0 )
               {
                  System.out.println();
               }  
            }  
            m = m + 1;
         }
         
         // 6TH TASK------------------------------------------------------------
         
         m = n;
         k = 0;
         System.out.print( "\n\n" );
         System.out.println( "6TH TASK" );
         
         while ( m <= n && m >= 3)
         {
            if (( m % 3 == 0 || m % 4 ==0) && (m % 12 !=0 ))
            {
               System.out.print( m + " " );
               k = k + 1;
               if(k % 5 == 0)
               {
                  System.out.println();
               }
            }
            m = m - 1;   
          }
         
         // 7TH TASK------------------------------------------------------------
         
         m = 4;
         System.out.print( "\n\n" );
         System.out.println( "7TH TASK" );
         
         while (m <= n)
         {
            if ( n % m == 0)
            {
            System.out.print( m + " " );
            }
            m = m + 1;
         }
         
         // 8TH TASK------------------------------------------------------------
         
         m = n;
         System.out.print( "\n\n" );
         System.out.println( "8TH TASK" ); 
        
         while ( m > 0 )
         {
            t = 1/(1.0 * m);
            
            if ( t > 0.01 )
            {   
            System.out.printf("%.2f ", t);
            }
            m = m - 1; 
         } 
         
         //---------------------------------------------------------------------
      
    }     
      
      else
      {
         System.out.println( "The value n must be positive." );         
      }    
   }
}
// End Class