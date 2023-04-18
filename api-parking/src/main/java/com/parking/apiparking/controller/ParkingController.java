package com.parking.apiparking.controller;

import java.time.LocalDateTime;

public class ParkingController {
    private String licensePlate;
    private String color;
    private LocalDateTime entryTime;

    public ParkingController(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
    }
}
