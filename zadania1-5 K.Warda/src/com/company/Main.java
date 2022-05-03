package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Animal cat = new Animal("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        Human kacper = new Human();

        kacper.setCar(new Car("bravo", "fiat"));
        kacper.isAlive = false;

        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet = dog;
        kacper.mobile = new Phone();

        kacper.mobile.model = "6s";
        kacper.mobile.producer = "apple";
        kacper.pet.feed();

        kacper.setCar(new Car("passat", "vw"));
        System.out.println(kacper.getCar().millage);


        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());


    }
}