
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class SyntheticGarlandTest {

    private static ArtificialTree tree;
    private static SyntheticGarland garland;

    @BeforeClass
    public static void setupBeforeClass() {
        tree = new ArtificialTree("artificiel",23.8,"jaune","bisphenol A");
        garland = new SyntheticGarland(tree);
        SyntheticGarland garland2 = new SyntheticGarland("1", "2", "3", 4, 5, tree);
    }

    @Test
    public void getPaillette() {
        assertEquals(garland.getPaillette()," SyntheticGarlandPaillette: Square");
    }

    @Test
    public void testToString() {
        String expected = "ChrismasTree{TreeDescriptionartificiel SyntheticGarlandDecorator: Garland, price=34.79," +
                "TreeColorjaune SyntheticGarlandColor: yellow} Garland{length=15.0} SyntheticGarland" +
                "{ SyntheticGarlandPaillette: Square}";
        String actual = garland.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testConditionals() {
        ArtificialTree tree = new ArtificialTree();
        tree.setColor(null);
        assertEquals( null, tree.getColor());
        SyntheticGarland g1 = new SyntheticGarland(tree);
        assertEquals( "", g1.getColor());

        SyntheticGarland g2 = new SyntheticGarland("", "", "", 0, 1, tree);
        assertEquals( "", g2.getColor());
    }
}