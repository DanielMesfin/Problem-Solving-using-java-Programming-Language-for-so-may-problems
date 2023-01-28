/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intenship;

/**
 *
 * @author Owner
 */
import java.util.Scanner;  
class CamelCase 
{

// Function to find the count of words in a CamelCase sequence
static int countWords(String str)
{
	int count = 1;

	for (int i = 1; i < str.length() - 1; i++) {
		if (str.charAt(i)>=65&&str.charAt(i)<=90)
			count++;
	}

	return count;
}

// main function 
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
	String str ;
      System.out.print("Enter the wods in camal cass to count the number of words");
  str=sc.nextLine();
// display the out put by call
	System.out.print( countWords(str));

}
}
