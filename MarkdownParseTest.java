import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test public void testMarkDownParse() throws IOException{
        Path fileName = Path.of("/Users/abigailshilts/Documents/GitHub/markdown-parse/test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
}