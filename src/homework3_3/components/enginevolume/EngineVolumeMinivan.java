package homework3_3.components.enginevolume;

import homework3_3.components.enginevolume.EngineVolume;

public enum EngineVolumeMinivan implements EngineVolume {
    ENGINE_VOLUME_1(1.2),
    ENGINE_VOLUME_2(1.4),
    ENGINE_VOLUME_3(1.6),
    ENGINE_VOLUME_4(2.2),
    ENGINE_VOLUME_5(2.8);
    private final double volume;
    EngineVolumeMinivan(double volume) {
        this.volume = volume;
    }
}
