package com.origamisoftware.examples.di;

import java.math.BigDecimal;

/**
 * Represents an Engine
 */
public interface Engine {

    /**
     *
     * @return the kind of engine
     */
    EngineType getType();

    /**
     *
     * @return maximum speed
     */
    BigDecimal getMaxMilesPerHour();

}
