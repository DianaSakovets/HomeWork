package homework3_3.components.wheelsize;

import homework3_3.components.wheelsize.WheelSize;

public enum  WheelSizeTruck implements WheelSize {
    WHEEL_SIZE_6(18),
    WHEEL_SIZE_7(19),
    WHEEL_SIZE_8(20);
    private final int diameter;
    WheelSizeTruck(int diameter){
        this.diameter = diameter;
    }
}
