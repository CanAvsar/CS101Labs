import java.util.Scanner;

/**
 * Library Simulator
 * @author Can Avsar
 * @version 11 December 2019
 */ 

public class LibraryTest
{
   public static void main( String[] args ) 
   {
      Scanner scan = new Scanner( System.in );
      
      // variables
      
      String input;
      String input2;
      String inputTitle;
      String inputAuthor;
      String dueDate;
      String bookName;
      String bookAuthor;
      
      Library library1;
      
      LibraryBook bookFound;
      
      library1 = new Library();
      
      // program code
      
      do
      {
         System.out.println( "What do you want to do? Select from the menu: \n Press 1 to Show \n Press 2 to Find \n Press 3 to Add \n Press 4 to Exit" );
         
         input = scan.nextLine();  
         
         if ( input.equals( "1" ) )
         {
            if(!library1.isEmpty())
               System.out.println( library1.toString() );
            else
               System.err.println("The library is empty.");
         }
         
         else if ( input.equals("2") )
         {
            if( library1.isEmpty() )
               System.err.println( "Library is empty, please add a book.\n" );
            
            else
            { 
               System.out.println( "Enter the name of the book you want." );
               
               bookName = scan.nextLine();
               
               System.out.println( "Enter the author of the book you want." );
               
               bookAuthor = scan.nextLine();
               
               bookFound = library1.findByTitleAndAuthor( bookName, bookAuthor );
               
               if (bookFound != null)
               {
                  System.out.print( bookFound );
                  
                  do
                  {
                     System.out.println( "What do you want to do? Select from the menu: \n Press 1 to Loan \n Press 2 to Return \n Press 3 to Remove \n Press 4 to Menu" );
                     
                     input2 = scan.nextLine();  
                     
                     if ( input2.equals( "1" ) )
                     {
                        if( bookFound.getDueDate().equals( "" ) )
                        {
                           System.out.println( "Write a due date." );
                           dueDate = scan.nextLine();  
                           bookFound.loan( dueDate );
                        }
                        else
                           System.err.print( "Book is already loaned.\n" );
                     }
                     
                     else  if ( input2.equals( "2" ) )
                     {
                        bookFound.returned();
                     }
                     
                     else if ( input2.equals( "3" ) )
                     {
                        library1.remove( bookFound );
                        System.err.println( "Book removed." );
                     }
                  }
                  while (!input2.equals( "3" ) && !input2.equals( "4" ) );
               }  
               else
                  System.err.print( "Book cannot be found.\n" );
            }
         }
         
         else if ( input.equals( "3" ) )
         {
            System.out.println( "Write the title." );
            inputTitle = scan.nextLine();
            
            System.out.println( "Write the author." );
            inputAuthor = scan.nextLine();
            
            bookFound = library1.findByTitleAndAuthor( inputTitle, inputAuthor );
            
            if ( bookFound != null )
            {
               System.err.print( "There is a book called " + inputTitle + " whose author is "+ inputAuthor + ".\n" );
            }
            else
            {
               library1.add(inputTitle, inputAuthor);
            }
         }
      }
      while( !input.equals( "4" ) );
      
      System.out.print( "Goodbye!" );
      
   }   
   
}