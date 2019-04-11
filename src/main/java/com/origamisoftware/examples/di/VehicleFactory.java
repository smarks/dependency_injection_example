package com.origamisoftware.examples.di;

import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for make instances of Vehicles
 */
public class VehicleFactory {

    /**
     * Create a Truck with the specified color
     * @param color
     * @return a Vehicles instance that models a truck
     */
    public static Vehicle getTruck(Color color) {

        List<Wheel> wheels = new ArrayList<Wheel>(8);
        for (int count =0; count <= 7; count++){
            wheels.add(new HeavyDutyWheel(new BigDecimal(20)));
        }
        return new Vehicle(new TruckEngine(), Vehicle.VehicleClassification.TRUCK, wheels, color);
    }

    /**
     *
     * Create a Sports Car with the specified color
     * @param color
     * @return a Vehicles instance that models a sports car

     */
    public static Vehicle getSportsCar(Color color) {

        List<Wheel> wheels = new ArrayList<Wheel>(4);

        for (int count =0; count <= 7; count++){
            wheels.add(new AlloyWheel(new BigDecimal(18)));
        }
        return new Vehicle(new V8Engine(), Vehicle.VehicleClassification.SPORTS_CAR, wheels, color);
    }

    /**
     *
     * Create a Sports Car with the specified color
     * @param color
     * @return a Vehicles instance that models a sports car

     */
    public static Vehicle getTesla(Color color) {

        List<Wheel> wheels = new ArrayList<Wheel>(4);

        for (int count =0; count <= 7; count++){
            wheels.add(new AlloyWheel(new BigDecimal(18)));
        }
        return new Vehicle(new ElectricEngine(), Vehicle.VehicleClassification.SPORTS_CAR, wheels, color);
    }

}
