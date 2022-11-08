package homework4;

import java.util.Scanner;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("You need enter Digit");
        int counter = 0;
        int sum = 0;
        int result = 0;
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                if (in.hasNextInt()) {
                    int digit = in.nextInt();
                    System.out.println("You entered: " + digit);
                    sum += digit;
                    counter++;
                } else if (in.hasNextLine() && in.next().equalsIgnoreCase("stop")) {
                        result = sum / counter;
                        System.out.println("Average of entered digits: "+result);
                        break;
                    } else {
                        throw new IOException("Unavailable data type entered");
                    }
                }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

