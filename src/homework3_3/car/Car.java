package homework3_3.car;

import homework3_3.components.additionalcomponent.AdditionalComponent;
import homework3_3.components.model.Model;
import homework3_3.components.color.Color;
import homework3_3.components.wheelsize.WheelSize;
import homework3_3.components.enginevolume.EngineVolume;
import homework3_3.components.option.Options;

import java.util.Set;

public abstract class Car {
    public Color color;
    protected final Model model;
    protected final int year;
    protected WheelSize wheelSize;
    protected final EngineVolume engineVolume;
    protected Set<Options> options;
    protected AdditionalComponent additionalComponent;



    public Car(Model model, Color color, int year, WheelSize wheelSize, EngineVolume engineVolume, Set<Options> options, AdditionalComponent additionalComponent) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.options = options;
        this.additionalComponent = additionalComponent;
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }
    public Set<Options> getOptions() {
        return options;
    }

    public void setOptions(Set<Options> options) {
        this.options = options;
    }

    public AdditionalComponent getAdditionalComponent() {
        return additionalComponent;
    }

    public void setAdditionalComponent(AdditionalComponent additionalComponent) {
        this.additionalComponent = additionalComponent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", year=" + year +
                ", wheelSize=" + wheelSize +
                ", engineVolume=" + engineVolume +
                ", options=" + options +
                '}';
    }
}


