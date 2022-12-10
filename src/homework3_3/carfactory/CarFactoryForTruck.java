package homework3_3.carfactory;


import homework3_3.car.Car;
import homework3_3.car.CarTruck;
import homework3_3.components.model.ModelTruck;
import homework3_3.components.color.ColorTruck;
import homework3_3.components.wheelsize.WheelSizeTruck;
import homework3_3.components.enginevolume.EngineVolumeTruck;
import homework3_3.components.option.Options;
import homework3_3.components.additionalcomponent.FuelType;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CarFactoryForTruck<A extends ModelTruck,
        B extends ColorTruck,
        C extends WheelSizeTruck,
        D extends EngineVolumeTruck,
        E extends FuelType
        >
        extends Factory<A, B, C, D, E >{
    private final List<CarTruck> stockForTruck = new ArrayList<>();

    public CarFactoryForTruck(ModelTruck model, ColorTruck color, int year, WheelSizeTruck wheelSize, EngineVolumeTruck engineVolume, Set<Options> options, FuelType fuelType) {
        CarTruck carKia = new CarTruck(
                ModelTruck.KIA,
                ColorTruck.BLACK,
                2022,
                WheelSizeTruck.WHEEL_SIZE_6,
                EngineVolumeTruck.ENGINE_VOLUME_5,
                options,
                FuelType.PETROL
        );

        CarTruck carAudi = new CarTruck(
                ModelTruck.AUDI,
                ColorTruck.BLACK,
                2015,
                WheelSizeTruck.WHEEL_SIZE_6,
                EngineVolumeTruck.ENGINE_VOLUME_4,
                options,
                FuelType.PETROL
        );

        CarTruck carCitroen = new CarTruck(
                ModelTruck.CITROEN,
                ColorTruck.PINK,
                2022,
                WheelSizeTruck.WHEEL_SIZE_7,
                EngineVolumeTruck.ENGINE_VOLUME_5,
                options,
                FuelType.DIESEL
        );

        stockForTruck.add(carKia);
        stockForTruck.add(carAudi);
        stockForTruck.add(carCitroen);
    }

    public void getListOfModelsForTruck() {
        for (ModelTruck model : ModelTruck.values()) {
            System.out.println("TruckModel: " + model);
        }
        System.out.println("\n");
    }

    public void getListOfColorsForTruck() {
        for (ColorTruck color : ColorTruck.values()) {
            System.out.println("TruckColor: " + color);
        }
        System.out.println("\n");
    }

    public void getListOfEngineVolumesForTruck() {
        for (EngineVolumeTruck engineVolume : EngineVolumeTruck.values()) {
            System.out.println("TruckEngineVolume: " + engineVolume);
        }
        System.out.println("\n");
    }

    public void getListOfWheelsSizesForTruck() {
        for (WheelSizeTruck wheelSize : WheelSizeTruck.values()) {
            System.out.println("TruckWheelSize: " + wheelSize);
        }
        System.out.println("\n");
    }


    @Override
    public Car createCar(A model, B color, int year, C wheelSize, D engineVolume, Set<Options> options, E additionalComponent) {
        for (CarTruck car : stockForTruck) {
            if (model == car.getModel()
                    && color == car.getColor()
                    && year == car.getYear()
                    && wheelSize == car.getWheelSize()
                    && engineVolume == car.getEngineVolume()
                    && (FuelType) additionalComponent == car.getAdditionalComponent()) {
                return car;
            }
            stockForTruck.remove(car);
        }
        return new CarTruck(model, color, year, wheelSize, engineVolume, options, additionalComponent);
    }
}
