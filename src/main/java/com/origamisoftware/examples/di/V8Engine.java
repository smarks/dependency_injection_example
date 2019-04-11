package com.origamisoftware.examples.di;

import java.math.BigDecimal;

class V8Engine implements Engine {

    /**
     *
     * @return the kind of engine
     */
    public EngineType getType() {
        return EngineType.GAS;
    }

    /**
     *
     * @return maximum speed
     */
    public BigDecimal getMaxMilesPerHour() {
        return null;
    }
}
