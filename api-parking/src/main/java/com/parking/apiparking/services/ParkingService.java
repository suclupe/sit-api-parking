package com.parking.apiparking.services;

import com.parking.apiparking.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private List<Car> parkingLot;

    public ParkingService(){    //Constructor para inicializar esta lista
        this.parkingLot = new ArrayList<>();
    }
    // TODO:US 01: Como usuario, quiero poder ver la lista de todos los autos estacionados en el
    // parqueo, para poder tener una visión general del estado actual del estacionamiento.
    public List<Car> getAllCars(){
        return this.parkingLot;
    }
    // TODO:US 02: Como usuario quiero poder agregar un auto al parqueo, para poder estacionar mi vehiculo
    public void addCar(Car car){
        this.parkingLot.add(car);
    }

}
