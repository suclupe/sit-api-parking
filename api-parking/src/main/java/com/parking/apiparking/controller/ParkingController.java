package com.parking.apiparking.controller;

import com.parking.apiparking.entities.Car; //Recuerda que Car esta en otro paquete
import com.parking.apiparking.services.ParkingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/parking") //parking = URL → http://dominio/parking
public class ParkingController {

    /*1° FORMA - Inyeccion de Dependencias → Instancias → NewParkingServices();

    private final ParkingService parkingService;
    public ParkingController(ParkingService _parkingService){
        this.parkingService = _parkingService;
    }
     2° Forma ↓
    */

    private ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    //GET = https://dominio/parking/car → obtener la lista de autos
    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCar(){
        return ResponseEntity.ok(this.parkingService.getAllCars());
    } @PostMapping ("/cars")
    public ResponseEntity<Car> addCar(Car car){
        this.parkingService.addCar(car);
        return new ResponseEntity<>(car, HttpStatus.CREATED);
    }
}
