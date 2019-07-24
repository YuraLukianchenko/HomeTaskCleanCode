package com.company.Planes;

import java.util.Objects;
import java.util.ResourceBundle;

public class PassengerPlane extends Plane{

    //=================FIELDS=================
    private int passengersCapacity;

    //=================CONSTRUCTORS=================
    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }
    public PassengerPlane(){

    }

    public PassengerPlane(ResourceBundle passengerPlaneBundle){
        this.setModel(passengerPlaneBundle.getString("model"));
        this.setMaxSpeed(Integer.valueOf(passengerPlaneBundle.getString("maxSpeed")));
        this.setMaxFlightDistance(Integer.valueOf(passengerPlaneBundle.getString("maxFlightDistance")));
        this.setMaxLoadCapacity(Integer.valueOf(passengerPlaneBundle.getString("maxLoadCapacity")));
    }


    //=================METHODS=================
    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

//    @Override
//    public String toString() {
//        return super.toString().replace("}",
//                ", passengersCapacity=" + passengersCapacity +
//                        '}');
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
