package homework3_3.carshowroom;

import homework3_3.car.Car;
import homework3_3.car.CarMinivan;
import homework3_3.car.CarSedan;
import homework3_3.car.CarTruck;
import homework3_3.carfactory.CarFactoryForMinivan;
import homework3_3.carfactory.CarFactoryForSedan;
import homework3_3.carfactory.CarFactoryForTruck;
import homework3_3.components.additionalcomponent.AdditionalComponent;
import homework3_3.components.additionalcomponent.Assembling—ountry;
import homework3_3.components.additionalcomponent.FuelType;
import homework3_3.components.additionalcomponent.HeadlightType;
import homework3_3.components.color.Color;
import homework3_3.components.color.ColorMinivan;
import homework3_3.components.color.ColorSedan;
import homework3_3.components.color.ColorTruck;
import homework3_3.components.enginevolume.EngineVolumeMinivan;
import homework3_3.components.enginevolume.EngineVolumeSedan;
import homework3_3.components.enginevolume.EngineVolumeTruck;
import homework3_3.components.model.ModelMinivan;
import homework3_3.components.model.ModelSedan;
import homework3_3.components.model.ModelTruck;
import homework3_3.components.option.Options;
import homework3_3.components.wheelsize.WheelSize;
import homework3_3.components.wheelsize.WheelSizeMinivan;
import homework3_3.components.wheelsize.WheelSizeSedan;
import homework3_3.components.wheelsize.WheelSizeTruck;
import homework3_3.service.serviceforchangingcolor.ServiceForChangingColor;
import homework3_3.service.serviceforchangingwheel.ServiceForChangingWheel;
import homework3_3.service.serviceforoptions.ServiceForOptions;

import java.util.Set;

public class CarShowroom {
    protected ServiceForOptions serviceForOptions;
    protected ServiceForChangingColor serviceForChangingColor;
    protected ServiceForChangingWheel serviceForChangingWheel;
    protected CarFactoryForTruck carFactoryForTruck;
    protected CarFactoryForSedan carFactoryForSedan;
    protected CarFactoryForMinivan carFactoryForMinivan;

    public CarTruck makeAnOrderOfTruckCar(ModelTruck model, ColorTruck color, int year, WheelSizeTruck wheelSize, EngineVolumeTruck engineVolume, Set<Options> options, AdditionalComponent additionalComponent){
        return (CarTruck) carFactoryForTruck.createCar(model, color, year, wheelSize, engineVolume, options, (FuelType) additionalComponent);
    }

    public CarSedan makeAnOrderOfSedanCar(ModelSedan model, ColorSedan color, int year, WheelSizeSedan wheelSize, EngineVolumeSedan engineVolume, Set<Options> options, AdditionalComponent additionalComponent){
        return (CarSedan) carFactoryForSedan.createCar(model, color, year, wheelSize, engineVolume, options, (HeadlightType)additionalComponent);
    }

    public CarMinivan makeAnOrderOfMinivanCar(ModelMinivan model, ColorMinivan color, int year, WheelSizeMinivan wheelSize, EngineVolumeMinivan engineVolume, Set<Options> options, AdditionalComponent additionalComponent){
        return (CarMinivan) carFactoryForMinivan.createCar(model, color, year, wheelSize, engineVolume, options, (Assembling—ountry) additionalComponent);
    }

    public void changeColor(Car car, Color color) {
        serviceForChangingColor.changeColor(car, color);
    }

    public void changeWheel(Car car, WheelSize wheelSize) {
        serviceForChangingWheel.changeWheel(car, wheelSize);
    }

    public void addOption(Car car, Options option) {
        serviceForOptions.addOption(car, option);
    }

    public void deleteOption(Car car, Options option) {
        serviceForOptions.deleteOption(car, option);
    }

}
