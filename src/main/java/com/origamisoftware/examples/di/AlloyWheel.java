package com.origamisoftware.examples.di;

import java.math.BigDecimal;

/**
 * A  sports car wheel
 */
 class AlloyWheel extends AbstractBaseWheel {
    private BigDecimal diameter;

    /**
     * Construct a wheel instance with the specified wheel diameter
     * @param size - the diameter of the wheel
     */
    public AlloyWheel(BigDecimal size){
        super(size);
    }

    /**
     *
     * @return the size of the wheel
     */
    public BigDecimal getDiameter() {
        return diameter;
    }

}
