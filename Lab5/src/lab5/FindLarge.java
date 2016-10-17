/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

/**
 *
 * @author t00166087
 */
public class FindLarge {
    
    public static int findLargest(int[] array)
    {
        
        return findLargestSub(array,array.length - 1 );
        
    }
    
    private static int findLargestSub(int [] array,int end)
    {
        int max;
        if(end==0)
        {
            return array[0];
        }
        else
        {
           max = findLargestSub(array, end-1);
        //compare to end of array
           if(max > array[end])
               return max;
           else
               return array[end];
               
        }
     
    }
    
}
