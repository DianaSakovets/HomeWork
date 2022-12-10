package homework3_3.carfactory;

import homework3_3.car.Car;
import homework3_3.components.additionalcomponent.AdditionalComponent;
import homework3_3.components.color.Color;
import homework3_3.components.enginevolume.EngineVolume;
import homework3_3.components.model.Model;
import homework3_3.components.option.Options;
import homework3_3.components.wheelsize.WheelSize;

import java.util.Set;

public abstract class Factory <
        A extends Model,
        B extends Color,
        C extends WheelSize,
        D extends EngineVolume,
        E extends AdditionalComponent
        > {


    public abstract Car createCar(A model, B color, int year, C wheelSize, D engineVolume, Set<Options> options, E additionalComponent);

}