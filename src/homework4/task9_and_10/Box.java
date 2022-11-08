package homework4.task9_and_10;

import java.io.Serializable;

public class Box implements Serializable {
    private final int x;
    private final int y;
    private final int h;


    public Box(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }
    public int getVolume() {
        return this.x * this.y * this.h;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", h=" + h +
                '}';
    }
}
