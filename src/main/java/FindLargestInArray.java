/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chriscanenguez
 */
public class FindLargestInArray 
{
    private int currentMax;
    private int index;
    
    int findMax(int[] array)
    {
        currentMax = array[0];
        
        // If array has no elements, will output to screen.
        // If array has elements, currentMax will be set to first element in array.
        if(array.length != 0)
        {
            currentMax = array[0];
        }
        else
        {
            System.out.println("There are no elements in this array.");
        }
        
        // Set loop variable.
        index = 1;
        
        // While loop used to find the largest index within the array.
        while (index < array.length)
        {
            if(array[index] > currentMax)
            {
                currentMax = array[index];
            }
            
            index++;
        }
        
        // Return max integer in array.
        return currentMax;
            
    }
    
    public static void main(String[] args)
    {
        FindLargestInArray nc = new FindLargestInArray();
        
        int[] arr = {3, 6, -1, 10, 15, -8};
        
        int max = nc.findMax(arr);
        
        System.out.println("The max integer in the array is: " + max);
        
        
     
    }
}
