import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.NaturalTree;
import christmastree.Balls;

public class BallsTest {

    private static NaturalTree tree;
    private static Balls bal1;


    @BeforeClass
    public static void setupBeforeClass() {


        ball = new Balls(tree);
    }

    @Test
    public void getSize() {

        assertEquals(ball.getSize()," BallsSize: Small");
    }



    @Test
    public void getMaterial() {
        assertEquals(ball.getMaterial()," BallsMaterial: Plastic");
    }

}