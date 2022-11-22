package homework3_3.components.wheelsize;

import homework3_3.components.wheelsize.WheelSize;

public enum WheelSizeSedan implements WheelSize {
    WHEEL_SIZE_1(13),
    WHEEL_SIZE_2(14),
    WHEEL_SIZE_3(15),
    WHEEL_SIZE_4(16),
    WHEEL_SIZE_5(17);
    private final int diameter;
    WheelSizeSedan(int diameter){
        this.diameter = diameter;
    }
}
