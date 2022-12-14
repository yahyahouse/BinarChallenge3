import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class MenuShow {
    Scanner scan = new Scanner(System.in);
    public static String file = "src/main/resources/data_sekolah.csv";
    public static String MeanMedianModus = "src/main/resources/MeanMedianModus.txt";
    public static String Modus = "src/main/resources/modus.txt";
    public static void Menu() {
        try {
            Scanner scan = new Scanner(System.in);
            ReadWrite readWrite = new ReadWrite();
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
            int pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    readWrite.write(MeanMedianModus);
                    break;
                case 2:
                    readWrite.writeMod(Modus);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Masukan pilihan yang benar!");
                    Menu();
            }
        }catch (Exception e){
            printStackTrace();

        }

    }
}

