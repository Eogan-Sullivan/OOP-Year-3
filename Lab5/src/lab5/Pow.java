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
public class Pow {
    
    public static int pow (int x,int y)
    {
        if(y==0)
        {
            return 1;
                    
        }
        else
            return x*pow(x,y-1);
        
    }
    
    public static void main(String []args)
    {
        int result = pow(4,5);
        System.out.print(result);
        
    }
}
