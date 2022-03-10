import java.io.*;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        reader("src/main/resources/data_sekolah.csv", ";");
        writer("src/main/resources/kelompok.txt");
    }
    public static void reader(String namaFile, String delimiter) {
        try {
            File file = new File(namaFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            List<Kelas> kl = new ArrayList<Kelas>();
            while((line = br.readLine()) != null) {
                Kelas kls = new Kelas();
                tempArr = line.split(delimiter);
                kls.setKelas(tempArr[0]);
                kl.add(kls);
            }
            for (int i=0; i<= kl.size();i++){
                System.out.print(kl.get(i));
            }
            for (Kelas kelas : kl) {
                System.out.println("Kelas " + kelas.getKelas() + " Nilai " + kelas.getNilai());
            }

                br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void writer(String namaFile){
        try {
            File file = new File(namaFile);
            if(file.createNewFile()) {
                System.out.println("new File");
            }
            } catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
