package com.origamisoftware.examples.di;

import java.math.BigDecimal;

 class HeavyDutyWheel extends AbstractBaseWheel {

    /**
     * Construct a wheel instance with the specified wheel diameter
     *
     * @param size - diameter of wheel
     *             <p>
     *             NOTE: package level scope
     */
    HeavyDutyWheel(BigDecimal size) {
        super(size);
    }
}
