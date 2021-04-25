/**
 * Library Book
 */

public class LibraryBook
{
   // properties
   
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;
   
   // constructors
   
   public LibraryBook( String theTitle, String theAuthor )
   {
      title = theTitle;
      author = theAuthor;
      dueDate = "";
      timesLoaned = 0;
   }
   
   public LibraryBook( LibraryBook theBook )
   {
      title = theBook.getTitle();
      author = theBook.getAuthor();
      dueDate = theBook.getDueDate();
      timesLoaned = theBook.getTimesLoaned();
   }
   
   // methods
   
   /**
    * This method gets the title.
    * @return String
    */
   public String getTitle()
   {
      return title;
   }
   
   /**
    * This method gets the author.
    * @return String
    */
   public String getAuthor()
   {
      return author;
   }
   
   /**
    * This method gets the due date.
    * @return String
    */
   public String getDueDate()
   {
      return dueDate;
   }
   
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
      
         dueDate = theDueDate;
         System.out.println( title + " is loaned until " + theDueDate );
         timesLoaned++;
   }
   
   /**
    * This method helps to return the book.
    */
   public void returned()
   {
      if ( !dueDate.equals( "" ) )
      {
         System.out.println( title + " is returned.\n" );
         dueDate = "";
      }
      else
         System.err.println( title + " hasn't been loaned yet.\n" );
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
   
   /**
    * This method compares two books.
    * @return boolean
    */
   public boolean equals( LibraryBook theBook )
   {
      if ( title.equals( theBook.getTitle() ) && author.equals( theBook.getAuthor() ) )
         return true;
      else
         return false;
   }
   
   /**
    * This method compares titles.
    * @return boolean
    */
   public boolean hasSameTitle( LibraryBook theBook )
   {
      if ( title.equals( theBook.getTitle() ) )
         return true;
      else
         return false;
   }
   
   /**
    * This method compares author.
    * @return boolean
    */
   public boolean hasSameAuthor( LibraryBook theBook )
   {
      if ( author.equals(theBook.getAuthor() ) )
         return true;
      else
         return false;
   }
   
}