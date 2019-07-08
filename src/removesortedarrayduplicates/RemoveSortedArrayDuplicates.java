/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removesortedarrayduplicates;

/**
 *
 * @author Abdi Mohammed
 */
public class RemoveSortedArrayDuplicates {

    static int removeAnyDuplicates(int arr[], int x) 
    { 
        // Return, if array is empty or contains a single element 
        if (x==0 || x==1) 
            return x; 
       
        int[] temp = new int[x]; 
          
        // Start traversing elements 
        int j = 0; 
        for (int i=0; i<x-1; i++) 
            // If current element is not equal to next element then store that current element 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        // Store the last element as whether it is unique or repeated, it hasn't stored previously 
        temp[j++] = arr[x-1]; 
          
        // Modify original array 
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length; 
          
        n = removeAnyDuplicates(arr, n); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
    } 
    
}
