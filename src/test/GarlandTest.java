/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import christmastree.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MediaMonster
 */
public class GarlandTest {
    
   ArtificialTree  treeDecorator= new ArtificialTree("ArtificialTree", 120, "red", "plastic");
    Garland garland1 = new Garland("Yellow", "garland",70.5, 40, treeDecorator);
    Garland garland2 = new Garland(treeDecorator);
    
    
    @Test
    public void  testGarlandWithArguments() {
        
        assertNotNull(garland1);
    }
    
    @Test
    public void  testGarlandWithOneArgument() {
        
        assertNotNull(garland2);
    }
  
    @Test
    public void testGetDescription() {
        assertEquals(garland1.getDescription(),"TreeDescriptionArtificialTree GarlandDecorator: garland");
    }
  
     @Test
    public void testGetNotDescription() {
        assertNotEquals(garland1.getDescription()," GarlandDecorator: Garland");
    }
    
    @Test
    public void testGetDescriptionGarlandWithOneArgument() {
        assertEquals(garland2.getDescription(),"TreeDescriptionArtificialTree GarlandDecorator: Garland");
    }
   
    @Test
    public void testGetNotDescriptionGarlandWithOneArgument() {
        assertNotEquals(garland2.getDescription(),"GarlandDecorator: Garland");
    }
    
     
    @Test
    public void testGetPrice() {
        assertEquals(garland1.getPrice(),190.5,0.0f);
    }
    
    @Test
    public void testGetNotPrice() {
        assertNotEquals(garland2.getPrice(),70.5,0.0f);
    }
     
    @Test
    public void testGetColor() {
        assertEquals(garland1.getColor(),"TreeColorred GarlandColor: Yellow");
    }
    
     @Test
    public void testGetNotColor() {
        assertNotEquals(garland1.getColor()," TreeColor:red GarlandColor:Yellow");
    }
    
    
    @Test
    public void testGetNotLength() {
        assertNotEquals(garland1.getLength(),25);
    }
   
    @Test
    public void testGetLength() {
        assertEquals(garland1.getLength(),40,0.0f);
    }
    
  
}
