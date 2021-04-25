import java.util.Scanner;

/**
 * __basic calculator___ 
 * @author__canavsar___
 * @version 2.0 __16.10.19__
 */ 

public class lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      
      // variables
      
      String name;
      int age; 
      int salary;
      String comments; 
      
      // program code
     
      comments = scan.nextLine();
      name = scan.next();
      age = scan.nextInt();
      salary = scan.nextInt();
      
      
      System.out.println("<!DOCTYPE html><html>");
      System.out.println("<head>");
      System.out.println("<title>" + name + "'s Home Page");
      System.out.println("</title>");
      System.out.println("</head>");
      System.out.println("<body>");
      System.out.println("<hr><h1>" + name + "</h1>");
      System.out.println("<p>Age: " + age + "</p>");
      System.out.println("<p>Salary: " + salary + "</p>"
      System.out.println("<p>Comments: " + comments + "</p><hr></body></html>");                                                   
   }  
}
// end class
   
   
  
