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
public class BinarySearch {
     
    
    public static int binSearch(int []array,int key)
    {
        return binSearchSub(array,key,0,array.length-1);
    }
    
    
    private static int binSearchSub(int []array,int key,int low,int high)
    {
        int middle = (low+high)/2;
        
        if(high < low)
        {
            return -1;
        }
       
               if ( key == array[ middle ] )  // match
                    return middle;
               else if ( key > array[ middle ] )
                  return binSearchSub(array,key,middle+1,high);
               else 
                   return binSearchSub(array,key,low,middle-1);
      
  
              
    }
}
    
   
   


