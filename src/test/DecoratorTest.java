import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {
    ChrismasTree tree = new ArtificialTree();
    Balls ball = new Balls(tree);

    @Test
    public void getTreeDecorator() {
        ChrismasTree actual_tree = ball.getTreeDecorator();
        assertEquals(tree, actual_tree);
    }

    @Test
    public void setTreeDecorator() {
        ChrismasTree test = new ArtificialTree("test", 99, "red", "plastic");
        ball.setTreeDecorator(test);
        ChrismasTree actual_tree = ball.getTreeDecorator();
        assertEquals(test, actual_tree);
    }
}