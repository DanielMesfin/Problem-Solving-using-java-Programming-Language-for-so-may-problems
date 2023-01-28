//Name Daniel Mesfin Abamecha 
//ID 1732/12
// Q#1: Write a Java program that display the below pyramid pattern.
package labassignment;//this is the pakage I have to impliment my code 
public class PyramidPattern {//my pramide patteren class  on which implimation to be taken   
public static void main(String[] args){// main method  for implimention 
    System.out.println("The pyramid pattern is display the below ");
    for (int i = 1; i <=7; ++i){//using for loop for itration need in code 
        for (int space = 0; space <=7 - i; ++space){// display empty space to drive the shape which is need
            System.out.print(" ");//display empty space 
        }
        for(int k=0; k!=i*2-i; k++){//for loop tha is displaying * character to drawe the shape 
            System.out.print("* ");//this display the * character 
        }
        System.out.println();//print new line as per ending of the loop 
        
    }
}
}