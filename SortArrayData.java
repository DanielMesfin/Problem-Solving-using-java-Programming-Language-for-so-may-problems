//Name: Daniel Mesfin Abamecha
//ID: 1732/12
//Q#10: Write a Java program to sort an array of given integers using Insertion sort Algorithm and 
//display the maximum number.

package labassignment;
import java.util.Arrays;
import java.util.Scanner;
public class SortArrayData {  
void InsertionSort(int[] nums){
  for(int i = 1; i < nums.length; i++){
    int value = nums[i];
    int j = i - 1;
    while(j >= 0 && nums[j] > value){//the while loop that is examing the condition and do the best 
      nums[j + 1] = nums[j];
      j = j - 1;
    }
    nums[j + 1] = value;//incriment the value of i's index
    System.out.print(Arrays.toString(nums));//dispaly the process of insertionsorting 
    System.out.println();//new line after loop 
  }
}
    
    // Method to test above
    public static void main(String args[])
    {
        SortArrayData ob = new SortArrayData();
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: "); //reading the number of elements from the that we want to enter  
        n=sc.nextInt();  
                           
        int[] nums = new int[n];//creates an array in the memory of length 10  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++){//reading array elements from the user  
            System.out.print("Enter the element "+ (1+i)+":");
            nums[i]=sc.nextInt();
        }  
        System.out.println("Original Array elements are: ");// accessing array elements using the for loop  
        for (int i=0; i<n; i++){// this the for loop to display the orginal
            System.out.print(nums[i] +",");//output
        }
        System.out.println();//new line after loop 
        System.out.println("The Process Of Sorting : ");// accessing array elements using the for loop  
        ob.InsertionSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }  
}   

    

