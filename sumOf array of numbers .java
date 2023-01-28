/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intenship;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class NewClass2 {
    
    public int sum(int arr[]){
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        NewClass2 summation = new NewClass2();
        
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter the length of the array");
        
        int length=scan.nextInt();
        
        int arra[]=new int[length];
        
        System.out.println("Enter elements one by one");
        
        for(int i=0;i<length;i++){
            
            arra[i]=scan.nextInt();
            
        }
        
        System.out.println("The Sum of The given array is : "+summation.sum(arra));
        
    }
    
}
