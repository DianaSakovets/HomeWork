package homework3_3.car;

import homework3_3.components.Assembling—ountry;
import homework3_3.components.model.ModelMinivan;
import homework3_3.components.color.ColorMinivan;
import homework3_3.components.wheelsize.WheelSizeMinivan;
import homework3_3.components.enginevolume.EngineVolumeMinivan;
import homework3_3.components.option.Options;


import java.util.Set;

public class CarMinivan extends Car {
    protected Assembling—ountry assembling—ountry;

    public CarMinivan(ModelMinivan model, ColorMinivan color, int year, WheelSizeMinivan wheelSize, EngineVolumeMinivan engineVolume, Set<Options> options, Assembling—ountry assembling—ountry) {
        super(model, color, year, wheelSize, engineVolume, options);
        this.assembling—ountry = assembling—ountry;
    }

    public Assembling—ountry getAssembling—ountry() {
        return assembling—ountry;
    }

    public void setAssembling—ountry(Assembling—ountry assembling—ountry) {
        this.assembling—ountry = assembling—ountry;
    }
}
