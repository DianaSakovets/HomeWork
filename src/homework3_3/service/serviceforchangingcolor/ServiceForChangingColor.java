package homework3_3.service.serviceforchangingcolor;

import homework3_3.car.*;
import homework3_3.components.color.Color;
import homework3_3.components.color.ColorMinivan;
import homework3_3.components.color.ColorSedan;
import homework3_3.components.color.ColorTruck;


import java.util.Set;


public class ServiceForChangingColor {

    public static Car changeColor(Car car, Color color) {
        if (car.getColor() != color
                && ((color instanceof ColorMinivan && car instanceof CarMinivan)
                || (color instanceof ColorSedan && car instanceof CarSedan)
                || (color instanceof ColorTruck && car instanceof CarTruck))) {
            car.setColor(color);
        } else if (car.getColor() == color) {
            try {
                if ((color instanceof ColorMinivan && car instanceof CarMinivan)
                        || (color instanceof ColorSedan && car instanceof CarSedan)
                        || (color instanceof ColorTruck && car instanceof CarTruck)
                ) {
                    throw new SuchColorAlreadyExists("The car has the same color");
                }
            } catch (SuchColorAlreadyExists e) {
                e.printStackTrace();
            }
        } else {
            try {
                if (!(color instanceof ColorTruck) && car instanceof CarTruck
                        || !(color instanceof ColorMinivan) && car instanceof CarMinivan
                        || !(color instanceof ColorSedan) && car instanceof CarSedan) {
                    throw new NoSuchColorException("This color doesn't exist for this car");
                }
            } catch (NoSuchColorException ex) {
                ex.printStackTrace();
            }
        }
        return car;
    }

}


