import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteTest {
    @Test
    @DisplayName("Tes baca file")
    void readTest () throws IOException {
        List<Integer> list = new ArrayList<>();
        File file = new File("src/main/resources/data_sekolah.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String[] tempArr;
        while ((line = br.readLine()) != null) {
            tempArr = line.split(";");
            for (int i = 1; i < tempArr.length; i++) {
                list.add(Integer.parseInt(tempArr[i]));
            }
        }
        br.close();
    }
    @Test
    @DisplayName("Tes baca file Negative")
    void readTestNegative () throws IOException {
        try {
            List<Integer> list = new ArrayList<>();
            File file = new File("src/main/resources/datasekolah.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] tempArr;
            while ((line = br.readLine()) != null) {
                tempArr = line.split(";");
                for (int i = 1; i < tempArr.length; i++) {
                    list.add(Integer.parseInt(tempArr[i]));
                }
            }
            br.close();
        }catch (FileNotFoundException e){
            System.err.println("File Tidak ditemukan "+e.getMessage());
        }

    }
}
