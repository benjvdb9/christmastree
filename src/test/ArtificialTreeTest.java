
import christmastree.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;



public class ArtificialTreeTest {
    
    private static ArtificialTree tree1=new ArtificialTree("Artificial", 100.2,"red", "plastic AXC");
    private static ArtificialTree tree2=new ArtificialTree();

    @Test
    public void  testArtificialTreeWithArguments() {
        
        assertNotNull(tree1);
    }
    
    @Test
    public void  testArtificialTreeDefault() {
        
        assertNotNull(tree2);
    }
  
    @Test
    public void testGetDescription() {
        assertEquals(tree1.getDescription(),"TreeDescriptionArtificial");
    }
    
     @Test
    public void testGetNotDescription() {
        assertNotEquals(tree1.getDescription(),"Artificial");
    }
    
    @Test
    public void testGetDescriptionDefault() {
        assertEquals(tree2.getDescription(),"TreeDescription: Artificial Tree");
    }
    
     @Test
    public void testGetNotDescriptionDefault() {
        assertNotEquals(tree2.getDescription(),"Artificial Tree");
    }
    
    
    @Test
    public void testGetPrice() {
        assertEquals(tree1.getPrice(),100.2,0.0f);
    }
    
    @Test
    public void testGetNotPrice() {
        assertNotEquals(tree1.getPrice(),104.2,0.0f);
    }
    
    @Test
    public void testGetColor() {
        assertEquals(tree1.getColor(),"TreeColorred");
    }
    
    @Test
    public void testGetNotColor() {
        assertNotEquals(tree1.getColor(),"red");
    }
    
    
    @Test
    public void testGetColorDefault() {
        assertEquals(tree2.getColor()," TreeColor Green");
    }
    
    @Test
    public void testGetNotPlastic() {
        assertNotEquals(tree1.getPlasticType()," plastic AXC");
    }
    
    @Test
    public void testGetPlastic() {
        assertEquals(tree1.getPlasticType(),"plasticType: plastic AXC");
    }

}
