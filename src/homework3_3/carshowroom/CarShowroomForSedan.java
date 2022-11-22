package homework3_3.carshowroom;

import homework3_3.car.Car;
import homework3_3.car.CarSedan;
import homework3_3.carfactory.CarFactoryForSedan;
import homework3_3.components.HeadlightType;
import homework3_3.components.color.ColorSedan;
import homework3_3.components.enginevolume.EngineVolumeSedan;
import homework3_3.components.model.ModelSedan;
import homework3_3.components.option.Options;
import homework3_3.components.wheelsize.WheelSizeSedan;
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

public class CarShowroomForSedan {
    protected ServiceForOptions serviceForOptions;
    protected ServiceForChangingColor serviceForChangingColor;
    protected ServiceForChangingWheel serviceForChangingWheel;
    protected CarFactoryForSedan carFactoryForSedan;

    public CarSedan makeAnOrderOfSedanCar(ModelSedan model, ColorSedan color, int year, WheelSizeSedan wheelSize, EngineVolumeSedan engineVolume, Set<Options> options, HeadlightType headlightType){
        return carFactoryForSedan.createCarSedan(model, color, year, wheelSize, engineVolume, options, headlightType);
    }

    public Car changeColor(CarSedan car, ColorSedan color) throws NoSuchColorException, SuchColorAlreadyExists {
        return serviceForChangingColor.changeColor(car, color);
    }

    public Car changeWheel(CarSedan car, WheelSizeSedan wheelSize) throws SuchWheelSizeAlreadyExists, NoSuchWheelSizeException {
        return serviceForChangingWheel.changeWheel(car, wheelSize);
    }
    public void addOption(CarSedan car, Options option) throws NoSuchOptionException, SuchOptionAlreadyExists {
        serviceForOptions.addOption(car, option);
    }
    public void deleteOption(CarSedan car, Options option) throws NoSuchOptionException {
        serviceForOptions.deleteOption(car, option);
    }
}
