package homework3_3.service;

import homework3_3.components.*;
import homework3_3.car.Car;


public class Service {
    public Car changeColor(Car car, Color color) {
        if (car.getColor() != color) {
            car.setColor(color);
        }
        return car;
    }

    public Car changeWheel(Car car, WheelSize wheelSize) {
        if (car.getWheelSize() != wheelSize) {
            car.setWheelSize(wheelSize);
        }
        return car;
    }

    public void addOption(Car car, String option) {
        String[] options = car.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (options[i] == null) {
                options[i] = option;
                break;
            }
        }
        System.out.println("Невозможно добавить опцию");
    }


    public void deleteOption(Car car, String option) {
        String[] options = car.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(option)) {
                options[i] = null;
                break;
            }
        }
        System.out.println("Невозможно удалить опцию");
    }
}

/*protected Car addOption(Car car, String option) {
        String[] options = car.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (options[i] == null) {
                options[i] = option;
                break;
            } else {
                System.out.println("Невозможно добавить опцию");
            }
            car.setOptions(options);
        }
        return car;
    }*/
