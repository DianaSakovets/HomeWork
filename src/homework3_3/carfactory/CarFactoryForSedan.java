package homework3_3.carfactory;

import homework3_3.car.CarSedan;
import homework3_3.components.model.ModelSedan;
import homework3_3.components.color.ColorSedan;
import homework3_3.components.wheelsize.WheelSizeSedan;
import homework3_3.components.enginevolume.EngineVolumeSedan;
import homework3_3.components.option.Options;
import homework3_3.components.HeadlightType;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CarFactoryForSedan {
    private final List<CarSedan> stockForSedan = new ArrayList<>();

    public CarFactoryForSedan(ModelSedan model, ColorSedan color, int year, WheelSizeSedan wheelSize, EngineVolumeSedan engineVolume, Set<Options> options, HeadlightType headlightType) {
        CarSedan carKia = new CarSedan(
                ModelSedan.KIA,
                ColorSedan.RED,
                2022,
                WheelSizeSedan.WHEEL_SIZE_3,
                EngineVolumeSedan.ENGINE_VOLUME_3,
                options,
                HeadlightType.LED_HEADLIGHTS
        );

        CarSedan carCitroenFirst = new CarSedan(
                ModelSedan.CITROEN,
                ColorSedan.BLACK,
                2020,
                WheelSizeSedan.WHEEL_SIZE_5,
                EngineVolumeSedan.ENGINE_VOLUME_1,
                options,
                HeadlightType.LED_HEADLIGHTS
        );

        CarSedan carCitroenSecond = new CarSedan(
                ModelSedan.CITROEN,
                ColorSedan.GOLD,
                2015,
                WheelSizeSedan.WHEEL_SIZE_3,
                EngineVolumeSedan.ENGINE_VOLUME_3,
                options,
                HeadlightType.LASER_HEADLIGHTS
        );

        stockForSedan.add(carKia);
        stockForSedan.add(carCitroenFirst);
        stockForSedan.add(carCitroenSecond);
    }

    public void getListOfModelsForSedan() {
        for (ModelSedan model : ModelSedan.values()) {
            System.out.println("SedanModel: " + model);
        }
        System.out.println("\n");
    }

    public void getListOfColorsForSedan() {
        for (ColorSedan color : ColorSedan.values()) {
            System.out.println("SedanColor: " + color);
        }
        System.out.println("\n");
    }

    public void getListOfEngineVolumesForSedan() {
        for (EngineVolumeSedan engineVolume : EngineVolumeSedan.values()) {
            System.out.println("SedanEngineVolume: " + engineVolume);
        }
        System.out.println("\n");
    }

    public void getListOfWheelsSizesForSedan() {
        for (WheelSizeSedan wheelSize : WheelSizeSedan.values()) {
            System.out.println("SedanWheelSize: " + wheelSize);
        }
        System.out.println("\n");
    }

    public CarSedan createCarSedan(ModelSedan model, ColorSedan color, int year, WheelSizeSedan wheelSize, EngineVolumeSedan engineVolume, Set<Options> options, HeadlightType headlightType) {
        for (CarSedan car : stockForSedan) {
            if (model == car.getModel()
                    && color == car.getColor()
                    && year == car.getYear()
                    && wheelSize == car.getWheelSize()
                    && engineVolume == car.getEngineVolume()
                    && headlightType == car.getHeadlightType()) {
                return car;
            }
            stockForSedan.remove(car);
        }
        return new CarSedan(model, color, year, wheelSize, engineVolume, options, headlightType);
    }
}
