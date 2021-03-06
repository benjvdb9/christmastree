import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class NaturalTreeTest {
 
    private static NaturalTree tree1=new NaturalTree("Natural", 220.2,"Green","Omorika",20);
    private static NaturalTree tree2=new NaturalTree();

    @Test
    public void  testNaturalTreeWithArguments() {
        
        assertNotNull(tree1);
    }
    
    @Test
    public void  testNaturalTreeDefault() {
        
        assertNotNull(tree2);
    }
  
    @Test
    public void testGetDescription() {
        assertEquals(tree1.getDescription()," TreeDescription: Natural");
    }
    
     @Test
    public void testGetNotDescription() {
        assertNotEquals(tree1.getDescription(),"Natural");
    }
    
    @Test
    public void testGetDescriptionDefault() {
        assertEquals(tree2.getDescription()," TreeDescription: Natural Tree");
    }
    
     @Test
    public void testGetNotDescriptionDefault() {
        assertNotEquals(tree2.getDescription(),"Natural Tree");
    }
    
    
    @Test
    public void testGetPrice() {
        assertEquals(tree1.getPrice(),220.2,0.0f);
    }
    
    @Test
    public void testGetNotPrice() {
        assertNotEquals(tree1.getPrice(),120.2,0.0f);
    }
    
    @Test
    public void testGetColor() {
        assertEquals(tree1.getColor()," TreeColor: Green");
    }
    
    @Test
    public void testGetNotColor() {
        assertNotEquals(tree1.getColor(),"red");
    }
    
    
    @Test
    public void testGetColorDefault() {
        assertEquals(tree2.getColor()," TreeColor: Green");
    }
    
    @Test
    public void testGetNotTreeType() {
        assertNotEquals(tree1.getTreeType(),"Omorika");
    }
    
    @Test
    public void testGetTreeType() {
        assertEquals(tree1.getTreeType()," TreeType: Omorika");
    }

    @Test
    public void testGetLifetime() {
        assertEquals(20, tree1.getLifeTime());
    }

    @Test
    public void testToString() {
        String expected = " NaturalTree{ TreeType: Omorika, lifeTime=20}";
        String actual = tree1.toString();
        assertEquals(expected, actual);
    }

}
