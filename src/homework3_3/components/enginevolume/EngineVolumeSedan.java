package homework3_3.components.enginevolume;

import homework3_3.components.enginevolume.EngineVolume;

public enum EngineVolumeSedan implements EngineVolume {
    ENGINE_VOLUME_1(1.2),
    ENGINE_VOLUME_2(1.4),
    ENGINE_VOLUME_3(1.6);
    private final double volume;
    EngineVolumeSedan(double volume) {
        this.volume = volume;
    }
}
