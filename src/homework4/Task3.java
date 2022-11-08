package homework4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("You need enter Digit");
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                if (in.hasNextInt()) {
                    int digit = in.nextInt();
                    System.out.println("You entered: " + digit);
                    list.add(digit);
                } else if (in.hasNextLine()) {
                    String  s = in.next();
                    if (s.equalsIgnoreCase("status")) {
                        Collections.sort(list);
                        for (Integer i : list) {
                            System.out.println(i);
                        }
                    } else if (s.equalsIgnoreCase("stop")) {
                        System.exit(0);
                    } else {
                        throw new IOException("Unavailable data type entered");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
