package classwork5;

import java.io.*;

public class Task6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:\\untitled7\\src\\classwork5\\file");
        ObjectOutput ops = new ObjectOutputStream(fos);
        ops.writeInt(123);
        ops.writeObject("today");
        ops.writeObject(new Box5(1, 2, 3));
        ops.close();
        FileInputStream fos1 = new FileInputStream("C:\\untitled7\\src\\classwork5\\file");
        ObjectInput ops1 = new ObjectInputStream(fos1);
        int i = ops1.readInt();
        String today = (String) ops1.readObject();
        Box5 box = (Box5) ops1.readObject();
        ops1.close();
        System.out.println(i);
        System.out.println(today);
        System.out.println(box);
    }
}
