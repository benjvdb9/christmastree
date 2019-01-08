/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.mockito.internal.matchers.Null;

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

    @Test
    public void lifetimeTestSuite() {
        candle1.setLifeTime(99);
        assertEquals(99, candle1.getLifeTime());
    }

    @Test
    public void testConditionals() {
        ArtificialTree tree1 = new ArtificialTree();
        tree1.setColor(null);
        assertEquals( null, tree1.getColor());
        Candle candle1 = new Candle(tree1);
        assertEquals( "", candle1.getColor());

        ArtificialTree tree2 = new ArtificialTree("", 1, "", "");
        tree2.setColor(null);
        assertEquals(null, tree2.getColor());
        Candle candle2 = new Candle(tree2);
        assertEquals( "", candle2.getColor());
    }

    @Test
    public void testToString() {
        String to_string = candle1.toString();
        String expected = "ChrismasTree{TreeDescriptionArtificialTree CandleDecorator: candle, price=80.5," +
                "TreeColorred CandleColor: Yellow}Candle{lifeTime=20, CandleParfum: Senteurs d'inspiration}";
        assertEquals(expected, to_string);
    }
}
