package com.origamisoftware.examples.di;

import java.math.BigDecimal;

/**
 * Models a fancy electric engine
 */
public class ElectricEngine implements Engine {

    /**
     *
     * @return the type of engine
     */
    public EngineType getType() {
        return EngineType.ELECTRIC;
    }

    /**
     *
     * @return how fast it goes!
     */
    public BigDecimal getMaxMilesPerHour() {
        return new BigDecimal(1000);
    }
}
