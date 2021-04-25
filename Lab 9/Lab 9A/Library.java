import java.util.ArrayList;

/**
 * Library Book
 */

public class Library
{
      // properties
      
      ArrayList<LibraryBook> books;
      
      // constructors
      
      public Library()
      {
            books = new ArrayList<LibraryBook>();
      }
      
      // methods
      
      /**
       * This method checks if ArrayList is empty.
       * @return boolean
       */
      public boolean isEmpty()
      {
            if ( books.size() == 0 )
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
            return books.toString();
      }
      
      /**
       * This method adds a new book.
       */
      public void add( String title, String author)
      {
            LibraryBook book;
            book = new LibraryBook( title, author );
            books.add( book );
      }
      
      /**
       * This method removes a book.
       * @return boolean
       */
      public boolean remove( LibraryBook book )
      {
            LibraryBook gotBook;
            
            for ( int i = 0; i < books.size(); i++ )
            {
                  gotBook = books.get(i);
                  if ( gotBook == book )
                  {
                        books.remove(i);
                        return true;
                  }  
            }
            return false;     
      }
      
      /**
       * This method finds a book by its title and author.
       * @return LibraryBook 
       */
      public LibraryBook findByTitleAndAuthor( String title, String author )
      {
            
            
         for ( LibraryBook gotBook: books )
            {
                  
                  if ( gotBook.getTitle().equals( title ) &&  gotBook.getAuthor().equals( author ) )
                  {
                        return gotBook;
                  }  
            }    
            return null;
      }
      
}