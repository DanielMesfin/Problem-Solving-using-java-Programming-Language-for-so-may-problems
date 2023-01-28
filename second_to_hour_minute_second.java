//Name :Daniel Mesfin Abamecha
//ID 1732/12
//Q#8: Write a Java program to convert seconds to hour, minute and seconds.
package labassignment;// the package for my work 
import java.util.Scanner;// for the scanner class that i used for accepting user input
public class second_to_hour_minute_second {// the class diclaration
//to conver that a given second to hour, minute, second 
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//This is Bulit in class that help as to accept input from user 
        System.out.print("Input seconds: ");//This line of code inorder to anuonce the user to Enter the second to calculate hour,minute and second from second  
        int seconds = in.nextInt(); //here the second variable that holeds the input frome user untile the programe finsh its excution
        int  second = seconds % 60;//the remender of division by 60 is the  second after division 
        int  hour = seconds / 60;//the minute that is the qoution of division by 60.
        int   minute=  hour % 60;// so we can calculate the minute by using remender or mouled
        hour =  hour / 60;// hour is calculated by using division of minute by 60;
        System.out.println(  "HOUR"+ ":" +  "MINUTE" + ":" +"SECOND");// explanation of the resuate
        System.out.println(  hour + ":" +  minute + ":" +  second);// which disiplay the output 
    }    
 }
    
