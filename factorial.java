import java.util.Scanner;

public class factorial
{
 double i,fact;
 
   public static void main()
   {
      System.out.println("Enter the number: ");
      i=integer.parseInt(System.in);
      fact=factorial.facto(i);
      System.out.println("Factorial"+fact);
   } 
   public static double facto(double fact)
   {
     double result;
     if(fact!=0)
     result=facto(result*facto(fact-1))
     return result;
   }
};


