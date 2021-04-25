import java.util.Scanner;

/**
 * __basic calculator___ 
 * @author__canavsar___
 * @version 3.0 __16.10.19__
 */ 

public class lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      
      // variables
      
      double sL1;
      double sL2; 
      double sL3;
      double sP;
      double area;
      int numOfFlowers;
      
      // program code
     
      System.out.println("Welcome to triangle calculator.");
      
      System.out.println("Enter first sidelength:");
      sL1 = scan.nextDouble();
      
      System.out.println("Enter second sidelength:");
      sL2 = scan.nextDouble();
      
      System.out.println("Enter third sidelength:");
      sL3 = scan.nextDouble();
      
      sP = ((sL1 + sL2 + sL3)/2);
       
      area = Math.sqrt(sP *(sP - sL1)*(sP - sL2)*(sP - sL3));
      numOfFlowers = (int)(area * 17);
      System.out.println("The area of the triangle is " + area);
      System.out.println("The maximum number of flowers is " + numOfFlowers);     
   }   
    
  
}
// end class
   
   
  
