/**
 * Library Book
 */

public class LibraryBook
{
   // properties
   
   private String title;
   String author;
   String dueDate;
   int timesLoaned;
   
   // constructors
   
   public LibraryBook( String theTitle, String theAuthor )
   {
      title = theTitle;
      author = theAuthor;
      dueDate = "";
      timesLoaned = 0;
   }
   
   // methods
   
   /**
    * This method gets the times loaned.
    * @return int
    */
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   
   /**
    * This method helps to loan the book.
    */
   public void loan( String theDueDate )
   {
      if (!onLoan())
      {
         dueDate = theDueDate;
         System.out.println( title + " is loaned until\n" + theDueDate );
         timesLoaned++;
      }
      else
         System.err.println( title + " is already loaned.\n" );
   }
   
   /**
    * This method helps to return the book.
    */
   public void returned()
   {
      if (onLoan())
      {
         System.out.println( title + " is returned.\n" );
         dueDate = "";
      }
      else
         System.err.println( title + " hasn't been loaned yet.\n" );
   }
   
   /**
    * This method defines the boolean.
    * @return boolean
    */
   public boolean onLoan()
   {
      boolean ifLoaned;
      
      if ( dueDate.equals(""))
      {
         ifLoaned = false;
      }
      else
      {
         ifLoaned = true;
      }
      return ifLoaned;    
   }
   
   /**
    * This method writes string.
    * @return String
    */
   public String toString()
   {
      return "Title = [" + title + 
         "]  Author = [" + author + 
         "]  Due Date = [" + dueDate +
         "]  Times Loaned =  [" + timesLoaned + "] \n" ;
   }
   
}