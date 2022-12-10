package homework3_3.car;

import homework3_3.components.additionalcomponent.FuelType;
import homework3_3.components.model.ModelTruck;
import homework3_3.components.color.ColorTruck;
import homework3_3.components.wheelsize.WheelSizeTruck;
import homework3_3.components.enginevolume.EngineVolumeTruck;
import homework3_3.components.option.Options;


import java.util.Set;

public class CarTruck extends Car{
    protected FuelType fuelType;

    public CarTruck(ModelTruck model, ColorTruck color, int year, WheelSizeTruck wheelSize, EngineVolumeTruck engineVolume, Set<Options> options, FuelType fuelType) {
        super(model, color, year, wheelSize, engineVolume, options, fuelType);
    }


    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }


}
