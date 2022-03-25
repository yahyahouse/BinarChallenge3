import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionClass {
    static Scanner scan = new Scanner(System.in);
    public static int menuPilih(){
        try {
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
            MenuShow menuShow = new MenuShow();
            menuShow.Menu(scan.nextInt());

        }catch (Exception ex){
            System.out.println("Error disini :"+ ex.getMessage());
        }
        return 0;
    }
}
