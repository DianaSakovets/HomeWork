package homework4.task9_and_10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task9_10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream file = new FileOutputStream("C:\\untitled7\\src\\homework4\\fileTask9");
        ObjectOutput obj = new ObjectOutputStream(file);
        obj.writeObject(new Box(1, 2, 3));
        obj.writeObject(new Box(4, 5, 6));
        obj.writeObject(new Box(7, 8, 9));
        obj.writeObject(new Box(10, 11, 12));
        obj.writeObject(new Box(13, 14, 15));
        obj.close();

        FileInputStream file1 = new FileInputStream("C:\\untitled7\\src\\homework4\\fileTask9");
        ObjectInput obj1 = new ObjectInputStream(file1);
        Box box1 = (Box) obj1.readObject();
        Box box2 = (Box) obj1.readObject();
        Box box3 = (Box) obj1.readObject();
        Box box4 = (Box) obj1.readObject();
        Box box5 = (Box) obj1.readObject();
        obj1.close();
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);
        System.out.println(box5);
        box1.getVolume();
        box2.getVolume();
        box3.getVolume();
        box4.getVolume();
        box5.getVolume();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(box1.getVolume());
        list.add(box2.getVolume());
        list.add(box3.getVolume());
        list.add(box4.getVolume());
        list.add(box5.getVolume());
        Collections.sort(list);
        System.out.println(list);
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        FileOutputStream file2 = new FileOutputStream("C:\\untitled7\\src\\homework4\\fileTask9_2");
        ObjectOutput obj2 = new ObjectOutputStream(file2);
        obj2.writeInt(max);
        obj2.close();
    }
}


/*BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\untitled7\\src\\homework4\\fileTask9_2"), StandardCharsets.UTF_8));
            writer.write(max);
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
