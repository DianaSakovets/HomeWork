package it_academy_tasks_collections;

import java.util.ArrayList;
import java.util.Random;
//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

public class Marks_ex39 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int numberOfStudents = 15;
        int count = 10;
        int count2 = 4;
        ArrayList<Integer> marks = new ArrayList<>();
        ArrayList<Integer> badMarks = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
                int random = RANDOM.nextInt(count);
                marks.add(random);
                if(marks.get(i) <= count2){
                    badMarks.add(marks.get(i));
                }
            }

        System.out.println(marks);
        System.out.println(badMarks);
        marks.removeAll(badMarks);
        System.out.println(marks);
    }
}

