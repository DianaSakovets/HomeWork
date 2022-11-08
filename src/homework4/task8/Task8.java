package homework4.task8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        BufferedWriter writer = null;
        try {
            reader1 = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\untitled7\\src\\homework4\\fileTask8_1"), StandardCharsets.UTF_8));
            reader2 = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\untitled7\\src\\homework4\\fileTask8_2"), StandardCharsets.UTF_8));

            String line1;
            String line2;
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            while (((line1 = reader1.readLine()) != null) && ((line2 = reader2.readLine()) != null)) {
                System.out.println(line1);
                System.out.println(line2);
                list1.add(line1);
                list2.add(line2);
            }
            ArrayList<String> list3 = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
                        list3.add(list1.get(i));
                    }
                }
            }
            writer = new BufferedWriter(new OutputStreamWriter
                    (new FileOutputStream("C:\\untitled7\\src\\homework4\\fileTask8_3"), StandardCharsets.UTF_8));
            for (String str : list3) {
                writer.write(String.valueOf(str) + "\n");
            }

        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        } finally {
            try {
                reader1.close();
                reader2.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
