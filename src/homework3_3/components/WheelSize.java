package homework3_3.components;

public enum WheelSize {
    WHEEL_SIZE_1(13),
    WHEEL_SIZE_2(14),
    WHEEL_SIZE_3(15),
    WHEEL_SIZE_4(16),
    WHEEL_SIZE_5(17),
    WHEEL_SIZE_6(18),
    WHEEL_SIZE_7(19),
    WHEEL_SIZE_8(20);
    private final int diameter;
    WheelSize(int diameter){
        this.diameter = diameter;
    }
}
