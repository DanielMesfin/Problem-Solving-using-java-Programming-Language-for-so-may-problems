/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intenship;
import java.util.*;
/**
 *
 * @author Owner
 */
// Java implementation of the approach

class CountOfLargestNumber
{
	static int maxSelectionCount(int a[], int n)
	{
		// Initialize result
		int res = 0;

		// Sorting the array
		Arrays.sort(a);
                int cou=0;
                
                for(int i=0;i<n;i++){
                    if(a[i]==a[n-1]) cou++;
                    
                }

		return cou;
	}

	// Driver Code
	public static void main(String[] args)
	{
            Scanner scan = new Scanner(System.in);
                   
                System.out.println("Enter the length of the array");
                int N=scan.nextInt();
                int arr[]=new int[N];
                System.out.println("Enter Elements one by one");
                
                
                for(int i=0;i<N;i++){
                    
                    arr[i]=scan.nextInt();
                    
                }
                

		System.out.println("The number of the largest element of the given array is : "+maxSelectionCount(arr, N));
	}
}

