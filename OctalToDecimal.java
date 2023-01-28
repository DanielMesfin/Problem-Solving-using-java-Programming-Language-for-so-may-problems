//Name: Daniel Mesfin Abamecha
//ID 1732/12
//Q#4: Write a Java program to convert an octal number to a decimal number.
package labassignment;
import java.util.Scanner;
import java.lang.Math;//import the java .Math class for further use in my code below 
public class OctalToDecimal { public static void main(String[] args)// main method  for implimention the code in our program.
   {
      int octal, decimal=0, i=0, rem;//variable declaretion
      Scanner s = new Scanner(System.in);//scanner class object instantion
      
      System.out.print("Enter the Octal Number: ");//accepting input from user
      octal = s.nextInt();
      
      while(octal!=0)//while loop for itrating the instraction
      {
         rem = octal%10;//this projects remender of our working 
         decimal = (int) (decimal + (rem*Math.pow(8, i)));//here applay math .pow for computing
         i++;
         octal = octal/10;
      }
      
      System.out.println("\nEquivalent Decimal Value = " +decimal);//resulte or output
   }
}

