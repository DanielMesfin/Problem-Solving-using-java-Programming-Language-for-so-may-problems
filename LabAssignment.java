//Q#3: Write a Java program to convert an octal number to a binary number
package labassignment;

import java.util.Scanner;

public class LabAssignment {
// TODO code application logic here
// Java program to convert Octal number to Binary
// function to convert octal number to its binary equivalent value
    static String converter(String octalValue)
    {
 
        // integer variable to iterate the input octal string
        int i = 0;
 
        // string to store the result for futher implimention
        String binaryValue = "";
 
        // iterating the complete length of octal string and assigning the equivalent binary value for each octal digit.
        while (i < octalValue.length()) {
 
            // storing character according to the number of iteration
            char c = octalValue.charAt((int)i);
 
            // switch case to check all possible 8 conditions tht is why it is inpiles that form 0,1,2,3,4,5,6,7
            switch (c) {
            case '0':
                binaryValue += "000";
                break;
            case '1':
                binaryValue += "001";
                break;
            case '2':
                binaryValue += "010";
                break;
            case '3':
                binaryValue += "011";
                break;
            case '4':
                binaryValue += "100";
                break;
            case '5':
                binaryValue += "101";
                break;
            case '6':
                binaryValue += "110";
                break;
            case '7':
                binaryValue += "111";
                break;
            default:
                System.out.println("\nInvalid Octal Digit "+ octalValue.charAt((int)i));
                break;
            }
            i++;
        }
 
        // returning the final result
        return binaryValue;
    }
 
    // Driver code
    public static void main(String args[])
    {     Scanner scan =new Scanner(System.in);//here the scanner class is instantiated
 
        System.out.println("Octal to Binary Conversion\n");
        System.out.print("Enter The Octal Number :");//helping the user 
        String octalNumber = scan.nextLine();//accepting the data
        // octal number which is to be converted
        
        System.out.println("Octal number: " + octalNumber);
 
        // calling the converter method and  storing the result in a string variable
        String result = converter(octalNumber);
 
        System.out.println("Binary equivalent value is: "+ result);
    }
}
    
    

