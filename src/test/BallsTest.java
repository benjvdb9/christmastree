import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.Balls;

public class BallsTreeTest {

    private static CrhismasTree tree;
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