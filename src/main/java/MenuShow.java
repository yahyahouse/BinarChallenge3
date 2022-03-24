import java.util.Scanner;

public class MenuShow {
    void Menu() {
        Scanner scan = new Scanner(System.in);
        ReadWrite readWrite = new ReadWrite();
        String file = "src/main/resources/data_sekolah.csv";
        String MeanMedianModus = "src/main/resources/MeanMedianModus.txt";
        String Modus = "src/main/resources/modus.txt";
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
        }
    }
}

