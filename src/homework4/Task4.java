package homework4;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws NoSuchElementException, IllegalStateException {
        int digit1 = enterDigit();
        int digit2 = enterDigit();
        char operation = enterOperation();
        int countingResult = count(digit1, operation, digit2);
        System.out.println("Counting result = " + countingResult);
        try {
            in.close();
        } catch (NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

    }

    public static int enterDigit() throws IllegalStateException, NoSuchElementException {
        System.out.println("You need enter Digit");
        int digit = 0;
        try {
            while (true) {
                if (in.hasNextInt()) {
                    digit = in.nextInt();
                    break;
                } else {
                    System.out.println("You entered wrong type. Please, enter right type(digit)");
                    in.next();
                }
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println("Error" + e.getMessage());
        }
        return digit;
    }


    public static char enterOperation() throws IllegalStateException, NoSuchElementException {
        char operation = ' ';
        System.out.println("You need enter Operation * or - or / or +");
        try {
            while (true) {
                if (in.hasNext()) {
                    operation = in.next().charAt(0);
                    break;
                } else {
                    System.out.println("You didn't enter Operation, you entered unavailable type");
                    in.next();
                }
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println("Error" + e.getMessage());
        }
        return operation;
    }

    public static int count(int digit1, char operation, int digit2) throws ArithmeticException {
        int counting = 0;
        if (operation == '+') {
            counting = digit1 + digit2;
        } else if (operation == '-') {
            counting = digit1 - digit2;
        } else if (operation == '/') {
            counting = digit1 / digit2;
        } else if (operation == '*') {
            counting = digit1 * digit2;
        } else {
            throw new ArithmeticException("Wrong type");
        }
        return counting;
    }

}
