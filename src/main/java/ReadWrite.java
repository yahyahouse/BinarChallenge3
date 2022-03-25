
import java.io.*;
import java.util.*;

public class ReadWrite {

    public List<Integer> read(String path) {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = " ";
            String[] tempArr;
            List<Integer> listInt = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                tempArr = line.split(";");

                for (int i = 0; i < tempArr.length; i++) {
                    if (i == 0) {
                    } else {
                        String temp = tempArr[i];
                        int intTemp = Integer.parseInt(temp);
                        listInt.add(intTemp);
                    }
                }
            }
            reader.close();
            return listInt;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void write(String savePlace) {

        MenuShow menu = new MenuShow();
        List<Integer> read = read("src/main/resources/data_sekolah.csv");
        try {
            File file = new File(savePlace);
            if (file.createNewFile()) {
                System.out.println("File Mean-Median-Modus tersimpan di -> " + savePlace);
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write("Berikut Hasil Pengolahan Nilai:");
            bwr.newLine();
            bwr.write("Berikut hasil sebaran data nilai");
            bwr.newLine();
            bwr.write("Mean   : " +  mean(read));
            bwr.newLine();
            bwr.write("Median : " + median(read));
            bwr.newLine();
            bwr.write("Modus  : " + modus(read));
            bwr.newLine();
            bwr.flush();
            bwr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void writeMod(String saveMod) {

        MenuShow menu = new MenuShow();
        try {
            File file = new File(saveMod);
            if (file.createNewFile()) {
                System.out.println("File Modus Sekolah tersimpan di ->: " + saveMod);
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(writer);
            Map<Integer, Integer> Map = freq(read("src/main/resources/data_sekolah.csv"));
            Set<Integer> key = Map.keySet();
            bwr.write("Berikut Hasil Pengolahan Nilai:\n");
            bwr.newLine();
            bwr.write("Nilai" + "|" + "Frekuensi" + "\n");
            bwr.newLine();
            for (Integer nilai : key) {
                bwr.write(nilai + " " + "|" + Map.get(nilai));
            }
            bwr.flush();
            bwr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private int mean(List<Integer> list) {
        return (int) list.stream()
                    .mapToDouble(d -> d)
                    .average()
                    .orElse(0.0);


    }
    private double median(List<Integer> list) throws ArrayIndexOutOfBoundsException {
        double median = 0;
        try {
            Arrays.sort(new List[]{list});
            if (list.size() % 2 == 0)
                median = ((double) list.get(list.size() / 2) + (double) list.get(list.size() / 2 - 1)) / 2;
            else
                median = (double) list.get(list.size() / 2);

        } catch (Exception e) {
            System.out.println("");
        } finally{
            return median;
        }
    }

    private int modus(List<Integer> list) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 1;
        int temp = 0;

        for (Integer integer : list) {

            if (hm.get(integer) != null) {

                int count = hm.get(integer);
                count++;
                hm.put(integer, count);

                if (count > max) {
                    max = count;
                    temp = integer;
                }
            } else
                hm.put(integer, 1);
        }
        return temp;
    }

    private Map<Integer, Integer> freq(List<Integer> array) {
        Set<Integer> distinct = new HashSet<>(array);
        Map<Integer, Integer> Map = new HashMap<>();

        for (Integer s : distinct) {
            Map.put(s, Collections.frequency(array, s));
        }
        return Map;
    }
}
