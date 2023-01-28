//Name Daniel Mesfin Abamecha 
//ID 1732/12
//Q#5: Write a Java program and compute the sum of the digits of an integer.
package labassignment;

import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String [] arg){
    int num;// as whole number 
    int sum=0;// there is no flor division so that  int dose not count remender value 
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter The Number For Which The Sum Of It Will Be Displayed.");
    num=scan.nextInt();
    while(num>0){//cheaking it after you have look for .
        sum+=(num%10);
        num/=10;
    }
    System.out.println("The Sum Of Digits :"+ sum);
  
    }
    
}
