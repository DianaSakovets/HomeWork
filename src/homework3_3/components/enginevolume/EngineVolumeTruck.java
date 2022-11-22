package homework3_3.components.enginevolume;

import homework3_3.components.enginevolume.EngineVolume;

public enum EngineVolumeTruck implements EngineVolume {
    ENGINE_VOLUME_4(2.2),
    ENGINE_VOLUME_5(2.8),
    ENGINE_VOLUME_6(3.5);
    private final double volume;

    EngineVolumeTruck(double volume) {
        this.volume = volume;
    }
}
