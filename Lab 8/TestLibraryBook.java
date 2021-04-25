/**
 * Library Book Loaning 
 * @author Can Avsar
 * @version 4 December 2019
 */ 

public class TestLibraryBook
{
   public static void main( String[] args )
   {
      
      // constants
      
      // variables
      
      LibraryBook b1;
      LibraryBook b2;
      LibraryBook b3;
      LibraryBook b4;
      LibraryBook b5;
      
      b1 = new LibraryBook( "The Martian", "Andy Weir" );
      b2 = new LibraryBook( "Brave New World", "Aldous Huxley" );
      b3 = b1;
      b4 = new LibraryBook( "Brave New World", "Aldous Huxley" );
      b5 = new LibraryBook( b2 );
      
      
      // program code
      
      System.out.println( "Book 1 == Book 3 : " + ( b1 == b3 ) );
      System.out.println( "Book 1 equals Book 3? : " + b1.equals( b3 ) );
      
      System.out.println( "Book 1 ==  Book 2? : " + ( b1 == b2 ) );
      System.out.println( "Book 1 equals Book 2? : " + b1.equals( b2 ) );
      
      System.out.println( "Book 2 == Book 4? : " + ( b2 == b4 ) );
      System.out.println( "Book 2 equals Book 4? : " + b2.equals(b4) );
      
      System.out.println( "Book 2 has same title Book 4? : " + b2.hasSameTitle( b4 ) );
      
      System.out.println( "Book 1 has same author Book 3? : " + b1.hasSameAuthor( b3 ) );
      
      System.out.println( "Book 2 equals Book 5? : " + b2.equals( b5 ) );
      
      
      // old program code  
      
      /*
       System.out.println( book1 );
       System.out.println( book2 );
       
       book1.loan( "30 November 2019" );
       System.out.println( book1 );
       
       book1.loan( "3 December 2019" );
       System.out.println( book1 );
       
       book1.returned();
       System.out.println( book1 );
       
       book1.returned();
       book2.returned();
       */
      
   }
   
}