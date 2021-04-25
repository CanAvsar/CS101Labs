/**
 * Library Book Loaning 
 * @author Can Avsar
 * @version 27 November 2019
 */ 
public class TestLibraryBook
{
   public static void main( String[] args )
   {
      
      // constants
      
      // variables
      
      LibraryBook book1;
      LibraryBook book2;
      
      book1 = new LibraryBook( "The Martian", "Andy Weir" );
      book2 = new LibraryBook( "Brave New World", "Aldous Huxley" );
      
      // program code
      
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
      
   }
   
}