package homework3_3.service.serviceforchangingcolor;

import homework3_3.car.*;
import homework3_3.components.color.Color;


public class ServiceForChangingColor {

    public static Car changeColor(Car car, Color color) throws SuchColorAlreadyExists, NoSuchColorException {
        if (car.getColor() != color) {
            car.setColor(color);
        } else if(car.getColor() == color){
            throw new SuchColorAlreadyExists("The car has the same color");
        } else {
            throw new NoSuchColorException("This color doesn't exist for this car");
        }
        return car;
    }


//    public static void main(String[] args) {
//        CarTruck carTruck = new CarTruck(
//                ModelTruck.CITROEN,
//                ColorTruck.BLACK, 2008,
//                WheelSizeTruck.WHEEL_SIZE_7,
//                EngineVolumeTruck.ENGINE_VOLUME_5,
//                Set.of(Options.ABS),
//                FuelType.PETROL
//        );
//        changeColor(car);
//    }

}
