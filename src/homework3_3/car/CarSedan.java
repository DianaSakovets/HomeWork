package homework3_3.car;

import homework3_3.components.additionalcomponent.HeadlightType;
import homework3_3.components.model.ModelSedan;
import homework3_3.components.color.ColorSedan;
import homework3_3.components.wheelsize.WheelSizeSedan;
import homework3_3.components.enginevolume.EngineVolumeSedan;
import homework3_3.components.option.Options;


import java.util.Set;

public class CarSedan extends Car {
    protected HeadlightType headlightType;

    public CarSedan(ModelSedan model, ColorSedan color, int year, WheelSizeSedan wheelSize, EngineVolumeSedan engineVolume, Set<Options> options, HeadlightType headlightType) {
        super(model, color, year, wheelSize, engineVolume, options, headlightType);
    }

    public HeadlightType getHeadlightType() {
        return headlightType;
    }

    public void setHeadlightType(HeadlightType headlightType) {
        this.headlightType = headlightType;
    }

}
