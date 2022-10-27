package homework3_3.car;

import homework3_3.components.Color;
import homework3_3.components.EngineVolume;
import homework3_3.components.Model;
import homework3_3.components.WheelSize;

import java.util.Arrays;

public class Car {
    protected Color color;
    protected final Model model;
    protected final int year;
    protected WheelSize wheelSize;
    protected final EngineVolume engineVolume;
    public static String[] options;

    public Car(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume, String[] options) {
        this.color =color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.options = options;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Model getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }
    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;

    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }

    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options){
        this.options  = options;
    }
    protected String[] addOption(String option) {
        for (int i = 0; i < options.length; i++) {
            if (options[i] == null) {
                options[i] = option;
                break;
            }
        }
        return options;
    }

    protected String[] deleteOption(String option) {
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(option)) {
                options[i] = null;
                break;
            }
        }
        return options;
    }
    public void print() {
        System.out.println(color + "\n" + model + "\n" + year + "\n" + wheelSize + "\n" + engineVolume + "\n" + (Arrays.toString(options)) + "\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", yearOfIssue=" + year +
                ", wheelSize=" + wheelSize +
                ", engineVolume=" + engineVolume +
                ", options=" + Arrays.toString(options) +
                '}';
    }
    public static void main(String[] args) {
        Car car = new Car(null, null, 3, null, null, options);
        System.out.println(car);
        car.addOption("p");
        System.out.println(car);
    }
}
