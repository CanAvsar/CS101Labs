import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;

// Webpage Creator
// Can Avþar
// Version 6.0
// 22.10.2019

public class Lab03c
{
   public static void main( String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner( System.in);
      PrintStream originalStdOut = System.out;

      // constants
     
      final String ST1 = "<!DOCTYPE html>";
      final String ST2 = "<html>";
      final String ST3 = "<head>";
      final String ST4 = "<title>";
      final String ST5 = "<body>";
      final String ST6 = "<hr>";
      final String ST7 = "<h1>";
      final String ST8 = "<p>";
      final String ST9 = "</head>";
      final String ST10 = "</title>";
      final String ST11 = "</h1>";
      final String ST12 = "</p>";
      final String ST13 = "</html>";
      final String ST14 = "</body>";
      
      // variables
      
      String name;
      int age;
      int salary;
      String comments;
     
     
      // program code
      
      System.out.println( "Enter your name:" );
      name = scan.nextLine();
      System.out.println( "Age:" );
      age = scan.nextInt();
      System.out.println( "Salary:" );
      salary = scan.nextInt();
      System.out.println( "Comments:" );
      comments = scan.nextLine();
      comments = scan.nextLine();
      
      if ( age > 0 && salary < 0 )
      {
      System.setOut( new PrintStream( "magic.htm" ) );
      
      System.out.println(ST1);
      System.out.println(ST2);
      System.out.println(ST3);
      
      System.out.println(ST9);
      System.out.println(ST5);
 
      
      //website
      System.out.println(ST6);
      
      String photo = name + ".jpg";
      
      if (Files.exists (Paths.get(photo)))
      {   
         System.out.println( "<img src=" +photo+ ">" );
      }
      else 
      {
         System.out.println( "Image not found." );
      }  
         
      System.out.print(ST7);
      System.out.print(name +  "'s Website" );
      System.out.println(ST11);

      //name
      System.out.print(ST8);
      System.out.print("Name: " + name);
      System.out.println(ST12);

      //age
      System.out.print(ST8);
 
     
      System.out.print( age );
 
      
      System.out.println(ST12);
      
      //salary
      System.out.print(ST8);
      
      
      if ( salary < 1000 )
      {
         salary = ( salary - 100 ) * 95/100;
         System.out.print(salary + " and the tax rate is %5.");
      }
      else if ( salary >= 1000 && salary  <= 5000 )
      {  
         salary = ( salary - 100) * 85/100;
         System.out.print(salary + " and the tax rate is %15.");
      }
      else if ( salary > 5000 && salary <= 10000 )
      {   
         salary = (salary - 100) * 75/100;
         System.out.print(salary + " and the tax rate is %25.");
      }           
      else if (salary > 10000)
      {   
         System.out.println("ERROR: The salary can't be more than 10000.");
      }
      System.out.println(ST12);
      
      //comments
      System.out.print(ST8);
      System.out.print( comments );
      System.out.println(ST12);

      System.out.println(ST14);
      System.out.println(ST13);
      
      System.out.close();
      System.setOut( originalStdOut);
      System.out.println( "Webpage created.");
      }
     else
     {
      System.out.println("ERROR");  
     }
      }
      
}

   
   
  
