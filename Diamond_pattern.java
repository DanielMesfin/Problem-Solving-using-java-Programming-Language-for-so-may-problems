//Name Daniel Mesfin Abamecha 
//ID 1732/12
//Q#2: Write a Java program that display the below number Diamond pattern.
package labassignment;
public class Diamond_pattern {
//daimed shape  drawing by java programming language 
public static void main(String[] args){
    for(int z=4; z>=1; z--){ //this is the for loop for two inner for loops  to makes itration 
        for( int j=4; j>=2; j--){// the inner loop that holds left half part of drawing of the bottom one
            if(z+j<=5){// the condition which must be fullfiled to display the value
            System.out.print(j);//the output value of agiven varibela alue
            }
            else{// else condion which display empty space for the programming 
            System.out.print(" ");// this dislay the empty space 
            }
        }
        for(int x=1; x<=4; x++){// the inner loop that holds right half part of drawing of the bottom one
              if(z+x<=5){
            System.out.print(x);//the output value of agiven varibela alue
            }
              else{// else condion which display empty space for the programming 
              System.out.print(" ");// this dislay the empty space 
              }
        }
        System.out.println();//the end of loop that is to have new line for the following computing 
    }
    // the bottom drawing part of my diamend 
        for(int z=4; z>=1; z--){//this is the for loop for two inner for loops  to makes itration
        for( int j=4; j>=2; j--){// the inner loop that holds left half part of drawing of the bottom one
            if(z>j){//the condition to display the value of j 
            System.out.print(j);//the output value of agiven varibela alue
            }
            else{// else condion which display empty space for the programming 
            System.out.print(" ");// this dislay the empty space 
            }
        }
        for(int x=1; x<=4; x++){// the inner loop that holds right half part of drawing of the bottom one
              if(z>x){//the condtion to display the number that is assingned to x
            System.out.print(x);//output statement 
            }
             else{// else condion which display empty space for the programming 
              System.out.print(" ");// this dislay the empty space 
              }
        }
        System.out.println();//the end of loop that is to have new line for the following computing 
    }
}
}
