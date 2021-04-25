/**
 * Library Book
 */

public class Library
{
   // properties
   
   private LibraryBook b1;
   private LibraryBook b2;
   private LibraryBook b3;
   private LibraryBook b4;
   
   // constructors
   
   public Library()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   // methods
   
   /**
    * This method checks if it is empty.
    * @return boolean
    */
   public boolean isEmpty()
   {
      if ( b1 == null && b2 == null && b3 == null && b4 == null )
      {   
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
    * This method returns a string representation.
    * @return String
    */
   public String toString()
   {
      
      String a;          
      a = "";                   
      if ( !isEmpty() )
      {     
         if ( b1 != null )
            a = a + b1.getTitle() +  ",  "  + b1.getAuthor() + "\n";
         
         if (b2 != null)
            a = a + b2.getTitle() +  ",  "  + b2.getAuthor() + "\n";
         
         if (b3 != null)
            a = a + b3.getTitle() +  ",  "  + b3.getAuthor() + "\n";
         
         if (b4 != null)
            a = a + b4.getTitle() +  ",  "  + b4.getAuthor() + "\n";
         
         return a ;
      }
      else
      {
         System.err.println( "Library is empty, please add a book." );
         return "";
      }
   }
   
   /**
    * This method adds a new book.
    */
   public void add( String title, String author)
   {
      if ( b1 == null )
      {
         b1 = new LibraryBook ( title, author );
         System.out.println( b1 );
      }
      else if ( b2 == null )
      {
         b2 = new LibraryBook ( title, author );
         System.out.println( b2 );
      }
      else if ( b3 == null )
      {
         b3 = new LibraryBook ( title, author );
         System.out.println( b3 );
      }
      else if ( b4 == null )
      {
         b4 = new LibraryBook ( title, author );
         System.out.println( b4 );
      }
      else
      {  
         System.err.println( "A book must be removed -- there's no place." );
      } 
   }
   
   /**
    * This method removes a book.
    * @return boolean
    */
   public boolean remove( LibraryBook book )
   {
      if ( book.equals( b1 ) )
      {
         b1 = null;
         return true;
      }
      else if ( book.equals( b2 ) )
      {
         b2 = null;
         return true;
      }
      else if ( book.equals( b3 ) )
      {
         b3 = null;
         return true;
      }
      else if ( book.equals( b4 ) )
      {
         b4 = null;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
    * This method finds a book by its title.
    * @return LibraryBook 
    */
   public LibraryBook findByTitle( String title, String author )
   {
      if ( b1 != null )
      {
         if ( b1.getTitle().equals( title )&& b1.getAuthor().equals( author ) )
         {
            return b1;
         }
      }
      
      if( b2 != null )
      {
         if ( b2.getTitle().equals( title ) && b2.getAuthor().equals( author ) )
         {
            return b2;
         }
      }
      
      if( b3 != null )
      {
         if ( b3.getTitle().equals( title ) && b3.getAuthor().equals( author ) )
         {
            return b3;
         }
      }
      
      if( b4 != null )
      {     
         if ( b4.getTitle().equals( title ) && b4.getAuthor().equals( author ) )
         {
            return b4;
         }
      }
      return null;
   }
   
   /**
    * This method finds a book by given title.
    * @return boolean 
    */
   public boolean isTitleExist( String givenTitle )
   {
      if ( b1 != null )
      {
         if ( b1.getTitle().equals( givenTitle ) )
         {
            return true;
         }
      }
      
      if( b2 != null )
      {
         if ( b2.getTitle().equals( givenTitle ) )
         {
            return true;
         }
      }
      
      if( b3 != null )
      {
         if ( b3.getTitle().equals( givenTitle ) )
         {
            return true;
         }
      }
      
      if( b4 != null )
      {     
         if ( b4.getTitle().equals( givenTitle ))
         {
            return true;
         }
      }
      return false;
   }
   
   /**
    * This method finds a book by given title.
    * @return boolean 
    */
   public boolean isAuthorExist( String givenAuthor )
   {
      if ( b1 != null )
      {
         if ( b1.getAuthor().equals( givenAuthor ) )
         {
            return true;
         }
      }
      
      if( b2 != null )
      {
         if ( b2.getAuthor().equals( givenAuthor ) )
         {
            return true;
         }
      }
      
      if( b3 != null )
      {
         if ( b3.getAuthor().equals( givenAuthor ) )
         {
            return true;
         }
      }
      
      if( b4 != null )
      {     
         if ( b4.getAuthor().equals( givenAuthor ) )
         {
            return true;
         }
      }
      return false;
   }
   
}