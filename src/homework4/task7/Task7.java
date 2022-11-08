package homework4.task7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class Task7 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\untitled7\\src\\homework4\\fileTask7"), StandardCharsets.UTF_8));
            String line;
            ArrayList<String> list = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }


            writer = new BufferedWriter(new OutputStreamWriter
                    (new FileOutputStream("C:\\untitled7\\src\\homework4\\file2Task7"), StandardCharsets.UTF_8));
            Collections.reverse(list);
            for (String str : list) {
                writer.write(String.valueOf(str) + "\n");
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

