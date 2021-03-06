import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AskStringTest {
    AskString asker = mock(AskString.class);
    InputStream original_in = System.in;
    ByteArrayInputStream new_in = new ByteArrayInputStream("test".getBytes());

    public String testAskString() {
        String input = asker.ask("test suite?");

        if (input.equals("a")) {
            return "1";
        } else {
            return "0";
        }
    }

    public Boolean testAskBool() {
        Boolean input = asker.askBool("test suite?");

        if (input) {
            return true;
        } else {
            return false;
        }
    }

    public double testAskDouble() {
        Double input = asker.askDouble("test suite?");

        if (input == 52.0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int testAskInt() {
        int input = asker.askInt("test suite?");

        if (input == 74) {
            return 1;
        } else {
            return 0;
        }
    }



    @Test
    public void ask() {
        when(asker.ask("test suite?")).thenReturn("a");
        String returns = testAskString();
        assertEquals("1", returns);
    }

    @Test
    public void askBool() {
        when(asker.askBool("test suite?")).thenReturn(true);
        Boolean returns = testAskBool();
        assertTrue(returns);
    }

    @Test
    public void askDouble() {
        when(asker.askDouble("test suite?")).thenReturn(52.0);
        double returns = testAskDouble();
        assertEquals(1, returns, 0.1);
    }

    @Test
    public void askInt() {
        when(asker.askInt("test suite?")).thenReturn(74);
        int returns = testAskInt();
        assertEquals(1, returns);
    }
}