package com.origamisoftware.examples.di;

import java.math.BigDecimal;

class TruckEngine implements Engine {

    /**
     *
     * @return the kind of engine
     */
    public EngineType getType() {
        return EngineType.DIESEL;
    }

    /**
     *
     * @return maximum speed
     */
    public BigDecimal getMaxMilesPerHour() {
        return null;
    }
}
