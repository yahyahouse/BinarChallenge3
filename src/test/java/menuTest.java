import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class menuTest {
    MenuShow menuShow;
    ReadWrite readWrite;

    @BeforeEach
    void pertama() {
        new MenuShow();
        new ReadWrite();
    }
//    @Test
//    void write() throws IOException {
//        Assertions.assertDoesNotThrow(() -> menuShow.Menu(1));
//    }
//
//    @Test
//    void writeMod() throws IOException {
//        Assertions.assertEquals(2,menuShow.Menu(2));
//    }
}
