/**
 * BigNum Test
 * @author Can Avþar
 * @version 18 December 2019
 */ 

public class lab10a
{
      public static void main( String[] args )
      {
            
            // variables
            
            boolean left;
            
            BigNum b0;
            b0 = new BigNum();
            
            BigNum b1;
            b1 = new BigNum("4560");
            
            BigNum b2;
            b2 = new BigNum("9512");
            
            BigNum b3;
            b3 = new BigNum(b1);
            
            BigNum b4;
            b4 = new BigNum(b2);
            
            // program code
            
            System.out.println( "b0 = " + b1.toString() );
            System.out.println( "b1 = " + b1.toString() );
            System.out.println( "b2 = " + b2.toString() );
            System.out.println( "b3 = " + b3.toString() );
            System.out.println( "b4 = " + b4.toString() );
            System.out.println();
            
            System.out.println( "b0 equals zero?: " + b0.isZero() );
            System.out.println( "b1 equals zero?: " + b1.isZero() );
            System.out.println( "b1 equals b2?: " + b1.equals(b2) );
            System.out.println( "b1 equals b3?: " + b1.equals(b3) );
            System.out.println();
            
            left = true;
            b1.shift(left);            
            System.out.println( "b1 shifted to left (seen as shifted as right because array is reversed)\n" + b1 + "\n"  );
            
            left = false;         
            b2.shift(left); 
            System.out.println("b2 shifted to right (seen as shifted as left because array is reversed)\n" + b2 + "\n" );
            
            b3.add( b4 );
            System.out.println("b3 + b4 = " + b3 );
            System.out.println("Overflow is " + b3.add(b4));
               
      }
      
}