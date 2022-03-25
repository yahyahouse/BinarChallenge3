import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

public class menuTest {
    @Test
    @DisplayName("Test untuk Menu Utama")
    void MenuTest() throws IOException {
            Menu menu = () -> {
                System.out.println("================================");
                System.out.println("Aplikasi Pengolah Nilai Siswa ");
                System.out.println("================================");
                System.out.println("File akan dibaca di <src/main/resources/data_sekolah.csv>");
                System.out.println("1. Menghitung Mean-Median-Modus");
                System.out.println("2. Menghitung Modus Sekolah");
                System.out.println("0. Exit");
            };
            menu.ShowMenu();
            int pilih = 1;
            switch (pilih) {
                case 1:
//                    readWrite.write(MeanMedianModus);
                    break;
                case 2:
//                    readWrite.writeMod(Modus);
                    break;
                case 0:
//                    System.exit(0);
                    break;
                default:
                    System.err.println("Masukan pilihan yang benar!");
//                    Menu();
            }
    }
//
//    @Test
//    void writeMod() throws IOException {
//        Assertions.assertEquals(2,menuShow.Menu(2));
//    }
}
