package com.origamisoftware.examples.di;

import java.math.BigDecimal;

 abstract class AbstractBaseWheel implements Wheel {

    private BigDecimal diameter;

    /**
     * Construct a wheel instance with the specified wheel diameter
     * @param size - diameter of wheel
     *
     */
     AbstractBaseWheel(BigDecimal size){
        this.diameter = size;
    }

    /**
     *
     * @return the size of the wheel
     */
    public BigDecimal getDiameter() {
        return diameter;
    }
   
}
