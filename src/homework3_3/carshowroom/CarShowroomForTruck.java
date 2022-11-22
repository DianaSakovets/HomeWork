package homework3_3.carshowroom;

import homework3_3.car.Car;
import homework3_3.car.CarTruck;
import homework3_3.carfactory.CarFactoryForTruck;
import homework3_3.components.FuelType;
import homework3_3.components.color.ColorTruck;
import homework3_3.components.enginevolume.EngineVolumeTruck;
import homework3_3.components.model.ModelTruck;
import homework3_3.components.option.Options;
import homework3_3.components.wheelsize.WheelSizeTruck;
import homework3_3.service.serviceforchangingcolor.NoSuchColorException;
import homework3_3.service.serviceforchangingcolor.ServiceForChangingColor;
import homework3_3.service.serviceforchangingcolor.SuchColorAlreadyExists;
import homework3_3.service.serviceforchangingwheel.NoSuchWheelSizeException;
import homework3_3.service.serviceforchangingwheel.ServiceForChangingWheel;
import homework3_3.service.serviceforchangingwheel.SuchWheelSizeAlreadyExists;
import homework3_3.service.serviceforoptions.NoSuchOptionException;
import homework3_3.service.serviceforoptions.ServiceForOptions;
import homework3_3.service.serviceforoptions.SuchOptionAlreadyExists;

import java.util.Set;

public class CarShowroomForTruck {
    protected ServiceForOptions serviceForOptions;
    protected ServiceForChangingColor serviceForChangingColor;
    protected ServiceForChangingWheel serviceForChangingWheel;
    protected CarFactoryForTruck carFactoryForTruck;

    public CarTruck makeAnOrderOfTruckCar(ModelTruck model, ColorTruck color, int year, WheelSizeTruck wheelSize, EngineVolumeTruck engineVolume, Set<Options> options, FuelType fuelType){
        return carFactoryForTruck.createCarTruck(model, color, year, wheelSize, engineVolume, options, fuelType);
    }
    public Car changeColor(CarTruck car, ColorTruck color) throws NoSuchColorException, SuchColorAlreadyExists {
        return serviceForChangingColor.changeColor(car, color);
    }

    public Car changeWheel(CarTruck car, WheelSizeTruck wheelSize) throws SuchWheelSizeAlreadyExists, NoSuchWheelSizeException {
        return serviceForChangingWheel.changeWheel(car, wheelSize);
    }
    public void addOption(CarTruck car, Options option) throws NoSuchOptionException, SuchOptionAlreadyExists {
        serviceForOptions.addOption(car, option);
    }
    public void deleteOption(CarTruck car, Options option) throws NoSuchOptionException {
        serviceForOptions.deleteOption(car, option);
    }
}
