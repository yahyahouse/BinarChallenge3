import java.util.Scanner;

public class MenuShow {
    Scanner scan = new Scanner(System.in);
    void Menu(int pilih) {
        Scanner scan = new Scanner(System.in);
        ReadWrite readWrite = new ReadWrite();
        String file = "src/main/resources/data_sekolah.csv";
        String MeanMedianModus = "src/main/resources/MeanMedianModus.txt";
        String Modus = "src/main/resources/modus.txt";
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

