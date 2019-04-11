package com.origamisoftware.examples.di;

import java.awt.*;
import java.util.List;

/**
 * This class represents a Vehicle.
 *
 * A Vehicle can take many forms depending what components it is created with.
 *
 */
public class Vehicle
{
    private Engine engine;
    private List<Wheel> wheels;
    private Color color;
    private VehicleClassification vehicleClassification;

    enum VehicleClassification {
        CAR, TRUCK, SPORTS_CAR, SUV, BICYCLE, MOTOR_BIKE
    }

    /**
     * Construct a new Vehicle with the following attributes:
     *
     * @param engineValue - the type of engine in the vehicle
     * @param vehicleClassificationValue - the kind of vehicle
     * @param wheelsValue - the vehicle wheel(s)
     * @param colorValue - the vehicle's external color
     */
     Vehicle(Engine engineValue, VehicleClassification vehicleClassificationValue, List<Wheel> wheelsValue, Color colorValue) {
        this.engine = engineValue;
        this.vehicleClassification = vehicleClassificationValue;
        this.wheels = wheelsValue;
        this.color = colorValue;
    }

    // note the absents of setter methods - making this class immutable

    /**
     *
     * @return the engine that powers this vehicle
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     *
     * @return the wheel(s) this vehicle has. (
     */
    public List<Wheel> getWheels() {
        return wheels;
    }

    /**
     *
     * @return external color of vehicle
     */
    public Color getColor() {
        return color;
    }

    /**
     *
     * @return the type of the vehicle. e.g. SPORTS_CAR
     */
    public VehicleClassification getVehicleClassification() {
        return vehicleClassification;
    }
}
