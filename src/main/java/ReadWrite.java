import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static void reader(String fileName, String delimiter) {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            List<Kelas> kl = new ArrayList<>();
            while((line = br.readLine()) != null) {
                Kelas kls = new Kelas();
                tempArr = line.split(delimiter);
                kls.setKelas(tempArr[0]);
                kls.setNilai1(tempArr[1]);
                kls.setNilai2(tempArr[2]);
                kls.setNilai3(tempArr[3]);
                kls.setNilai4(tempArr[4]);
                kls.setNilai5(tempArr[5]);
                kls.setNilai6(tempArr[6]);
                kls.setNilai7(tempArr[7]);
                kls.setNilai8(tempArr[8]);
                kls.setNilai9(tempArr[9]);
                kls.setNilai10(tempArr[10]);
                kls.setNilai11(tempArr[11]);
                kls.setNilai12(tempArr[12]);
                kls.setNilai13(tempArr[13]);
                kls.setNilai14(tempArr[14]);
                kls.setNilai15(tempArr[15]);
                kls.setNilai16(tempArr[16]);
                kls.setNilai17(tempArr[17]);
                kls.setNilai18(tempArr[18]);
                kls.setNilai19(tempArr[19]);
                kls.setNilai20(tempArr[20]);
                kls.setNilai21(tempArr[21]);
                kls.setNilai22(tempArr[22]);
                kls.setNilai23(tempArr[23]);
//                kls.setNilai24(tempArr[24]);
//                kls.setNilai25(tempArr[25]);
//                kls.setNilai26(tempArr[26]);
//                kls.setNilai27(tempArr[27]);
//                kls.setNilai28(tempArr[28]);
                kl.add(kls);
            }
//            for (int i=0; i<= kl.size();i++){
//                System.out.print(i);
//            }
//            for (Kelas kelas : kl) {
//                System.out.println("Kelas " + kelas.getKelas() + " Nilai " + kelas.getNilai1() + kelas.getNilai2()
//                + kelas.getNilai3()+kelas.getNilai4()+ kelas.getNilai5()+kelas.getNilai6());
//            }
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void writer(String fileName) {
        try {
            File file = new File(fileName);
            if(file.createNewFile()) {
                System.out.println("new File is being created");
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(writer);
            Penghitung hitung = new Penghitung();
            bwr.write(hitung.modus());
            bwr.flush();
            bwr.close();
            System.out.println("Success writing to a file");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
