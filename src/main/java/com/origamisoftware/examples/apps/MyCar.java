package com.origamisoftware.examples.apps;

import com.origamisoftware.examples.di.Vehicle;
import com.origamisoftware.examples.di.VehicleFactory;

import java.awt.*;

/**
 *  A simple application that makes a vehicle
 */
public class MyCar {

    public static void main(String[] args) {

        // todo - > use command line args to indicate which type of vehicle to make
        Vehicle myRide = VehicleFactory.getSportsCar(Color.RED);

        // todo - > use command line args to indicate which type of vehicle to make
        Vehicle myWorkHorse = VehicleFactory.getTruck(Color.RED);

    }

}
