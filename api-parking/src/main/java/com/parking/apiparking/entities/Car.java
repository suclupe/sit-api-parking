package com.parking.apiparking.entities;

import java.time.LocalDateTime;

    public class Car {
    private String licensePlate;
    private String color;
    private LocalDateTime entryTime;

    public Car(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
    }
        public Car(String licensePlate, String color, LocalDateTime entryTime) {
            this.licensePlate = licensePlate;
            this.color = color;
            this.entryTime = entryTime;
        }
    }
