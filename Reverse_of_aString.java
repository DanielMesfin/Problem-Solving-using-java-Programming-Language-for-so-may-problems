//Name Daniel Mesfin Abamecha 
//ID 1732/12
//Q#6: Write a Java program to reverse a string
package labassignment;// the package for my work
import java.util.Scanner;// for Scanner class  to accept user in put
public class Reverse_of_aString {// class diclaration 
        public static void main(String [] arg)// main method for myb work 
	{
	Scanner scan=new Scanner(System.in);//Scanner class  instntion 
	System.out.print("Enter a string : ");//helping user to Enter The input 
	String str=scan.nextLine(); //Variable declaration and accepting input at The Same time 	
	char[] ch=str.toCharArray(); // character array to accept  and store it as  character for further programming  
	System.out.println("Reverse of a String is :"); //describe the output for user 
	int j=ch.length;// to know the maximum lenght of the input and to displaye it from maximum index to minumum one in reverse direction 
	for(int i=j;i>0;i--)// using for loop to display continously
	{
	System.out.print(ch[i-1]); //here is the output that the program is need to do 
	}
	}
}
 
