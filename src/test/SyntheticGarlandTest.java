
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
}