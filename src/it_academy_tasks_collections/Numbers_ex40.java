package it_academy_tasks_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// —оздать коллекцию, заполнить еЄ случайными целыми числами.
// ”далить повтор€ющиес€ числа.

public class Numbers_ex40 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int count = 10;
        ArrayList<Integer> numbers = new ArrayList<>();
        Set<Integer> recurringNumbers = new HashSet<>();
        for (int i = 0; i < count ; i++) {
                int random = RANDOM.nextInt(count);
                numbers.add(random);
                recurringNumbers.add(numbers.get(i));
        }
        System.out.println(numbers);
        System.out.println(recurringNumbers);
        numbers.clear();
        numbers.addAll(recurringNumbers);
        System.out.println(numbers);
    }
}
