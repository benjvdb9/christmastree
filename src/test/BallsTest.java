/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MediaMonster
 */
public class BallsTest {
    
    ArtificialTree  treeDecorator= new ArtificialTree("ArtificialTree", 20, "red", "plastic");
    Balls ball1 = new Balls("Yellow", "ball",20.5, "mat", "small", treeDecorator);
    Balls ball2 = new Balls(treeDecorator);
    
    
    @Test
    public void  testBallsWithArguments() {
        
        assertNotNull(ball1);
    }
    
    @Test
    public void  testBallsWithOneArgument() {
        
        assertNotNull(ball2);
    }
  
    @Test
    public void testGetDescription() {
        assertEquals(ball1.getDescription(),"TreeDescriptionArtificialTree BallsDecorator: ball");
    }
  
     @Test
    public void testGetNotDescription() {
        assertNotEquals(ball1.getDescription()," BallsDecorator: Balls");
    }
    
    @Test
    public void testGetDescriptionBallsWithOneArgument() {
        assertEquals(ball2.getDescription(),"TreeDescriptionArtificialTree BallsDecorator: Balls");
    }
   
    @Test
    public void testGetNotDescriptionBallsWithOneArgument() {
        assertNotEquals(ball2.getDescription(),"BallsDecorator: Balls");
    }
    
     
    @Test
    public void testGetPrice() {
        assertEquals(ball1.getPrice(),40.5,0.0f);
    }
    
    @Test
    public void testGetNotPrice() {
        assertNotEquals(ball2.getPrice(),20.5,0.0f);
    }
     
    @Test
    public void testGetColor() {
        assertEquals(ball1.getColor(),"TreeColorred BallsColor: Yellow");
    }
    
     @Test
    public void testGetNotColor() {
        assertNotEquals(ball1.getColor()," TreeColor:red BallsColor:Yellow");
    }
    
    
    @Test
    public void testGetNotMaterial() {
        assertNotEquals(ball1.getMaterial(),"plasric");
    }
   
    @Test
    public void testGetMaterial() {
        assertEquals(ball1.getMaterial()," BallsMaterial: mat");
    }
    
    @Test
    public void testGetNotSize() {
        assertNotEquals(ball1.getMaterial(),"small");
    }
   
    @Test
    public void testGeSize() {
        assertEquals(ball1.getSize()," BallsSize: small");
    }

    @Test
    public void testToString() {
        String to_string = "ChrismasTree{TreeDescriptionArtificialTree BallsDecorator: ball, " +
                "price=40.5,TreeColorred BallsColor: Yellow}Balls{ BallsMaterial: mat, BallsSize: small}";
        assertEquals(ball1.toString(), to_string);
    }

    @Test
    public void testSetMaterial() {
        ball1.setMaterial("TEST");
        ball2.setMaterial("TEST2");
        assertEquals(ball1.getMaterial(), "TEST");
        assertEquals(ball2.getMaterial(), "TEST2");
    }
}
