package homework3_3.carfactory;

import homework3_3.car.Car;
import homework3_3.car.CarMinivan;
import homework3_3.components.model.ModelMinivan;
import homework3_3.components.color.ColorMinivan;
import homework3_3.components.wheelsize.WheelSizeMinivan;
import homework3_3.components.enginevolume.EngineVolumeMinivan;
import homework3_3.components.option.Options;
import homework3_3.components.additionalcomponent.Assembling—ountry;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CarFactoryForMinivan <
        A extends ModelMinivan,
        B extends ColorMinivan,
        C extends WheelSizeMinivan,
        D extends EngineVolumeMinivan,
        E extends Assembling—ountry
        >
        extends Factory<A, B, C, D, E >{
    private final List<CarMinivan> stockForMinivan = new ArrayList<>();

    public CarFactoryForMinivan(ModelMinivan model, ColorMinivan color, int year, WheelSizeMinivan wheelSize, EngineVolumeMinivan engineVolume, Set<Options> options, Assembling—ountry assembling—ountry) {
        CarMinivan carBMW = new CarMinivan(
                ModelMinivan.BMW,
                ColorMinivan.RED,
                2022,
                WheelSizeMinivan.WHEEL_SIZE_2,
                EngineVolumeMinivan.ENGINE_VOLUME_3,
                options,
                Assembling—ountry.GERMANY
        );

        CarMinivan carKia = new CarMinivan(
                ModelMinivan.KIA,
                ColorMinivan.BLACK,
                2021,
                WheelSizeMinivan.WHEEL_SIZE_3,
                EngineVolumeMinivan.ENGINE_VOLUME_4,
                options,
                Assembling—ountry.KOREA
        );

        CarMinivan carFord = new CarMinivan(
                ModelMinivan.FORD,
                ColorMinivan.WHITE,
                2020,
                WheelSizeMinivan.WHEEL_SIZE_2,
                EngineVolumeMinivan.ENGINE_VOLUME_3,
                options,
                Assembling—ountry.USA
        );

        stockForMinivan.add(carBMW);
        stockForMinivan.add(carKia);
        stockForMinivan.add(carFord);
    }

    public void getListOfModelsForMinivan() {
        for (ModelMinivan model : ModelMinivan.values()) {
            System.out.println("MinivanModel: " + model);
        }
        System.out.println("\n");
    }

    public void getListOfColorsForMinivan() {
        for (ColorMinivan color : ColorMinivan.values()) {
            System.out.println("MinivanColor: " + color);
        }
        System.out.println("\n");
    }

    public void getListOfEngineVolumesForMinivan() {
        for (EngineVolumeMinivan engineVolume : EngineVolumeMinivan.values()) {
            System.out.println("MinivanEngineVolume: " + engineVolume);
        }
        System.out.println("\n");
    }

    public void getListOfWheelsSizesForMinivan() {
        for (WheelSizeMinivan wheelSize : WheelSizeMinivan.values()) {
            System.out.println("MinivanWheelSize: " + wheelSize);
        }
        System.out.println("\n");
    }

    public Car createCar(A model, B color, int year, C wheelSize, D engineVolume, Set<Options> options, E additionalComponent) {
        for (CarMinivan car : stockForMinivan) {
            if (model == car.getModel()
                    && color == car.getColor()
                    && year == car.getYear()
                    && wheelSize == car.getWheelSize()
                    && engineVolume == car.getEngineVolume()
                    && (Assembling—ountry) additionalComponent == car.getAdditionalComponent()) {
                return car;
            }
            stockForMinivan.remove(car);
        }
        return new CarMinivan(model, color, year, wheelSize, engineVolume, options, additionalComponent);
    }
}
