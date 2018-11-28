
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;

public class SyntheticGarlandTest {

    private static ArtificialTree tree;
    private static SyntheticGarland garland;

    @BeforeClass
    public static void setupBeforeClass() {


        tree = new ArtificialTree("artificiel",23.8,"jaune","bisphenol A");
        garland = new SyntheticGarland(tree);
    }

    @Test
    public void getPaillette() {
        assertEquals(garland.getPaillette()," SyntheticGarlandPaillette: Square");
    }
}