import java.util.Scanner;

/**
 * __basic calculator___ 
 * @author__canavsar___
 * @version 2.0 __16.10.19__
 */ 

public class lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      
      // variables
      
      int number1;
      int number2; 
      
      // program code
     
      System.out.println("Welcome to basic calculator.");
      
      System.out.println("Enter a number:");
      number1 = scan.nextInt();
      
      System.out.println("Enter another number:");
      number2 = scan.nextInt();
      
      System.out.print("The total is:");
      System.out.println(number1 + number2);
      
      System.out.print("The difference is:");
      System.out.println(number1 - number2);
      
      System.out.print("The product is:");
      System.out.println(number1 * number2); 
     
      System.out.print("The division is:");
      System.out.println((double) number1 / number2);
      
      System.out.println("Greater integer is: " + Math.max(number1, number2));
      System.out.println("Less integer is: " + Math.min(number1, number2));
  
      System.out.print("The division is:");
      System.out.println( number1 % number2);
   }   
    
}
// end class
   
   
  
