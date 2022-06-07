package com.company.device;

import com.company.Saleable;

public abstract class Device implements Saleable {
    final public String model;
    final public String producer;
    final public Integer yearOfProduction;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "Awfawfawefawefawefargesrgiuehto3q87y";
    }

    public abstract void turnOn();
}