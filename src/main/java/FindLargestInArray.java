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
        
        while (index < array.length)
        {
            if(array[index] > currentMax)
            {
                currentMax = array[index];
            }
            
            index++;
        }
        
        return currentMax;
            
    }
    
    public static void main(String[] args)
    {
        NewClass nc = new NewClass();
        
        int[] arr = {3, 6, -1, 10, 15, -8};
        
        
     
    }
}
