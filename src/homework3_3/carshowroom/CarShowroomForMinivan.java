package homework3_3.carshowroom;

import homework3_3.car.Car;
import homework3_3.car.CarMinivan;
import homework3_3.carfactory.CarFactoryForMinivan;
import homework3_3.components.Assembling—ountry;
import homework3_3.components.color.ColorMinivan;
import homework3_3.components.enginevolume.EngineVolumeMinivan;
import homework3_3.components.model.ModelMinivan;
import homework3_3.components.option.Options;
import homework3_3.components.wheelsize.WheelSizeMinivan;
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

public class CarShowroomForMinivan {
    protected ServiceForOptions serviceForOptions;
    protected ServiceForChangingColor serviceForChangingColor;
    protected ServiceForChangingWheel serviceForChangingWheel;
    protected CarFactoryForMinivan carFactoryForMinivan;

    public CarMinivan makeAnOrderOfMinivanCar(ModelMinivan model, ColorMinivan color, int year, WheelSizeMinivan wheelSize, EngineVolumeMinivan engineVolume, Set<Options> options, Assembling—ountry assembling—ountry){
        return carFactoryForMinivan.createCarMinivan(model, color, year, wheelSize, engineVolume, options, assembling—ountry);
    }

    public Car changeColor(CarMinivan car, ColorMinivan color) throws NoSuchColorException, SuchColorAlreadyExists {
        return serviceForChangingColor.changeColor(car, color);
    }

    public Car changeWheel(CarMinivan car, WheelSizeMinivan wheelSize) throws SuchWheelSizeAlreadyExists, NoSuchWheelSizeException {
        return serviceForChangingWheel.changeWheel(car, wheelSize);
    }
    public void addOption(CarMinivan car, Options option) throws NoSuchOptionException, SuchOptionAlreadyExists {
        serviceForOptions.addOption(car, option);
    }
    public void deleteOption(CarMinivan car, Options option) throws NoSuchOptionException {
        serviceForOptions.deleteOption(car, option);
    }
}
