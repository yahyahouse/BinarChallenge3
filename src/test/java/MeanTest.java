import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeanTest {
    private final List<Integer> nilai = new ArrayList<>();
    private final ReadWriteTest rw = new ReadWriteTest();
    @Test
    @DisplayName("Test hitung rata-rata")
    void testMean () throws IOException {

        rw.readTest();

        float total = 0;
        for (int t : nilai){
            total = total + t;
        }
        float hasil = total/ nilai.size();
        DecimalFormat df = new DecimalFormat("#.##");
        assertEquals("8", df.format(hasil));

    }
}
