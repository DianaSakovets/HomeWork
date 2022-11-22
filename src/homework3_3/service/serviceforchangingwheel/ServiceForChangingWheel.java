package homework3_3.service.serviceforchangingwheel;

import homework3_3.car.Car;
import homework3_3.components.wheelsize.WheelSize;



public class ServiceForChangingWheel {

    public Car changeWheel(Car car, WheelSize wheelSize) throws SuchWheelSizeAlreadyExists, NoSuchWheelSizeException {
        if (car.getWheelSize() != wheelSize) {
            car.setWheelSize(wheelSize);
        }else if(car.getWheelSize() == wheelSize){
            throw new SuchWheelSizeAlreadyExists("The car has the same wheel size");
        } else {
            throw new NoSuchWheelSizeException("This wheel size doesn't exist for this car");
        }
        return car;
    }
}
