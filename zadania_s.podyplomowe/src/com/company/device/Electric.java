package com.company.device;

public class Electric extends Car {

    public Electric(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("podłączam do gniazdka");
        System.out.println("idę spać do domu");
    }
}