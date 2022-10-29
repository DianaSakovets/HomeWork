package it_academy_tasks_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MarksWithIterator_ex41 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int numberOfStudents = 15;
        int count = 10;
        int maxMark = 0;
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            int random = RANDOM.nextInt(count);
            marks.add(random);
        }
        Iterator<Integer> iterator = marks.iterator();

        while (iterator.hasNext()) {
            int maxM = iterator.next();
            if (maxM > maxMark) {
                maxMark = maxM;
            }
        }
        System.out.println(marks);
        System.out.println(maxMark);
    }
}
