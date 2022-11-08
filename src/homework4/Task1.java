package homework4;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("You need enter String");
            while (in.hasNextLine()) {
                System.out.println("You entered: " + in.nextLine());
                if (!in.hasNextLine()) {
                    throw new IOException("It's not a STRING");
                }
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
