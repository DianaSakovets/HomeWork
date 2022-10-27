package homework3_3.carshowroom;

import homework3_3.carfactory.CarFactory;
import homework3_3.service.Service;
import homework3_3.car.*;
import homework3_3.components.*;

public class CarShowroom {
    protected Service service;
    protected CarFactory carFactory;

    public Car makeAnOrderOfCar (Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume, String[] options){
        return carFactory.createCar(color, model, year, wheelSize, engineVolume, options);
    }

    public Car changeColor(Car car, Color color){
        return service.changeColor(car, color);
    }

    public Car changeWheel(Car car, WheelSize wheelSize){
        return service.changeWheel(car, wheelSize);
    }
    public void addOption(Car car, String option){
        service.addOption(car, option);
    }
    public void deleteOption(Car car, String option){
        service.deleteOption(car, option);
    }
}
