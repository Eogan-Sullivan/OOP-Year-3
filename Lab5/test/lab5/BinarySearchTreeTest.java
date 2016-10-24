/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t00166087
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
    }
    

    /**
     * Test of contains method, of class BinarySearchTree.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = "Tom";
        BinarySearchTree instance = new BinarySearchTree();
        instance.insert("Mary");
        instance.insert("Tom");
        boolean expResult = true;
        boolean result = instance.contains("Tom");
        assertEquals(expResult, result);

    }
    
    @Test
    public void testRContains(){
        System.out.print("Recursive Contains");
        Object element = "Tom";
        BinarySearchTree instance = new BinarySearchTree();
        instance.insert("Mary");
        instance.insert("Joe");
        instance.insert("Tom");
        boolean expResult = true;
        boolean result = instance.rContains("Tom");
        assertEquals(expResult, result);
       
    }

 
    
}
