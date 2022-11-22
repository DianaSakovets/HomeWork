package homework3_3.components.wheelsize;

public enum WheelSizeMinivan implements WheelSize {
    WHEEL_SIZE_1(13),
    WHEEL_SIZE_2(14),
    WHEEL_SIZE_3(15);

    private final int diameter;
    WheelSizeMinivan(int diameter){
        this.diameter = diameter;
    }
}
