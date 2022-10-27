package homework3_3.components;

public enum EngineVolume {
    ENGINE_VOLUME_1(1.2),
    ENGINE_VOLUME_2(1.4),
    ENGINE_VOLUME_3(1.6),
    ENGINE_VOLUME_4(2.2),
    ENGINE_VOLUME_5(2.8),
    ENGINE_VOLUME_6(3.5);
    private final double volume;
    EngineVolume(double volume) {
        this.volume = volume;
    }
}
