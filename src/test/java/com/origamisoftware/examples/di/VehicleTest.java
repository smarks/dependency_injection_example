package com.origamisoftware.examples.di;


import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for  Vehicle.
 */
public class VehicleTest {


    @Test
    public void createTruck() {
        Vehicle truck = VehicleFactory.getTruck(Color.gray);
        assertEquals("Vehicle type matches", truck.getEngine().getType(), EngineType.DIESEL);
    }



}

