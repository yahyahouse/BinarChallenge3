import java.util.Scanner;

public class MenuExtend extends Menu {

    @Override
    public void Menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Aplikasi Pengolah Nilai Siswa ");
        System.out.println("================================");
        System.out.println("File akan dibaca di <Lokasi Read File>");
        ReadWrite readWrite = new ReadWrite();

        int pilih = scan.nextInt();
        switch (pilih){
            case 1:
                readWrite.reader("src/main/resources/data_sekolah.csv",";");
                break;
            case 2:
                readWrite.writer("src/main/resources/modus.txt");
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
