package com.company.device;

import com.company.creatures.Human;

import java.util.Objects;

public abstract class Car extends Device implements Rechargeable {
    public Double millage;
    public Double engineVolume;
    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    public void turnOn() {
        System.out.println("przekręcam kluczyk");
        System.out.println("modlę się");
        System.out.println("przeklinam");
        System.out.println("odpalił");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", millage=" + millage +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return car.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, millage, engineVolume, color, value);
    }

    @Override
    public void recharge() {
        System.out.println("podjedź na stacje");
        System.out.println("zacznij płakać");
        System.out.println("sprawdź stan konta");
        System.out.println("przemyśl to poważnie");
        System.out.println("zatankuj");
        System.out.println("płacz nadal");
        System.out.println("zapłać");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCar() != this) {
            throw new Exception("Sprzedawca nie ma samochodu");
        }
        if (buyer.cash < price) {
            throw new Exception("Kupujący nie ma kasy");
        }

        buyer.cash -= price;
        seller.cash += price;
        buyer.car = this;
        seller.car = null;
        System.out.println("Sprzedano samochód");
    }

    public abstract void refuel();
}