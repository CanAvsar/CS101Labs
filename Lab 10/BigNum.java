/**
 * Little Big Numbers
 */

public class BigNum
{
      // properties
      
      public static final int SIZE = 4;
      public static final int BASE = 10;
      
      int[] digits;
      
      // constructors
      
      /**
       * Creates a new BigNum.
       */
      public BigNum()
      {
            digits = new int[ SIZE ];
      }
      
      /**
       * Creates a new BigNum by rearranging the digits of the given number.
       * @param number the value which we are going to use its digits
       */
      public BigNum( String number )
      {
            this();
            
            char digit;
            int digitNumber;
            int k;
            
            if ( number.length() > SIZE)
            {
                  System.err.println( "Number of digits can't be bigger than " + SIZE + "!" );
            }
            else
            {
                  k = 0;
                  
                  for ( int i = ( number.length() - 1 ); i >= 0; i-- )
                  {
                        
                        digit = number.charAt(i);
                        digitNumber = Character.getNumericValue(digit);
                        
                        if ( digitNumber >= BASE )
                        {
                              System.err.println( "Digit number can't be bigger than or equal to " + BASE + "!" );
                              i = -1;
                        }
                        else
                        {
                              digits[k] = digitNumber;
                              k++;
                        }
                        
                  }
            }
      }
      
      /**
       * Creates a new BigNum by copying given BigNum.
       * @param bigNum the number which is to be cloned
       */
      public BigNum( BigNum bigNum )
      {
            this();
            
            for ( int i = 0; i < SIZE; i++ )
            {
                  // equals to BigNums digits
                  digits[i] = bigNum.digits[i];
            }
      }
      
      // methods
      
      /**
       * Writes string.
       * @return String BigNum array is returning
       */
      public String toString() 
      {
            String digitsString;
            digitsString = "[";
            
            for ( int i = 0; i < SIZE - 1; i++ )
            {
                  if(digits[i] < 10) // because no numeral exists after 10, we need to translate them into characters
                        digitsString = digitsString + digits[i] + "," ;
                  else
                        digitsString = digitsString + ( char )( digits[i] + 55 ) + ","; // character 55 stars from 10
            }
            
            // this part is out from the for loop, in order to not adding a comma after the last one
            if( digits[SIZE - 1 ] < 10 )
                  digitsString = digitsString + digits[SIZE - 1] ;
            else
                  digitsString = digitsString + ( char )( digits[SIZE - 1] + 55 ); // character 55 stars from 10
            
            return digitsString + "]";
      }
      
      /**
       * Checks equality.
       * @return boolean  true if a BigNum equals another
       * @param other the number whose digits are to be checked
       */
      public boolean equals( BigNum other ) 
      {
            // checks all digits, if any of them is not equal, returns false
            for ( int i = 0; i < SIZE; i++)
            {
                  if ( digits[i] != other.digits[i] )
                  {
                        return false;
                  }   
            }
            return true;
      }
      
      
      /**
       * Checks if it is zero.
       * @return boolean true if a BigNum equals zero
       */
      public boolean isZero() 
      {
            // checks all digits, if any of them is not zero, returns false
            for ( int number : digits )
            {
                  if ( number != 0 )
                  {
                        return false;
                  }   
            }
            return true;
      }
      
      /**
       * Shifts the digits of the BigNum.
       * @param left if it is true, we will shift the BigNum to left
       */
      public void shift( boolean left )
      {
            if (left)
            {
                  for ( int i = SIZE - 2; i >= 0 ; i-- )
                  {
                        digits[i+1] =  digits[i];
                  }
                  //a zero is put into the least-significant-digit's place
                  digits[0] = 0;
            }
            else
            {
                  for ( int i = 0; i <= SIZE - 2 ; i++ )
                  {
                        digits[i] =  digits[i+1];
                  }
                  //a zero is put into the most-significant-digit's place
                  digits[SIZE - 1] = 0;
            } 
      }
      
      /**
       * Adds one BigNum to another.
       * @return int number of overflow
       * @param other the number which added to our BigNum
       */
      public int add( BigNum other )
      {
            int overflow;
            overflow = 0;
            
            for ( int i = 0 ; i <= SIZE - 1; i++ )
            {      
                  // if the sum of the digits is bigger than the base, it adds 1 to the near left digit.
                  if ( digits[i] + other.digits[i] >= BASE )
                  {     
                        digits[i] = (digits[i] + other.digits[i]) - BASE;
                        if ( i == SIZE - 1 )
                        {
                              overflow = 1;
                        }
                        else
                        {
                              digits[i+1] = digits[i+1] + 1;
                              overflow = 0;
                        }
                  }
                  else if ( digits[i] + other.digits[i] < BASE  )
                  {     
                        digits[i] = digits[i] + other.digits[i];
                  }
            }
            return overflow;
      }
      
      /**
       * Compares BigNums.
       * @return boolean true if a BigNum equals another
       * @param other the number whose digits are to be compared
       */
      public boolean isLessThan(BigNum other) 
      {
            for ( int i = SIZE - 1; i >= 0; i-- )
            {
                  // if digits are equal, for loop is going to continue
                  if ( digits[i] < other.digits[i] )
                        return true;
                  else if( digits[i] > other.digits[i] )
                        return false;
            }
             // if all digits are equal, returns false
            return false;
      }
      
}