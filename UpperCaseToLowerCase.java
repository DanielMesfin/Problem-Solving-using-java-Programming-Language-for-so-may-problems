//Name Daniel Mesfin Abamecha 
//ID 1732/12
//Q#9: Write a Java program that accept string in uppercase and convert a given string into lowercase

package labassignment;

import java.util.Scanner;

public class UpperCaseToLowerCase {
    // convert string form upper case to lower case 
     public static void main(String[] arg){
  String string; 
Scanner s = new Scanner(System.in);
System.out.println("Enter The string to be convert Form upper to lower case");
string=s.nextLine();// accept string input for further computing 
string = string.toLowerCase();//by using bulit in class convert it lower case 
System.out.println("The Lower Case Of The String You Have Entered:");
System.out.println(string);//the out put need by the user 
    
}
}