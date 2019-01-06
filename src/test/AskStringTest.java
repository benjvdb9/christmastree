import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AskStringTest {
    PrintStream original_out = System.out;
    ByteArrayOutputStream out_content = new ByteArrayOutputStream();
    AskString asker = mock(AskString.class);

    @Before
    public void outPreSetup() {
        System.setOut(new PrintStream(out_content));
    }

    @After
    public void outPostSetup() {
        System.setOut(original_out);
    }

    /*@Test
    public void ask() {
        when(asker.ask("Is this method working?")).thenReturn("I believe it is");
        assertEquals("Is this method working?", out_content.toString());
    }*/

    /*@Test
    public void askBool() {
    }

    @Test
    public void askDouble() {
    }

    @Test
    public void askInt() {
    }*/
}