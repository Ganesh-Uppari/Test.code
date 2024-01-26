package Org.example;

import org.example.Main;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMainMethodOutput() {
        // Redirect standard output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        Main.main(null);

        // Restore standard output
        System.setOut(System.out);

        // Check if the output matches the expected string
        assertEquals("Hello world!\n", outputStream.toString());
    }
}
