package homework3_3.service.serviceforchangingwheel;

import homework3_3.car.Car;
import homework3_3.car.CarMinivan;
import homework3_3.car.CarSedan;
import homework3_3.car.CarTruck;
import homework3_3.components.wheelsize.WheelSize;
import homework3_3.components.wheelsize.WheelSizeMinivan;
import homework3_3.components.wheelsize.WheelSizeSedan;
import homework3_3.components.wheelsize.WheelSizeTruck;


public class ServiceForChangingWheel {

    public static Car changeWheel(Car car, WheelSize wheelSize) {
        if (car.getWheelSize() != wheelSize
                && ((wheelSize instanceof WheelSizeMinivan && car instanceof CarMinivan)
                || (wheelSize instanceof WheelSizeSedan && car instanceof CarSedan)
                || (wheelSize instanceof WheelSizeTruck && car instanceof CarTruck))) {
            car.setWheelSize(wheelSize);
        } else if (car.getWheelSize() == wheelSize) {
            try {
                if ((wheelSize instanceof WheelSizeMinivan && car instanceof CarMinivan)
                        || (wheelSize instanceof WheelSizeSedan&& car instanceof CarSedan)
                        || (wheelSize instanceof WheelSizeTruck && car instanceof CarTruck)
                ) {
                    throw new SuchWheelSizeAlreadyExists("The car has the same wheel size");
                }
            } catch (SuchWheelSizeAlreadyExists e) {
                e.printStackTrace();
            }
        } else {
            try {
                if (!(wheelSize instanceof WheelSizeTruck) && car instanceof CarTruck
                        || !(wheelSize instanceof WheelSizeMinivan) && car instanceof CarMinivan
                        || !(wheelSize instanceof WheelSizeSedan) && car instanceof CarSedan) {
                    throw new NoSuchWheelSizeException("This wheel size doesn't exist for this car");
                }
            } catch (NoSuchWheelSizeException ex) {
                ex.printStackTrace();
            }
        }
        return car;
    }
}
