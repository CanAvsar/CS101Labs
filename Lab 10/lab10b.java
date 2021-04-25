import java.util.Scanner;

/**
 * Biggest BigNum
 * @author Can Avþar
 * @version 18 December 2019
 */ 

public class lab10b
{
      public static void main( String[] args )
      {
            Scanner scan = new Scanner( System.in );
            
            // constants
            
            // variables
            
            int randomNumber;
            int n;
            char[] str;
            str = new char[BigNum.SIZE];
            
            BigNum biggestNum;
            BigNum tempBigNum;
            
            // program code
            
            BigNum[] numbers;
            numbers = new BigNum[10];
            
            for ( int i = 0; i < 10; i++ )
            {
                  
                  for ( int k = 0; k < BigNum.SIZE; k++ )
                  {
                        randomNumber = ( int ) Math.floor( Math.random() * BigNum.BASE );
                        str[k] = Character.forDigit( randomNumber, BigNum.BASE );
                  }
                  
                  String string = new String(str);
                  numbers[i] = new BigNum(string);
                  System.out.println(i + ":  " + numbers[i].toString() );
            }
            
            System.out.println( "\n" );
            System.out.println( "Enter the value that you want to search for the biggest BigNum." );
            n = scan.nextInt();
            
            if (n>BigNum.SIZE)
                  System.err.println("The value can't be bigger than size.");
            else
            {
                  while ( n > 0 )
                  {      
                        
                        biggestNum =  numbers[0];
                        int loc = 0;
                        
                        for ( int i = 1; i < n; i++ )
                        {
                              if ( biggestNum.isLessThan( numbers[i]) )
                              {
                                    biggestNum =  numbers[i];
                                    loc = i;
                              }
                              
                        }
                        
                        System.out.println( "Biggest number is " + biggestNum.toString() + " and it is in the location " + loc +
                                           "\nand it is changed with the value in location" + (n-1) + "\n" );
                        
                        tempBigNum = numbers[n-1];
                        
                        numbers[n-1] = numbers[loc];
                        
                        numbers[loc] = tempBigNum;   
                        
                        for ( int i = 0; i < 10; i++ )
                        {
                              System.out.println( i + ":  " + numbers[i].toString() );
                        }
                        
                        System.out.println( "Enter the value that you want to search for the biggest BigNum." );
                        n = scan.nextInt();
                        
                  }
            }
            System.out.println( "Goodbye!" );
            
      }
}