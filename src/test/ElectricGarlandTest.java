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
public class ElectricGarlandTest {
    
   ArtificialTree  treeDecorator= new ArtificialTree("ArtificialTree", 120, "red", "plastic");
    ElectricGarland electricGarland1 = new ElectricGarland("Yellow", "electricGarland",70.5,true, 40, treeDecorator);
    ElectricGarland electricGarland2 = new ElectricGarland(treeDecorator);
    
    
    @Test
    public void  testElectricGarlandWithArguments() {
        
        assertNotNull(electricGarland1);
    }
    
    @Test
    public void  testElectricGarlandWithOneArgument() {
        
        assertNotNull(electricGarland2);
    }
  
    @Test
    public void testGetDescription() {
        assertEquals(electricGarland1.getDescription(),"TreeDescriptionArtificialTree ElectricGarlandDecorator: electricGarland");
    }
  
     @Test
    public void testGetNotDescription() {
        assertNotEquals(electricGarland1.getDescription()," ElectricGarlandDecorator: ElectricGarland");
    }
    
    @Test
    public void testGetDescriptionElectricGarlandWithOneArgument() {
        assertEquals(electricGarland2.getDescription(),"TreeDescriptionArtificialTree ElectricGarlandDecorator: ElectricGarland");
    }
   
    @Test
    public void testGetNotDescriptionElectricGarlandWithOneArgument() {
        assertNotEquals(electricGarland2.getDescription(),"ElectricGarlandDecorator: ElectricGarland");
    }
    
     
    @Test
    public void testGetPrice() {
        assertEquals(electricGarland1.getPrice(),190.5,0.0f);
    }
    
    @Test
    public void testGetNotPrice() {
        assertNotEquals(electricGarland2.getPrice(),70.5,0.0f);
    }
     
    @Test
    public void testGetColor() {
        assertEquals(electricGarland1.getColor(),"TreeColorred ElectricGarlandColor: Yellow");
    }
    
     @Test
    public void testGetNotColor() {
        assertNotEquals(electricGarland1.getColor()," TreeColor:red ElectricGarlandColor:Yellow");
    }
    
    
    @Test
    public void testGetNotLength() {
        assertNotEquals(electricGarland1.getLength(),25);
    }
   
    @Test
    public void testGetLength() {
        assertEquals(electricGarland1.getLength(),40,0.0f);
    }
    
     @Test
    public void testGetHasBlink() {
        assertEquals(electricGarland1.isHasBlink(),true);
    }
    
    
  
}
