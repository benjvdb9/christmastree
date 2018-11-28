/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import christmastree.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author MediaMonster
 */
public class CandleTest {
    
 ArtificialTree  treeDecorator= new ArtificialTree("ArtificialTree", 20, "red", "plastic");
    Candle candle1 = new Candle("Yellow", "candle",60.5, 20,"Senteurs d'inspiration", treeDecorator);
    Candle candle2 = new Candle(treeDecorator);
    
    
    @Test
    public void  testBallsWithArguments() {
        
        assertNotNull(candle1);
    }
    
    @Test
    public void  testCandleWithOneArgument() {
        
        assertNotNull(candle2);
    }
  
    @Test
    public void testGetDescription() {
        assertEquals(candle1.getDescription(),"TreeDescriptionArtificialTree CandleDecorator: candle");
    }
  
     @Test
    public void testGetNotDescription() {
        assertNotEquals(candle1.getDescription()," CandleDecorator: Candle");
    }
    
    @Test
    public void testGetDescriptionCandleWithOneArgument() {
        assertEquals(candle2.getDescription(),"TreeDescriptionArtificialTree CandleDecorator: Candle");
    }
   
    @Test
    public void testGetNotDescriptionCandleWithOneArgument() {
        assertNotEquals(candle2.getDescription()," CandleDecorator: Candle");
    }
    
     
    @Test
    public void testGetPrice() {
        assertEquals(candle1.getPrice(),80.5,0.0f);
    }
    
    @Test
    public void testGetNotPrice() {
        assertNotEquals(candle1.getPrice(),60.5,0.0f);
    }
     
    @Test
    public void testGetColor() {
        assertEquals(candle1.getColor(),"TreeColorred CandleColor: Yellow");
    }
    
     @Test
    public void testGetNotColor() {
        assertNotEquals(candle1.getColor()," TreeColor:red CandleColor:Yellow");
    }
    
    
    @Test
    public void testGetNotParfum() {
        assertNotEquals(candle1.getParfum(),"Senteurs d'inspiration");
    }
   
    @Test
    public void testGetparfum() {
        assertEquals(candle1.getParfum()," CandleParfum: Senteurs d'inspiration");
    }
    
 
}
