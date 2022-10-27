package homework3_3.carfactory;

import homework3_3.car.Car;
import homework3_3.components.*;

public class CarFactory {
    protected Car[] stock;

    public CarFactory(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume, String[] options) {
        Car car1 = new Car(Color.BLACK, Model.BMW, 2015, WheelSize.WHEEL_SIZE_4, EngineVolume.ENGINE_VOLUME_3, options);
        Car car2 = new Car(Color.RED, Model.CITROEN, 2008, WheelSize.WHEEL_SIZE_3, EngineVolume.ENGINE_VOLUME_4, options);
        Car car3 = new Car(Color.GREEN, Model.GEELY, 2019, WheelSize.WHEEL_SIZE_5, EngineVolume.ENGINE_VOLUME_5, options);
        Car car4 = new Car(Color.GOLD, Model.AUDI, 2020, WheelSize.WHEEL_SIZE_6, EngineVolume.ENGINE_VOLUME_2, options);
        Car[] stock = {car1, car2, car3, car4};
    }

    public void getArrayOfModelsColorsEngineVolumesWheelSizes() {
        for (Model model : Model.values()) {
            System.out.println("Модель: " + model);
        }
        System.out.println("\n");
        for (Color color : Color.values()) {
            System.out.println("Цвет: " + color);
        }
        System.out.println("\n");
        for (EngineVolume engineVolume : EngineVolume.values()) {
            System.out.println("Объём двигателя: " + engineVolume);
        }
        System.out.println("\n");
        for (WheelSize wheelSize : WheelSize.values()) {
            System.out.println("Размер колёс: " + wheelSize);
        }
    }

    public Car createCar(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume, String[] options) {
        for (Car car : stock) {
            if (color == car.getColor()
                    && model == car.getModel()
                    && year == car.getYear()
                    && wheelSize == car.getWheelSize()
                    && engineVolume == car.getEngineVolume())
            {
                return car;
            }
        }
        return new Car(color, model, year, wheelSize, engineVolume, options);
    }
}
